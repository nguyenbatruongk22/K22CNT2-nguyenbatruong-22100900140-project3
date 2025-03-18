package springmvc.com.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import springmvc.com.beans.HeThongCuaHang;
import springmvc.com.dao.HeThongCuaHangdao;

@Controller
public class HeThongCuaHangController {

    @Autowired
    private HeThongCuaHangdao heThongCuaHangdao;

    // Hiển thị danh sách cửa hàng
    @GetMapping("/hethongcuahang/hethongcuahanglist")
    public String list(Model model) {
        List<HeThongCuaHang> list = heThongCuaHangdao.getAll();
        model.addAttribute("heThongCuaHangList", list);
        return "hethongcuahang/hethongcuahanglist";
    }

    // Hiển thị form thêm cửa hàng
    @GetMapping("/hethongcuahang/hethongcuahangadd")
    public String showAddForm(Model model) {
        model.addAttribute("command", new HeThongCuaHang());
        return "hethongcuahang/hethongcuahangadd"; // JSP: /WEB-INF/views/hethongcuahang/add.jsp
    }

    // Lưu cửa hàng mới
    @PostMapping("/hethongcuahang/save")
    public String save(@ModelAttribute("command") HeThongCuaHang ht) {
        heThongCuaHangdao.save(ht);
        return "redirect:/hethongcuahang/hethongcuahanglist";
    }

 // Hiển thị form chỉnh sửa cửa hàng
    @GetMapping("/hethongcuahang/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        HeThongCuaHang ht = heThongCuaHangdao.getById(id);
        model.addAttribute("command", ht);
        return "hethongcuahang/hethongcuahangedit"; // JSP: /WEB-INF/views/hethongcuahang/edit.jsp
    }

    // Lưu chỉnh sửa cửa hàng
    @PostMapping("/hethongcuahang/editsave")
    public String editsave(@ModelAttribute("command") HeThongCuaHang ht) {
        heThongCuaHangdao.update(ht);
        return "redirect:/hethongcuahang/hethongcuahanglist";
    }

    // Xóa cửa hàng
    @GetMapping("/hethongcuahang/delete/{id}")
    public String delete(@PathVariable int id) {
        heThongCuaHangdao.delete(id);
        return "redirect:/hethongcuahang/hethongcuahanglist";
    }
}

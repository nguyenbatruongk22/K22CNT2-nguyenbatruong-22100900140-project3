package springmvc.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import springmvc.com.beans.ThucDon;
import springmvc.com.dao.ThucDondao;

import java.util.List;

@Controller
@RequestMapping("/thucdon") // Nhóm API liên quan đến thực đơn
public class ThucDonController {

    @Autowired
    private ThucDondao thucDonDao;

    // Hiển thị danh sách thực đơn
    @GetMapping()
    public String hienThiThucDon(Model model) {
        List<ThucDon> thucDonList = thucDonDao.getAll();
        model.addAttribute("thucDonList", thucDonList);
        return "thucdonlist"; // Trả về JSP: /WEB-INF/views/thucdon/list.jsp
    }

    // Hiển thị form thêm món ăn
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("thucDon", new ThucDon()); // Đảm bảo có dòng này
        return "thucdonadd"; // Trả về trang JSP
    }


    // Lưu món ăn mới
    @PostMapping("/saveThucDon")
    public String save(@ModelAttribute("thucDon") ThucDon td, RedirectAttributes redirectAttributes) {
        if (td.getLoai() == null || td.getLoai().isEmpty()) {
            redirectAttributes.addFlashAttribute("error", "Vui lòng chọn loại món ăn!");
            return "redirect:/thucdon/add";
        }

        thucDonDao.save(td);
        return "redirect:/thucdon"; 
    }


    // Hiển thị form chỉnh sửa món ăn
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        ThucDon td = thucDonDao.getById(id);
        model.addAttribute("command", td);
        return "thucdonedit"; // Trả về JSP: /WEB-INF/views/thucdon/edit.jsp
    }

    // Lưu chỉnh sửa món ăn
    @PostMapping("/editsave")
    public String editsave(@ModelAttribute("command") ThucDon td) {
        thucDonDao.update(td);
        return "redirect:/thucdonlist";
    }

    // Xóa món ăn
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        thucDonDao.delete(id);
        return "redirect:/thucdonlist";
    }

    // Hiển thị menu
    @GetMapping("/menu")
    public String showMenu() {
        return "menu";
    }

    // Giới thiệu
    @GetMapping("/gioithieu")
    public String showGioiThieu() {
        return "gioithieu";
    }

    // Dịch vụ
    @GetMapping("/dichvu")
    public String showDichVu(Model model) {
        List<ThucDon> thucDonList = thucDonDao.getAll();
        model.addAttribute("thucDonList", thucDonList);
        return "dichvu"; // Trả về JSP: /WEB-INF/views/dichvu.jsp
    }
}
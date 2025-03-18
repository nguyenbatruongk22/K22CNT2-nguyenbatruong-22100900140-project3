package springmvc.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import springmvc.com.beans.KhuyenMai;
import springmvc.com.dao.KhuyenMaidao;

import java.util.List;

@Controller
@RequestMapping("/khuyenmai") // Định nghĩa tiền tố chung cho các đường dẫn
public class KhuyenMaiController {

    @Autowired
    private KhuyenMaidao khuyenMaidao;

    // 🏷 Hiển thị danh sách khuyến mãi
    @GetMapping()
    public String hienThiKhuyenMai(Model model) {
        List<KhuyenMai> khuyenMaiList = khuyenMaidao.getAll(); // Lấy từ database
        model.addAttribute("khuyenMaiList", khuyenMaiList);
        return "khuyenmailist"; // Trả về view /WEB-INF/views/khuyenmai/list.jsp
    }

    // 🏷 Hiển thị form thêm khuyến mãi
    @GetMapping("/add")
    public String hienThiFormThem(Model model) {
        model.addAttribute("command", new KhuyenMai());
        return "khuyenmaiadd"; // Trả về view add.jsp
    }

    // 🏷 Xử lý thêm khuyến mãi
    @PostMapping("/save")
    public String luuKhuyenMai(@ModelAttribute("command") KhuyenMai km) {
        khuyenMaidao.save(km);
        return "redirect:/khuyenmailist";
    }

    // 🏷 Hiển thị form chỉnh sửa
    @GetMapping("/edit/{id}")
    public String hienThiFormSua(@PathVariable int id, Model model) {
        KhuyenMai km = khuyenMaidao.getById(id);
        model.addAttribute("command", km);
        return "khuyenmaiedit";
    }

    // 🏷 Lưu chỉnh sửa khuyến mãi
    @PostMapping("/update")
    public String capNhatKhuyenMai(@ModelAttribute("command") KhuyenMai km) {
        khuyenMaidao.update(km);
        return "redirect:/khuyenmailist";
    }

    // 🏷 Xóa khuyến mãi
    @GetMapping("/delete/{id}")
    public String xoaKhuyenMai(@PathVariable int id) {
        khuyenMaidao.delete(id);
        return "redirect:/khuyenmailist";
    }
}

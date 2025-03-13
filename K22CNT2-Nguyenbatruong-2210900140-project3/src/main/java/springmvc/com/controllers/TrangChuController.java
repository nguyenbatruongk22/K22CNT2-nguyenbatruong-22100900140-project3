package springmvc.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrangChuController {
    
    @GetMapping("/") // Điều hướng trang chủ
    public String trangChu(Model model) {
        model.addAttribute("title", "Highlands Coffee - Trang Chủ");
        return "index"; // Trả về giao diện index.jsp
    }
}

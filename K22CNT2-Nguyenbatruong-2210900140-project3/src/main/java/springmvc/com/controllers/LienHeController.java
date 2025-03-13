package springmvc.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.com.beans.LienHe;

@Controller
public class LienHeController {

    @GetMapping("/lienhe")
    public String hienThiLienHeForm() {
        return "lienhe"; // Trả về trang liên hệ
    }

    @PostMapping("/lienhe")
    public String xuLyLienHe(@RequestParam("hoTen") String hoTen,
                             @RequestParam("email") String email,
                             @RequestParam("soDienThoai") String soDienThoai,
                             @RequestParam("noiDung") String noiDung,
                             Model model) {

        LienHe thongTinLienHe = new LienHe(hoTen, email, soDienThoai, noiDung);
        model.addAttribute("thongTinLienHe", thongTinLienHe);
        model.addAttribute("message", "Cảm ơn bạn đã liên hệ! Chúng tôi sẽ phản hồi sớm nhất.");

        return "lienhe";
    }
}

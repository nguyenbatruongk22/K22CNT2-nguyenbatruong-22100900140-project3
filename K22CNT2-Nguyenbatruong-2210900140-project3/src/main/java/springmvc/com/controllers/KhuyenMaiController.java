package springmvc.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import springmvc.com.beans.KhuyenMai;

import java.util.ArrayList;
import java.util.List;

@Controller
public class KhuyenMaiController {

    @GetMapping("/khuyenmai")
    public String hienThiKhuyenMai(Model model) {
        List<KhuyenMai> khuyenMaiList = new ArrayList<>();
        khuyenMaiList.add(new KhuyenMai("Mua 1 Tặng 1", "mua1tang1.png", "Áp dụng khi mua cà phê phin sữa đá.", "01/03/2024", "31/03/2024"));
        khuyenMaiList.add(new KhuyenMai("Giảm 20% Toàn Bộ Menu", "giam20.png", "Ưu đãi đặc biệt vào thứ 4 hàng tuần.", "01/03/2024", "30/06/2024"));
        khuyenMaiList.add(new KhuyenMai("Miễn Phí Giao Hàng", "mienphigiaohang.png", "Đơn hàng từ 100.000đ trở lên.", "01/04/2024", "31/12/2024"));

        model.addAttribute("khuyenMaiList", khuyenMaiList);
        return "khuyenmai"; // Giao diện JSP
    }
}

package springmvc.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import springmvc.com.beans.HeThongCuaHang;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HeThongCuaHangController {

    @GetMapping("/hethongcuahang")
    public String hienThiCuaHang(Model model) {
        List<HeThongCuaHang> cuaHangList = new ArrayList<>();
        cuaHangList.add(new HeThongCuaHang("Highlands Coffee Nguyễn Du", "42 Nguyễn Du, Quận 1, TP.HCM", "0123 456 789", "nguyendu.jpg"));
        cuaHangList.add(new HeThongCuaHang("Highlands Coffee Landmark 81", "720A Điện Biên Phủ, Bình Thạnh, TP.HCM", "0987 654 321", "landmark81.jpg"));
        cuaHangList.add(new HeThongCuaHang("Highlands Coffee Cầu Giấy", "32 Cầu Giấy, Hà Nội", "0345 678 901", "caugiay.jpg"));

        model.addAttribute("cuaHangList", cuaHangList);
        return "hethongcuahang"; // Trả về trang JSP
    }
}

package springmvc.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import springmvc.com.beans.ThucDon;
import springmvc.com.dao.ThucDondao;

import java.util.List;

@Controller
public class ThucDonController {

    @Autowired
    private ThucDondao thucDonDao;

    @GetMapping("/thucdon")
    public String hienThiThucDon(Model model) {
        List<ThucDon> thucDonList = thucDonDao.getAll(); // Lấy dữ liệu từ DB
        model.addAttribute("thucDonList", thucDonList);
        return "index"; // Chuyển về trang index.jsp
    }
}

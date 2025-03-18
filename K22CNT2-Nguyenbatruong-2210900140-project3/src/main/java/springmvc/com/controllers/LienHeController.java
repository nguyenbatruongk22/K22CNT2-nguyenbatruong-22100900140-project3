package springmvc.com.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import springmvc.com.beans.LienHe;
import springmvc.com.dao.LienHedao;

@Controller
public class LienHeController {

    @Autowired
    private LienHedao lienHedao;

    // Hiển thị danh sách liên hệ
    @GetMapping("/lienhe")
    public String list(Model model) {
        List<LienHe> list = lienHedao.getAll();
        model.addAttribute("lienHeList", list);
        return "lienhelist"; // JSP: /WEB-INF/views/lienhe/lienhelist.jsp
    }

    // Hiển thị form thêm liên hệ
    @GetMapping("/lienhe/lienheadd")
    public String showAddForm(Model model) {
        model.addAttribute("command", new LienHe());
        return "lienheadd"; // JSP: /WEB-INF/views/lienhe/lienheadd.jsp
    }

    // Lưu liên hệ mới
    @PostMapping("/lienhe/save")
    public String save(@ModelAttribute("command") LienHe lh) {
        lienHedao.save(lh);
        return "redirect:/lienhelist";
    }

    // Hiển thị form chỉnh sửa liên hệ
    @GetMapping("/lienhe/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        LienHe lh = lienHedao.getById(id);
        model.addAttribute("command", lh);
        return "lienheedit"; // JSP: /WEB-INF/views/lienhe/lienheedit.jsp
    }

    // Lưu chỉnh sửa liên hệ
    @PostMapping("/lienhe/editsave")
    public String editsave(@ModelAttribute("command") LienHe lh) {
        lienHedao.update(lh);
        return "redirect:/lienhe";
    }

    // Xóa liên hệ
    @GetMapping("/lienhe/delete/{id}")
    public String delete(@PathVariable int id) {
        lienHedao.delete(id);
        return "redirect:/lienhe";
    }
}

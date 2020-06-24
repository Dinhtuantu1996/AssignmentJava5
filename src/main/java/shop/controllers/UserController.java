package shop.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import shop.entity.Mail;
import shop.entity.SanPham;
import shop.entity.TaiKhoan;
import shop.service.MailService;
import shop.service.SanPhamService;
import shop.service.TaiKhoanService;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;


@Controller
public class UserController {

    @Autowired
    private MailService mailService;

    @Autowired
    private TaiKhoanService taiKhoanService;

    @Autowired
    private SanPhamService sanPhamService;


    @RequestMapping("/index")
    public String index(Model model) {
        return "/index";
    }


    @RequestMapping("/contact")
    public String create(Model model) {
        model.addAttribute("mail", new Mail());
        return "/contact";
    }


    @RequestMapping(value = "/contact/save", method = RequestMethod.POST)
    public String save(@Validated Mail id, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            redirect.addFlashAttribute("successMessage", "Có lỗi gửi đi!");
            return "/contact";
        }
        mailService.saveMail(id);
        redirect.addFlashAttribute("successMessage", "Gửi thành công!");
        return "redirect:/contact";
    }


    @RequestMapping("/about")
    public String about(Model model) {
        return "about";
    }

    @RequestMapping("/blog")
    public String blog(Model model) {
        return "blog";

    }

    @RequestMapping("/login")

    public String login(Model model) {
        return "login";
    }


    @RequestMapping(value = "/checklogin", method = RequestMethod.POST)
    public String checklogin(ModelMap model, @RequestParam("username") String username, @RequestParam("password") String password, HttpSession session) {
        if (taiKhoanService.checklogin(username, password, session)) {
            System.out.print("Đăng nhập thành công");
            return "redirect:/admin/index";
        } else {
            System.out.print("Đăng nhập thất bại");
            model.addAttribute("message", "Bạn nhập sai thông tin đăng nhập");
        }
        return "/Login";

    }


    @RequestMapping("/register")
    public String register(Model model) {
        model.addAttribute("taikhoan", new TaiKhoan());
        return "/register";

    }

    @RequestMapping(value = "/saveTK", method = RequestMethod.POST)
    public String save(@Validated TaiKhoan id, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "/register";
        }
        taiKhoanService.saveUser(id);
        redirect.addFlashAttribute("message", "Tài khoản đăng kí thành công! Hãy đăng nhập ngay");
        return "redirect:/login";
    }


    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("username");
        session.removeAttribute("vaitro");
        return "redirect:/login";
    }


    @RequestMapping("/shoplist")
    public String shoplist(Model model) {
        List<SanPham> users = sanPhamService.getAllSP();
        model.addAttribute("listsanpham", users);
        return "/shoplist";
    }

    @RequestMapping(value = "/infoSP", method = RequestMethod.GET)
    public String editsp(@RequestParam("id") String id, Model model) {
        Optional<SanPham> userEdit = sanPhamService.findSPById(id);
        userEdit.ifPresent(user -> model.addAttribute("sanpham", user));
        return "/info";
    }


    @RequestMapping("/cart")
    public String cart(Model model) {
        return "/cart";
    }


    @RequestMapping(value = "/showaccount", method = RequestMethod.GET)
    public String account(@RequestParam("id") String id, Model model) {
        Optional<TaiKhoan> userEdit = taiKhoanService.findUserById(id);
        userEdit.ifPresent(user -> model.addAttribute("taikhoan", user));
        return "/account";

    }
}



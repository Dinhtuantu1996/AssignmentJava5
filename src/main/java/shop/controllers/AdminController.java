package shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import shop.entity.*;
import shop.service.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Controller
@RequestMapping("/admin")
public class AdminController {


    @Autowired
    private TaiKhoanService taikhoanService;

    @Autowired
    private MailService mailService;

    @Autowired
    private LoaiSPService loaiSPService;

    @Autowired
    private SanPhamService sanPhamService;

    @Autowired
    private HoaDonService hoaDonService;

    @Autowired
    private HoaDonCTService hoaDonCTService;

    @RequestMapping("/index")
    public String index(Model model, HttpSession session) {
        try {
            if (session.getAttribute("vaitro").equals(true)) {
                return "/admin/index";
            }
            return "redirect:/index";
        } catch (Exception e) {
            model.addAttribute("message", "Hãy đăng nhập lại ");
            return "redirect:/login";
        }

    }

///////////////Taikhoan///////////////////

    @RequestMapping("/danhsachtaikhoan")
    public String ds(Model model, HttpSession session) {
        try {
            if (session.getAttribute("vaitro").equals(true)) {
                List<TaiKhoan> users = taikhoanService.getAllUser();
                model.addAttribute("listtaikhoan", users);
                return "admin/danhsachtaikhoan";
            }
            return "redirect:/index";
        } catch (Exception e) {
            return "redirect:/login";
        }
    }

    @RequestMapping("/danhsachcttaikhoan")
    public String dsct(Model model, HttpSession session) {
        try {
            if (session.getAttribute("vaitro").equals(true)) {
                List<TaiKhoan> users = taikhoanService.getAllUser();
                model.addAttribute("listtaikhoan", users);
                return "admin/danhsachcttaikhoan";
            }
            return "redirect:/index";
        } catch (Exception e) {
            return "redirect:/login";
        }
    }


    @RequestMapping(value = "/themtaikhoan", method = RequestMethod.GET)
    public String create(Model model, HttpSession session) {
        try {
            if (session.getAttribute("vaitro").equals(true)) {
                model.addAttribute("taikhoan", new TaiKhoan());
                return "admin/themtaikhoan";
            }
            return "redirect:/index";
        } catch (Exception e) {
            return "redirect:/login";
        }
    }

    @GetMapping("/searchTK")
    public String search(@RequestParam("term") String term, Model model) {
        if (StringUtils.isEmpty(term)) {
            return "redirect:/admin/danhsachtaikhoan";
        }
        model.addAttribute("listtaikhoan", taikhoanService.search(term));
        return "admin/danhsachtaikhoan";
    }

    @RequestMapping(value = "/saveTK", method = RequestMethod.POST)
    public String save(@Valid TaiKhoan id, @RequestParam("file") MultipartFile file, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "/admin/themtaikhoan";
        }
        Path path = Paths.get("D:\\Java5\\shopweb\\src\\main\\resources\\static\\img/");
        try {
            InputStream inputStream = file.getInputStream();
            Files.copy(inputStream, path.resolve(Objects.requireNonNull(file.getOriginalFilename())), StandardCopyOption.REPLACE_EXISTING);
            id.setImg(file.getOriginalFilename().toLowerCase());
        } catch (Exception e) {
            e.printStackTrace();
        }

        taikhoanService.saveUser(id);
        redirect.addFlashAttribute("successMessage", "Tài khoản lưu thành công!");
        return "redirect:/admin/danhsachtaikhoan";

    }


    @RequestMapping(value = "/editTK", method = RequestMethod.GET)
    public String editUser(@RequestParam("id") String id, Model model) {
        Optional<TaiKhoan> userEdit = taikhoanService.findUserById(id);
        userEdit.ifPresent(user -> model.addAttribute("taikhoan", user));
        return "admin/themtaikhoan";
    }

    @RequestMapping(value = "/deleteTK", method = RequestMethod.GET)
    public String deleteUser(@RequestParam("id") String id, Model model, RedirectAttributes redirect) {
        taikhoanService.deleteUser(id);
        redirect.addFlashAttribute("successMessage", "Xóa thành công tài khoản");
        return "redirect:/admin/danhsachtaikhoan";
    }

///////////////Mail///////////////////

    @RequestMapping("/mail")
    public String mail(Model model, HttpSession session) {
        try {
            if (session.getAttribute("vaitro").equals(true)) {
                List<Mail> mail = mailService.getAllMail();
                model.addAttribute("listmail", mail);
                return "admin/mail";
            }
            return "redirect:/index";
        } catch (Exception e) {
            return "redirect:/login";
        }
    }

    @RequestMapping(value = "/deleteMail", method = RequestMethod.GET)
    public String deletemail(@RequestParam("id") Integer id, Model model, RedirectAttributes redirect) {
        mailService.deleteMail(id);
        redirect.addFlashAttribute("successMessage", "Xóa thành công mail");
        return "redirect:/admin/mail";
    }

    @GetMapping("/searchMail")
    public String searchMail(@RequestParam("term") String term, Model model) {
        if (StringUtils.isEmpty(term)) {
            return "redirect:/admin/Mail";
        }
        model.addAttribute("listmail", mailService.search(term));
        return "admin/Mail";
    }


///////////////LoaiSP///////////////////

    @RequestMapping("/danhsachloaisp")
    public String dslsp(Model model, HttpSession session) {
        try {
            if (session.getAttribute("vaitro").equals(true)) {
                List<LoaiSP> loaisp = loaiSPService.getAllLoaiSP();
                model.addAttribute("listloaisp", loaisp);
                return "admin/danhsachloaisp";
            }
            return "redirect:/index";
        } catch (Exception e) {
            return "redirect:/login";
        }
    }

    @RequestMapping(value = "/themloaisp", method = RequestMethod.GET)
    public String themloaisp(Model model, HttpSession session) {
        try {
            if (session.getAttribute("vaitro").equals(true)) {
                model.addAttribute("loaisp", new LoaiSP());
                return "admin/themloaisp";
            }
            return "redirect:/index";
        } catch (Exception e) {
            return "redirect:/login";
        }
    }

    @RequestMapping(value = "/saveLSP", method = RequestMethod.POST)
    public String save(@Valid LoaiSP id, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "/admin/themloaisp";
        }
        loaiSPService.saveLoaiSP(id);
        redirect.addFlashAttribute("successMessage", "Lưu thành công!");
        return "redirect:/admin/danhsachloaisp";
    }

    @RequestMapping(value = "/editLSP", method = RequestMethod.GET)
    public String editloaisp(@RequestParam("id") String id, Model model) {
        Optional<LoaiSP> userEdit = loaiSPService.findLoaiSPById(id);
        userEdit.ifPresent(user -> model.addAttribute("loaisp", user));
        return "admin/themloaisp";
    }

    @RequestMapping(value = "/deleteLSP", method = RequestMethod.GET)
    public String deleteloaisp(@RequestParam("id") String id, Model model, RedirectAttributes redirect) {
        loaiSPService.deleteLoaiSP(id);
        redirect.addFlashAttribute("successMessage", "Xóa thành công");
        return "redirect:/admin/danhsachloaisp";
    }

    ///////////////SanPham///////////////////


    @RequestMapping("/danhsachsanpham")
    public String dssp(Model model, HttpSession session) {
        try {
            if (session.getAttribute("vaitro").equals(true)) {
                List<SanPham> users = sanPhamService.getAllSP();
                model.addAttribute("listsanpham", users);
                return "admin/danhsachsanpham";
            }
            return "redirect:/index";
        } catch (Exception e) {
            return "redirect:/login";
        }
    }

    @RequestMapping("/themsanpham")
    public String tsp(Model model, HttpSession session) {
        try {
            if (session.getAttribute("vaitro").equals(true)) {
                model.addAttribute("sanpham", new SanPham());
                List<LoaiSP> loaisp = loaiSPService.getAllLoaiSP();
                model.addAttribute("list", loaisp);

                return "admin/themsanpham";
            }
            return "redirect:/index";
        } catch (Exception e) {
            return "redirect:/login";
        }
    }


    @GetMapping("/searchSP")
    public String searchSP(@RequestParam("term") String term, Model model) {
        if (StringUtils.isEmpty(term)) {
            return "redirect:/admin/danhsachsanpham";
        }
        model.addAttribute("listtaikhoan", sanPhamService.search(term));
        return "admin/danhsachsanpham";
    }

    @RequestMapping(value = "/saveSP", method = RequestMethod.POST)
    public String save(@Valid SanPham id, @RequestParam("file") MultipartFile file, BindingResult result, RedirectAttributes redirect) throws IOException {
        Path path = Paths.get("D:\\Java5\\shopweb\\src\\main\\resources\\static\\img/");
        try {
            InputStream inputStream = file.getInputStream();
            Files.copy(inputStream, path.resolve(Objects.requireNonNull(file.getOriginalFilename())), StandardCopyOption.REPLACE_EXISTING);
            id.setImg(file.getOriginalFilename().toLowerCase());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result.hasErrors()) {
            return "/admin/themtaikhoan";
        }
        sanPhamService.saveSP(id);
        redirect.addFlashAttribute("successMessage", "Sản phẩm lưu thành công!");
        return "redirect:/admin/danhsachsanpham";
    }


    @RequestMapping(value = "/editSP", method = RequestMethod.GET)
    public String editsp(@RequestParam("id") String id, Model model) {
        Optional<SanPham> userEdit = sanPhamService.findSPById(id);
        userEdit.ifPresent(user -> model.addAttribute("sanpham", user));
        return "admin/themsanpham";
    }

    @RequestMapping(value = "/deleteSP", method = RequestMethod.GET)
    public String deleteSP(@RequestParam("id") String id, Model model, RedirectAttributes redirect) {
        sanPhamService.deleteSP(id);
        redirect.addFlashAttribute("successMessage", "Sản phẩm xóa thành công!");
        return "redirect:/admin/danhsachsanpham";
    }


    ///////////////HoaDon///////////////////


    @RequestMapping("/hoadon")
    public String hoadon(Model model, HttpSession session) {
        try {
            if (session.getAttribute("vaitro").equals(true)) {
                List<HoaDon> users = hoaDonService.getAllHoaDon();
                model.addAttribute("listhoadon", users);
                return "admin/hoadon";
            }
            return "redirect:/index";
        } catch (Exception e) {
            return "redirect:/login";
        }
    }

    @GetMapping("/showhd")
    public String showhd(@RequestParam("id") String term, Model model) {
        if (StringUtils.isEmpty(term)) {
            return "redirect:/admin/hoadon";
        }
        model.addAttribute("listhoadonct", hoaDonCTService.search(term));
        return "admin/hoadonct";
    }

    @GetMapping("/showid")
    public String showid(@RequestParam("id") String term, Model model) {
        if (StringUtils.isEmpty(term)) {
            return "redirect:/admin/hoadon";
        }
        model.addAttribute("listtaikhoan", taikhoanService.search(term));
        return "admin/danhsachcttaikhoan";
    }
}




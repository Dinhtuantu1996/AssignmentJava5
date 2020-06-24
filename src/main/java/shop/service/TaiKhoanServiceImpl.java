package shop.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import shop.entity.TaiKhoan;
import shop.repository.TaiKhoanRepository;
import shop.service.TaiKhoanService;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService {

    @Autowired
    private TaiKhoanRepository taiKhoanRepository;


    @Override
    public List<TaiKhoan> getAllUser() {
        return (List<TaiKhoan>) taiKhoanRepository.findAll();
    }


    @Override
    public List<TaiKhoan> search(String term) {
        return taiKhoanRepository.findByIdContaining(term);
    }


    @Override
    public void saveUser(TaiKhoan id) {
        taiKhoanRepository.save(id);
    }


    @Override
    public void deleteUser(String id) {
        taiKhoanRepository.deleteById(id);
    }

    @Override
    public boolean checklogin(String username, String password, HttpSession session ) {
        Optional<TaiKhoan> optionalTaiKhoan = findUserById(username);
        if (optionalTaiKhoan.isPresent() && optionalTaiKhoan.get().getMatkhau().equals(password)   ) {
            TaiKhoan taikhoan = new TaiKhoan(username, password, optionalTaiKhoan.get().isVaitro());
            session.setAttribute("username", taikhoan.getId());
            session.setAttribute("vaitro", taikhoan.isVaitro());
            return true;
        }
        return false;
    }


    @Override
    public Optional<TaiKhoan> findUserById(String id) {
        return taiKhoanRepository.findById(id);
    }
}
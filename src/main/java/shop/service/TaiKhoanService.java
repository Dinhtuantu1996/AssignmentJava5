package shop.service;


import shop.entity.TaiKhoan;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

public interface TaiKhoanService {

    List<TaiKhoan> getAllUser();

    List<TaiKhoan> search(String term);

    Optional<TaiKhoan> findUserById(String id);

    void saveUser(TaiKhoan id);

    void deleteUser(String id);

    boolean checklogin(String username, String password, HttpSession session );
}

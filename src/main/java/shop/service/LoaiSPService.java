package shop.service;

import shop.entity.LoaiSP;
import shop.entity.Mail;
import shop.entity.TaiKhoan;

import java.util.List;
import java.util.Optional;

public interface LoaiSPService {

    List<LoaiSP> getAllLoaiSP();

    Optional<LoaiSP> findLoaiSPById(String id);

    void saveLoaiSP(LoaiSP id);

    void deleteLoaiSP(String id);


}

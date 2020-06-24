package shop.service;



import shop.entity.SanPham;

import java.util.List;
import java.util.Optional;

public interface SanPhamService {

    List<SanPham> getAllSP();

    List<SanPham> search(String term);

    Optional<SanPham> findSPById(String id);

    void saveSP(SanPham id);

    void deleteSP(String id);

}

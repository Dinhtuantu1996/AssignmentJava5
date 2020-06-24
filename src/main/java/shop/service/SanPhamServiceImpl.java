package shop.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.entity.SanPham;
import shop.entity.TaiKhoan;
import shop.repository.SanPhamRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SanPhamServiceImpl implements SanPhamService {

    @Autowired
    private SanPhamRepository sanPhamRepository;



    @Override
    public List<SanPham> getAllSP() {
        return (List<SanPham>) sanPhamRepository.findAll();
    }




    @Override
    public List<SanPham> search(String term) {
        return sanPhamRepository.findByTensanphamContaining(term);
    }


    @Override
    public void saveSP(SanPham id) {
        sanPhamRepository.save(id);
    }



    @Override
    public void deleteSP(String id) {
        sanPhamRepository.deleteById(id);
    }


    @Override
    public Optional<SanPham> findSPById(String id) {
        return sanPhamRepository.findById(id);
    }

}

package shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.entity.LoaiSP;
import shop.entity.TaiKhoan;
import shop.repository.LoaiSPRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LoaiSPServiceImpl implements LoaiSPService {
    @Autowired
    private LoaiSPRepository loaiSPRepository;



    @Override
    public List<LoaiSP> getAllLoaiSP() {
        return (List<LoaiSP>) loaiSPRepository.findAll();
    }




    @Override
    public void saveLoaiSP(LoaiSP id) {
        loaiSPRepository.save(id);
    }



    @Override
    public void deleteLoaiSP(String id) {
        loaiSPRepository.deleteById(id);
    }


    @Override
    public Optional<LoaiSP> findLoaiSPById(String id) {
        return loaiSPRepository.findByMaloaisanpham(id);
    }
}

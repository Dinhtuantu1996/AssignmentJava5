package shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.entity.HoaDon;
import shop.repository.HoaDonRepository;

import java.util.List;

@Service
public class HoaDonServiceImpl implements HoaDonService{

    @Autowired
    private HoaDonRepository hoadonRepository;


    @Override
    public List<HoaDon> getAllHoaDon() {
        return (List<HoaDon>) hoadonRepository.findAll();
    }

}

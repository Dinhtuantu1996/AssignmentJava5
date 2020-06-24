package shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.entity.HoaDonCT;
import shop.repository.HoaDonCTRepository;

import java.util.List;

@Service
public class HoaDonCTServiceImpl implements HoaDonCTService {

    @Autowired
    private HoaDonCTRepository hoadonCTRepository;


    @Override
    public List<HoaDonCT> search(String term) {
        return hoadonCTRepository.findByMahoadonContaining(term);
    }
}

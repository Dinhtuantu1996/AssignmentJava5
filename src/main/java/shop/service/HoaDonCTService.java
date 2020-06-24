package shop.service;

import shop.entity.HoaDonCT;

import java.util.List;

public interface HoaDonCTService {

    List<HoaDonCT> search(String term);
}

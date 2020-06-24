package shop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import shop.entity.HoaDonCT;

import java.util.List;

@Repository
public interface HoaDonCTRepository extends CrudRepository<HoaDonCT, Integer> {

     List<HoaDonCT> findByMahoadonContaining(String term) ;
}

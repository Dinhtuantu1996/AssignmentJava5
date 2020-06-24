package shop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import shop.entity.HoaDon;

@Repository
public interface HoaDonRepository extends CrudRepository<HoaDon, Integer> {
}

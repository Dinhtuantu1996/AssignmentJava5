package shop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import shop.entity.LoaiSP;

import java.util.Optional;

@Repository
public interface LoaiSPRepository extends CrudRepository<LoaiSP, String> {

    Optional<LoaiSP> findByMaloaisanpham(String id);
}

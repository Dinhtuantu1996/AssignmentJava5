package shop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import shop.entity.SanPham;

import java.util.List;

@Repository
public interface SanPhamRepository extends CrudRepository<SanPham, String> {

    List<SanPham> findByTensanphamContaining(String term);

}

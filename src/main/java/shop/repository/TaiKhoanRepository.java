package shop.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import shop.entity.TaiKhoan;

import java.util.List;

@Repository
public interface TaiKhoanRepository extends CrudRepository<TaiKhoan, String> {

    List<TaiKhoan> findByIdContaining(String term);

}
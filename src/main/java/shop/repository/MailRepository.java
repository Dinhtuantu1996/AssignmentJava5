package shop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import shop.entity.Mail;



import java.util.List;

@Repository
public interface MailRepository extends CrudRepository<Mail, Integer> {

     List<Mail> findByHovatenContaining(String term) ;



}

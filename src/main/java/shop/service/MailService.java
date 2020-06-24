package shop.service;


import shop.entity.Mail;


import java.util.List;


public interface MailService {

    List<Mail> getAllMail();

    List<Mail> search(String term);

    void saveMail(Mail id);

    void deleteMail(Integer id);

}

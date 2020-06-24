package shop.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import shop.entity.Mail;
import shop.repository.MailRepository;



import java.util.List;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private MailRepository mailRepository;



    @Override
    public List<Mail> getAllMail() {
        return (List<Mail>) mailRepository.findAll();
    }




    @Override
    public List<Mail> search(String term) {
        return mailRepository.findByHovatenContaining(term);
    }


    @Override
    public void saveMail(Mail id) {
        mailRepository.save(id);
    }



    @Override
    public void deleteMail(Integer id) {
        mailRepository.deleteById(id);
    }




}

package shop.entity;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "mail")
public class Mail {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @NotBlank
    @Column(name = "hovaten")
    private String hovaten;


    @Pattern(regexp = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4})")
    @Column(name = "email")
    private String email;



    @Pattern(regexp = "0[0-9]{9}")
    @Column(name = "phone")
    private String phone;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    @Column(name = "thoigian")
    private Date thoigian = new Date();


    @Size(min = 10, max = 4000)
    @Column(name = "ghichu")
    private String ghichu;

    public Mail() {

    }

    public Mail(Integer id, String hovaten, String email, String phone, Date thoigian, String ghichu) {
        this.id = id;
        this.hovaten = hovaten;
        this.email = email;
        this.phone = phone;
        this.thoigian = thoigian;
        this.ghichu = ghichu;
    }

    public Integer getId() {
        return id;
    }

    public String getHovaten() {
        return hovaten;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Date getThoigian() {
        return thoigian;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setThoigian(Date thoigian) {
        this.thoigian = thoigian;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }
}
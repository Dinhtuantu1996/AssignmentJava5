package shop.entity;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "taikhoan")
public class TaiKhoan {


    @Id
    @Column(name = "id")
    private String id;


    @Column(name = "hovaten")
    private String hovaten;


    @Column(name = "gioitinh")
    private boolean gioitinh;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    @Column(name = "ngaysinh")
    private Date ngaysinh;

    @Column(name = "img")
    private String img;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "ghichu")
    private String ghichu;


    @Column(name = "matkhau")
    private String matkhau;

    @Column(name = "vaitro")
    private boolean vaitro;

    public TaiKhoan() {

    }

    public TaiKhoan(String id, String hovaten, boolean gioitinh, Date ngaysinh, String img, String email, String phone, String ghichu, String matkhau, boolean vaitro) {
        this.id = id;
        this.hovaten = hovaten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.img = img;
        this.email = email;
        this.phone = phone;
        this.ghichu = ghichu;
        this.matkhau = matkhau;
        this.vaitro = vaitro;
    }



    public TaiKhoan(String username, String password , boolean security) {
        this.id = username;
        this.matkhau = password;
        this.vaitro = security;
    }


    public String getId() {
        return id;
    }

    public String getHovaten() {
        return hovaten;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public String getImg() {
        return img;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getGhichu() {
        return ghichu;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public boolean isVaitro() {
        return vaitro;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public void setVaitro(boolean vaitro) {
        this.vaitro = vaitro;
    }
}

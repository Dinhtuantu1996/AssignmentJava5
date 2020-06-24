package shop.entity;

import javax.persistence.*;

@Entity
@Table(name = "sanpham")
public class SanPham {

    @Id
    @Column(name = "masanpham")
    private String masanpham;

    @Column(name = "maloaisanpham")
    private String maloaisanpham;

    @Column(name = "tensanpham")
    private String tensanpham;


    @Column(name = "giaban")
    private double giaban;


    @Column(name = "img")
    private String img;

    @Column(name = "kichthuoc")
    private String kichthuoc;

    @Column(name = "mausac")
    private String mausac;

    @Column(name = "trangthai")
    private String trangthai;

    @Column(name = "ghichu")
    private String ghichu;



    public SanPham(){

    }

    public SanPham(String masanpham, String maloaisanpham, String tensanpham, double giaban, String img, String kichthuoc, String mausac, String trangthai, String ghichu) {
        this.masanpham = masanpham;
        this.maloaisanpham = maloaisanpham;
        this.tensanpham = tensanpham;
        this.giaban = giaban;
        this.img = img;
        this.kichthuoc = kichthuoc;
        this.mausac = mausac;
        this.trangthai = trangthai;
        this.ghichu = ghichu;
    }

    public String getMasanpham() {
        return masanpham;
    }

    public String getMaloaisanpham() {
        return maloaisanpham;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public double getGiaban() {
        return giaban;
    }

    public String getImg() {
        return img;
    }

    public String getKichthuoc() {
        return kichthuoc;
    }

    public String getMausac() {
        return mausac;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    public void setMaloaisanpham(String maloaisanpham) {
        this.maloaisanpham = maloaisanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setKichthuoc(String kichthuoc) {
        this.kichthuoc = kichthuoc;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }


}

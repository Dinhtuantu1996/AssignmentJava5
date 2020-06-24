package shop.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "loaisanpham")
public class LoaiSP {

    @Id
    @Column(name = "maloaisanpham")
    private String maloaisanpham;


    @Column(name = "tenloaisanpham")
    private String tenloaisanpham;

    public LoaiSP() {

    }

    public LoaiSP(String maloaisanpham, String tenloaisanpham) {
        this.maloaisanpham = maloaisanpham;
        this.tenloaisanpham = tenloaisanpham;
    }

    public String getMaloaisanpham() {
        return maloaisanpham;
    }

    public String getTenloaisanpham() {
        return tenloaisanpham;
    }

    public void setMaloaisanpham(String maloaisanpham) {
        this.maloaisanpham = maloaisanpham;
    }

    public void setTenloaisanpham(String tenloaisanpham) {
        this.tenloaisanpham = tenloaisanpham;
    }


}

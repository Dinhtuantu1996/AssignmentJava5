package shop.entity;



import javax.persistence.*;
@Entity
@Table(name = "hoadonchitiet")
public class HoaDonCT {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "mahoadon")
    private String mahoadon;

    @Column(name = "masanpham")
    private String masanpham;

    @Column(name = "soluong")
    private int soluong;

    @Column(name = "tongtien")
    private double tongtien;

    @Column(name = "ghichu")
    private String ghichu ;

   public HoaDonCT(){

   }

    public HoaDonCT(Integer id, String mahoadon, String masanpham, int soluong, double tongtien, String ghichu) {
        this.id = id;
        this.mahoadon = mahoadon;
        this.masanpham = masanpham;
        this.soluong = soluong;
        this.tongtien = tongtien;
        this.ghichu = ghichu;
    }

    public Integer getId() {
        return id;
    }

    public String getMahoadon() {
        return mahoadon;
    }

    public String getMasanpham() {
        return masanpham;
    }

    public int getSoluong() {
        return soluong;
    }

    public double getTongtien() {
        return tongtien;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setTongtien(double tongtien) {
        this.tongtien = tongtien;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }


}

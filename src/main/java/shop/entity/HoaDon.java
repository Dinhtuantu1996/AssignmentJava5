package shop.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "hoadon")
public class HoaDon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mahoadon")
    private int mahoadon;

    @Column(name = "id")
    private String id;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    @Column(name = "ngaylap")
    private Date ngaylap = new Date();

    public HoaDon(){

    }

    public HoaDon(int mahoadon, String id, Date ngaylap) {
        this.mahoadon = mahoadon;
        this.id = id;
        this.ngaylap = ngaylap;
    }

    public int getMahoadon() {
        return mahoadon;
    }

    public String getId() {
        return id;
    }

    public Date getNgaylap() {
        return ngaylap;
    }

    public void setMahoadon(int mahoadon) {
        this.mahoadon = mahoadon;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNgaylap(Date ngaylap) {
        this.ngaylap = ngaylap;
    }
}

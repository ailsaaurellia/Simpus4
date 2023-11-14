/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persisten;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ailsa
 */
@Entity
@Table(name = "skripsi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Skripsi.findAll", query = "SELECT s FROM Skripsi s")
    , @NamedQuery(name = "Skripsi.findByJudul", query = "SELECT s FROM Skripsi s WHERE s.judul = :judul")
    , @NamedQuery(name = "Skripsi.findByPengarang", query = "SELECT s FROM Skripsi s WHERE s.pengarang = :pengarang")
    , @NamedQuery(name = "Skripsi.findByTahun", query = "SELECT s FROM Skripsi s WHERE s.tahun = :tahun")
    , @NamedQuery(name = "Skripsi.findByJumlahHalaman", query = "SELECT s FROM Skripsi s WHERE s.jumlahHalaman = :jumlahHalaman")})
public class Skripsi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "judul")
    private String judul;
    @Column(name = "pengarang")
    private String pengarang;
    @Column(name = "tahun")
    private String tahun;
    @Column(name = "jumlah_halaman")
    private String jumlahHalaman;

    public Skripsi() {
    }

    public Skripsi(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(String jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (judul != null ? judul.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Skripsi)) {
            return false;
        }
        Skripsi other = (Skripsi) object;
        if ((this.judul == null && other.judul != null) || (this.judul != null && !this.judul.equals(other.judul))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persisten.Skripsi[ judul=" + judul + " ]";
    }
    
}

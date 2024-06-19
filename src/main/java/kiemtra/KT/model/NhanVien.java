/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra.KT.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 *
 * @author Admin
 */
@Data
@Entity
@Table(name = "nhanvien")
public class NhanVien {
    @Id
    @Column(name = "Ma_NV")
    private String maNV;

    @Column(name = "Ten_NV")
    private String tenNV;

    @Column(name = "Phai")
    private String phai;

    @Column(name = "Noi_Sinh")
    private String noiSinh;

    @ManyToOne
    @JoinColumn(name = "Ma_Phong")
    private PhongBan phongBan;

    @Column(name = "Luong")
    private int luong;
}
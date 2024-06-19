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
@Table(name = "phongban")
public class PhongBan {
    @Id
    @Column(name = "Ma_Phong")
    private String maPhong;

    @Column(name = "Ten_Phong")
    private String tenPhong;
}
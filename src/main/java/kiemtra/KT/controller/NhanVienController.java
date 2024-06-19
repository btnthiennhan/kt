/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra.KT.controller;

import kiemtra.KT.model.NhanVien;
import kiemtra.KT.service.NhanVienService;
import kiemtra.KT.service.PhongBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Admin
 */
@Controller
@RequestMapping("/nhanvien")
public class NhanVienController {

    @Autowired
    private NhanVienService nhanVienService;

    @Autowired
    private PhongBanService phongBanService;

    @GetMapping
    public String listNhanVien(Model model) {
        model.addAttribute("listNhanVien", nhanVienService.getAllNhanVien());
        return "nhanvien/list";
    }

    @GetMapping("/add")
    public String addNhanVienForm(Model model) {
        model.addAttribute("nhanVien", new NhanVien());
        model.addAttribute("listPhongBan", phongBanService.getAllPhongBan());
        return "nhanvien/add";
    }

    @PostMapping("/save")
    public String saveNhanVien(@ModelAttribute("nhanVien") NhanVien nhanVien) {
        nhanVienService.saveNhanVien(nhanVien);
        return "redirect:/nhanvien";
    }

    @GetMapping("/edit/{maNV}")
    public String editNhanVienForm(@PathVariable String maNV, Model model) {
        model.addAttribute("nhanVien", nhanVienService.getNhanVien(maNV));
        model.addAttribute("listPhongBan", phongBanService.getAllPhongBan());
        return "nhanvien/edit";
    }

    @GetMapping("/delete/{maNV}")
    public String deleteNhanVien(@PathVariable String maNV) {
        nhanVienService.deleteNhanVien(maNV);
        return "redirect:/nhanvien";
    }
}
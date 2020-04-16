/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.ArrayList;

/**
 *
 * @author kimngoc
 */
public class QLSV {
    ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
    ISoSanh SoSanh;

    public void setSoSanh(ISoSanh SoSanh) {
        this.SoSanh = SoSanh;
    }
    
    // methods
    // thêm sv vào ds
    public void Them(SinhVien sv) {
        dsSinhVien.add(sv);
    }
    // sắp xếp ds sv(tăng dần theo tiêu chí)
    public void SapXep() {
        dsSinhVien.sort((a, b) -> SoSanh.SoSanh((SinhVien)a, (SinhVien)b));
    }
    // in ds sv
    public void InDs() {
        dsSinhVien.forEach(sv -> System.out.println("Sinh viên: " + sv.getThongTin()));
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author kimngoc
 */
public class SinhVien {
    private String HoTen;
    private Date NgaySinh;
    private float DiemTB;

    public SinhVien(String HoTen, Date NgaySinh, float DiemTB) {
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.DiemTB = DiemTB;
    }

    public String getHoTen() {
        return HoTen;
    }

    public float getDiemTB() {
        return DiemTB;
    }
    
    public String getThongTin() {
        SimpleDateFormat formaterDate = new SimpleDateFormat("dd/MM/yyyy");
        return "Họ tên: " + this.HoTen + ", ngày tháng năm sinh: " + formaterDate.format(this.NgaySinh) + ", điểm trung bình: " + this.DiemTB;
    }
}
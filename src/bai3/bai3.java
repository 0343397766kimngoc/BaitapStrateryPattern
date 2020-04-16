/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author kimngoc
 */
public class bai3 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws ParseException {
        // tạo đối tượng format Date
        SimpleDateFormat formaterDate = new SimpleDateFormat("dd/MM/yyyy");
        
        // tạo đối tượng quản lý sv
        QLSV QuanLy = new QLSV();
        // tạo sv
        SinhVien sv1 = new SinhVien("Nguyen Tuan An", formaterDate.parse("22/1/1995"), 8.6f);
        SinhVien sv2 = new SinhVien("Tran Anh Tuan", formaterDate.parse("23/5/1997"), 6.6f);
        SinhVien sv3 = new SinhVien("Truong Van Nghia", formaterDate.parse("14/12/1998"), 9.6f);
        SinhVien sv4 = new SinhVien("Pham Van Dinh", formaterDate.parse("20/1/1999"), 5.3f);
        SinhVien sv5 = new SinhVien("Le Van Loc", formaterDate.parse("41/11/1996"), 8.8f);
        
        // thêm sv đối tượng quản lý
        QuanLy.Them(sv1);
        QuanLy.Them(sv2);
        QuanLy.Them(sv3);
        QuanLy.Them(sv4);
        QuanLy.Them(sv5);
        
        // in thông tin ds sv
        System.out.println("Danh sách sinh viên");
        QuanLy.InDs();
        
        // sắp xếp ds sv (tăng dần) theo tên
        QuanLy.setSoSanh(new SoSanhTheoTen());
        QuanLy.SapXep();
        System.out.println("\nDanh sách sinh viên(sắp xếp theo tên)");
        QuanLy.InDs();
        
        // sắp xêp ds sv (tăng dần) theo điểm
        QuanLy.setSoSanh(new SoSanhTheoDiem());
        QuanLy.SapXep();
        System.out.println("\nDanh sách sinh viên(sắp xếp theo điểm TB)");
        QuanLy.InDs();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author kimngoc
 */
public class SoSanhTheoTen implements ISoSanh<SinhVien> {

    @Override
    public int SoSanh(SinhVien s1, SinhVien s2) {
        int resCompareTo = s1.getHoTen().compareTo(s2.getHoTen());
        if (resCompareTo> 0) {
            return 1;
        }
        if (resCompareTo < 0) {
            return -1;
        }
        return 0;
    }
    
}
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
public class SoSanhTheoDiem implements ISoSanh<SinhVien> {


    @Override
    public int SoSanh(SinhVien s1, SinhVien s2) {
        if (s1.getDiemTB() > s2.getDiemTB()) {
            return 1;
        }
        if (s1.getDiemTB() < s2.getDiemTB()) {
            return -1;
        }
        return 0;
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author HP
 */
public class ThanhToanOnline implements IThanhToan {
    @Override
    public double thanhtoan(int tienhang) {
        if(tienhang < 1000000)
            return 0.95*tienhang;
        else return 0.93 * tienhang;
    }
}
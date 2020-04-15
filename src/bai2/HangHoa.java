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
public class HangHoa {
    private String TenHH;
    private int Gia;
    private String MoTa;


    public int getGia() {
        return Gia;
    }

    public HangHoa(String TenHH, int Gia, String MoTa) {
        this.TenHH = TenHH;
        this.Gia = Gia;
        this.MoTa = MoTa;
    }
}
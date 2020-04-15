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
public class bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// write your code here
        ThanhToanOnline thanhToanOnline =new ThanhToanOnline();
        ThanhToanCOD thanhToanCOD = new ThanhToanCOD();

        HangHoa hh1 = new HangHoa("SPA",1500000,"tot");
        HangHoa hh2 = new HangHoa("SPB",3500000,"chat luong cao");

        GioHang gh1 =new GioHang();
        gh1.setHinhThucThanhToan(thanhToanOnline);
        gh1.setHh(hh1);
        System.out.println("Thanh toan online:" + gh1.thanhtoan());

        GioHang gh2 =new GioHang();
        gh2.setHinhThucThanhToan(thanhToanCOD);
        gh2.setHh(hh2);
        System.out.println("Thanh toan COD:" + gh2.thanhtoan());
    }
}

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
public class GioHang {
    private IThanhToan hinhthucThanhToan;
    private HangHoa hh;

    public void setHh(HangHoa hh) {
        this.hh = hh;
    }

    public void setHinhThucThanhToan(IThanhToan HinhThucThanhToan) {
        this.hinhthucThanhToan = HinhThucThanhToan;
    }
    public double thanhtoan(){
        return hinhthucThanhToan.thanhtoan(hh.getGia());
    }
}
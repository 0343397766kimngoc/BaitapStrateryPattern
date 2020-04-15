/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author HP
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Context context = new Context();
       
       context.setTinhToan(new Cong());
      // context.tinh(76, 5);
        System.out.println(context.tinh(65, 6));
       
       
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author bruno
 */
public class identificarVencedor {
    private int vencedor;

    public int getVencedor() {
        return vencedor;
    }

    public void setVencedor(int vencedor) {
        this.vencedor = vencedor;
    }
    
    public int identificarVencedor(int p1, int p2) {
        if (p1 == p2) {
            return 0;
        } else if (p1 == 1 && p2 == 2 || p1 == 2 && p2 == 1) {
            return 2;
        } else {
            return 1;
        }
    }
}
    

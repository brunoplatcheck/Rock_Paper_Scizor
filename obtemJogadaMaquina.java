/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.Random;

/**
 *
 * @author bruno
 */
class obtemJogadaMaquina {
    private int numeroSortedo;

    public int getNumeroSortedo() {
        return numeroSortedo;
    }

    public void setNumeroSortedo(int numeroSortedo) {
        this.numeroSortedo = numeroSortedo;
    }

int obtemJogadaMaquina(int numeroSorteado) {
    Random random = new Random();
    numeroSorteado = random.nextInt(3) + 1;
    return numeroSorteado;
}
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class obtemJogadaHumana {
    private int p1;
    private boolean validacao;

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public boolean isValidacao() {
        return validacao;
    }

    public void setValidacao(boolean validacao) {
        this.validacao = validacao;
    }
    
    
    int obtemJogadaHumana(int jogadaP1) {
        Executar ex=new Executar();
        imprimirResultado ir=new imprimirResultado();
    Scanner s = new Scanner(System.in);
    escreveMenu em = new escreveMenu();
    
    em.escreveMenu();
    
    do {
        System.out.println("Informe sua jogada: ");
        p1 = s.nextInt();
        if (p1 < 1) {
            System.out.println("Jogada Inválida! Escolha 1, 2 ou 3\n");
        }else if( p1 > 3){
            System.out.println("Jogada Inválida! Escolha 1, 2 ou 3\n");
        }else{
            ir.retornaJogadaMaquina(p1); 
            
        }
    }  while (p1 < 1 || p1 > 3);
    return p1;
           
}

   
 
}



    


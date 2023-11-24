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
class Executar {
   private int jogadaP1;
   private int jogadaP2;
   private int vencedor;
   private String jogar;
   private double carteira=100.00;
   private int contv=0;
   private int conte=0;
   private int contd=0;
   

    public int getJogadaP1() {
        return jogadaP1;
    }

    public void setJogadaP1(int jogadaP1) {
        this.jogadaP1 = jogadaP1;
    }

    public int getJogadaP2() {
        return jogadaP2;
    }

    public void setJogadaP2(int jogadaP2) {
        this.jogadaP2 = jogadaP2;
    }

    public int getVencedor() {
        return vencedor;
    }

    public void setVencedor(int vencedor) {
        this.vencedor = vencedor;
    }

    public String getJogar() {
        return jogar;
    }

    public void setJogar(String jogar) {
        this.jogar = jogar;
    }

    public double getCarteira() {
        return carteira;
    }

    public void setCarteira(Float carteira) {
        this.carteira = carteira;
    }

    public int getContv() {
        return contv;
    }

    public void setContv(int contv) {
        this.contv = contv;
    }

    public int getConte() {
        return conte;
    }

    public void setConte(int conte) {
        this.conte = conte;
    }

    public int getContd() {
        return contd;
    }

    public void setContd(int contd) {
        this.contd = contd;
    }
   
    void Executar() {
        Scanner s=new Scanner(System.in);
        obtemJogadaHumana jh=new obtemJogadaHumana();
        obtemJogadaMaquina jm=new obtemJogadaMaquina();
        imprimirResultado ir=new imprimirResultado();
        atualizarCarteira ac=new atualizarCarteira();
        identificarVencedor iv=new identificarVencedor();
        
        do{
            jh.obtemJogadaHumana(jogadaP1);
            jm.obtemJogadaMaquina(jogadaP2);
            iv.identificarVencedor(jh.getP1(),jm.getNumeroSortedo());
            vencedor =iv.getVencedor(); 
            if(vencedor==1){
                contv++;
                carteira=ac.atualizarCarteira(carteira,10.0);
            }else if(vencedor==2){
		contd++;
		carteira=ac.atualizarCarteira(carteira,-10.0);
            }else if(vencedor==0){
		conte++;
            }
			
            ir.imprimirResultado(jh.getP1(),jm.getNumeroSortedo(),vencedor,carteira,contv,contd,conte);

            if(carteira<0){
                System.out.println("GAME OVER! FRACASSADO!!!\n");
		jogar="N";
            }else{
		System.out.println("Bora mais uma? ('N'para parar): ");
                jogar=s.next();
			}
            }while(!jogar.equalsIgnoreCase("N"));
        System.out.println("Sistema encerrado");
	}
    }
    


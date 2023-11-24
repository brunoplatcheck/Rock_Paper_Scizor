/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author bruno
 */
class imprimirResultado {
    private String resultado;
    private int vencedor;

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    public int getVencedor() {
        return vencedor;
    }

    public void setVencedor(int vencedor) {
        this.vencedor = vencedor;
    }

    void imprimirResultado(int p1, int p2, int vencedor, double carteira, int contv, int contd, int conte) {
        obtemJogadaHumana jh=new obtemJogadaHumana();
        obtemJogadaMaquina jm=new obtemJogadaMaquina();
        
        System.out.println("RESULTADO\n");
        System.out.println("P1 = " + retornaJogadaHumana(p1) + "\n");
        System.out.println("P2 = " + retornaJogadaMaquina(p2) + "\n");
        System.out.println(retornaResultado(vencedor) + "\n" + "\n");
        System.out.println("Saldo: " + carteira + "\n\n");
        System.out.println("Você teve um total de: " + contv + " vitórias\n");
        System.out.println("Você teve um total de: " + contd + " derrotas\n");
        System.out.println("Você teve um total de: " + conte + " empates\n");
    }
 String retornaJogadaHumana(int jogada) {
        switch (jogada) {
            case 1:
                return "Pedra";
            case 2:
                return "Papel";
            case 3:
                return "Tesoura";
            default:
                return "Jogada inválida";
        }
    }
 String retornaJogadaMaquina(int jogada) {
    obtemJogadaMaquina jm = new obtemJogadaMaquina();
    switch (jm.obtemJogadaMaquina(jogada)) {
        case 1:
            return "Pedra";
        case 2:
            return "Papel";
        case 3:
            return "Tesoura";
        default:
            return "Jogada inválida";
    }
 }

   String retornaResultado(int vencedor) {
       if(this.vencedor==0){
           return "Empate";
       }if(this.vencedor==1){
           return "Jogador 1 venceu";
       }if(this.vencedor==2){
           return "Jogador 2 venceu";
       }else{
           return "Resultado inválido";
       }
        
    }
    public int identificarVencedor(int p1, int p2) {
        if (p1 == p2) {
             vencedor =0;
        } else if (p1 == 1 && p2 == 2 || p1 == 2 && p2 == 1) {
             vencedor =2;
        } else {
             vencedor =1;
        }
        retornaResultado(vencedor);
        return vencedor;
    }
    }
    


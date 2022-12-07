package questao1;
 
import javax.swing.JOptionPane;
 

public class questao1 {
 
    
    public static void main(String[] args) {
 
        Double tempoGastoNaViagem;
        Double velocidadeMedia;
        Double distancia;
        Double litros_usados;
 
        System.out.println("Informe o tempo gasto na viagem ");
        tempoGastoNaViagem = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo gasto na viagem"));
 
        System.out.println("Informe oa velocidade média");
        velocidadeMedia = Double.parseDouble(JOptionPane.showInputDialog("Informe a velocidade média"));
 
        distancia = tempoGastoNaViagem * velocidadeMedia;
 
        litros_usados = (distancia / 12);
 
        System.out.println("A distância percorrida é: " + distancia);
        System.out.println("A quantidade de litros utilizados é: " + litros_usados);
    }
}
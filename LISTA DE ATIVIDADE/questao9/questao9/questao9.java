package questao9;
 
import javax.swing.JOptionPane;
 

public class questao9 {
 
    public static void main(String[] args) {
 
        Double grausCentigrados;
        Double grausFahrenheit;
 
        System.out.println("Informe a temperatura em graus Centigrados");
        grausCentigrados
                = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em graus Centigrados: "));
 
 
        grausFahrenheit = ((grausCentigrados * 1.8)+32);
        System.out.println("A temperatura em graus Fahrenheit é" + grausFahrenheit );
 
    }
 
}
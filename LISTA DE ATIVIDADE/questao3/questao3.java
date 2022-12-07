package questao3;

import java.util.Scanner;

public class questao3 {
    public static void main(String args[]){
        int num, poi;
        Scanner in = new Scanner(System.in);
        System.out.println("digite um numero:");

        num = in.nextInt();
        poi = (num%2);
        
        if(poi==0){
            System.out.println("O numero"+num+"é par");


        }
        else{
            System.out.println("O numero"+num+"é impar");
        }
    }
    
}

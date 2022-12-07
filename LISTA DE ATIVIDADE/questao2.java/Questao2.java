package questao2;
import java.util.Scanner;

public class Questao2{
    
       static Scanner in = new Scanner(System.in);
       static int num1;
       static int num2;
     
    public static void main(String args[]){
       
            System.out.println("digite o primeiro numero");
            num1 = in.nextInt();

            System.out.println("digite o segundo numero");
            num2 = in.nextInt();

            if(num1 == num2){
                System.out.println("o"+num1+"e"+num2+"sao iguais");

            }
            else if(num1 != num2){
                System.out.println(++num1+"e"+num2+"sao diferentes");
            }    
            else if(num1 > num2){
                System.out.println(++num1+">"+num2++);

             }
            else if(num1 >= num2){
                System.out.println(++num1+">="+num2++);
            }
            else if(num1 < num2){
                System.out.println(++num1+"<"+num2++);
            }
            else if(num1 <= num2){
                System.out.println(++num1+"<="+num2++);
    
            }
        }
    }

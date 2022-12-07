package  questao5;
import  java.util.Scanner;

public  class  Questao5{
	Scanner in = new  Scanner(System.in);
	int premio;

	
	public  void  Prêmio(String args[]) {

	    System.out.println("escolha um numero do 1 ao 9");
	    premio = in.nextInt();
	    
	
	    if ( premio == 1 ) {
	    	System.out.println ("parabens voce acaba de ganhar um carro");
	    }
	    
	        else  if ( premio == 2 ){
	    	System.out.println( "parabens voce acaba de ganhar um a bicicleta" );
	        }
	    
	             else  if ( premio == 3 ){
	    	        System.out.println( "parabens voce acaba de ganhar uma moto " );
	            }
	    
	                 else if ( premio == 4 ){
	    	            System.out.println( "parabens voce acaba de ganhar uma bola" );
	                }
	    
	                    else  if ( premio == 5 ){
	    	                System.out.println ( "parabens voce acaba de ganhar uma panela " );
	                    }
	    
	                        else  if ( premio == 6 ){
	    	                    System.out.println ( "parabens voce acaba de ganhar um videogame" );
	                        }
	   
                                else  if ( premio == 7 ){
	    	                        System.out.println ( "parabens voce acaba de ganhar uma TV " );
	                            }
	    
                                    else  if ( premio == 8 ){
	    	                            System.out.println ( "parabens voce acaba de ganhar um computador " );
	                                }
	    
                                        else  if ( premio == 9 ) {
	    	                                System.out.println ( "parabens voce acaba de ganhar um celular" );  
	                                    }
	    
	                                        else {
	    	
	    	                                    System.out.println ( "Numero é de 1 a 9, insira novamente!" );
	                                        }
	}

}
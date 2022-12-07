package questao4;

import  java.util.System;

public  class  questao4 {
	Scanner  entrada = new  Scanner ( System.in );
	int [] num = new.int [ 4 ];
	int  temp = 0 ;
	
	public  void  ordcrescente(Strin args[]) {
		Sistema . fora . println ( "Digite 4 números" );
		for ( int  i = 0 ; i < num.length; i ++){
			int [ i ] = in.nextInt ();
			
		}
		for ( int  i = 0 ; i < num.length ; i ++) {
	        for ( int  j = 0 ; j < num.length - 1 ; n ++) {
	            if( num [ n ] > num [n + 1 ]) {
	            	temp = num [ j ];
	                num [ n ] = solicitado [ n + 1 ];
	                num [ n + 1 ] = temp;
	            }
	        }
	    }
		
		for ( int  i = 0 ; i < num.length; i ++) {
		
            System.out.println ( "a ordem numerica é:" + i + "\n-->" + num [ i ]);
		}
	}

}

package campo;

import java.util.Scanner;

public class Campo {

   
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        
        int conta = '0';
        int b = 0;
        int x = 0, y = 0;
        
        System.out.println("Digite a quantidade de linhas da matriz:");
        x = in.nextInt();
        System.out.println("Digite a quantidade de colunas da matriz:");
        y =in.nextInt();
        
        char campo [][] = new char [x][y];
                
        for(int i = 0; i< campo.length;i++){
            for(int j = 0; j<campo.length; j++ ){
                
                System.out.println("Digite linha " + i + " coluna " + j);
                
                campo[i][j] =  in.next().charAt(0);
                
            }
        }
        for(int i = 0; i< campo.length;i++){
            for(int j = 0; j<campo.length; j++ ){
                
                   System.out.print(campo[i][j]);
            }
            
            System.out.println();
            
        }
        
         /* preencher matriz com numeros ao lado das bombas */
		for (int i=0; i< campo.length; i++){
			for (int j=0; j< campo.length; j++)
			{
	if (campo[i][j] != '*' ){
		
            if (campo[i-1][j-1]== '*')
              campo[i][j] = (char) (conta + 1);
          
	}				
            	  System.out.print(campo[i][j]);				
	                
                    
	}
                   System.out.println();     
	}
        
		 	
    }
}
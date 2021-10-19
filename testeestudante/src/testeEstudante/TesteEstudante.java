package testeEstudante;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TesteEstudante {
	   
    public static TesteEstudante e;  
    double nota1 = e.lerNota(1);    
    double nota2 = e.lerNota(2);    
    double nota3 = e.lerNota(3);    
    double nota4 = e.lerNota(4);
	private int matricula;
	private String nome;
	private char sexo;  
      
   public static void main(String[] args) {    
      TesteEstudante e = new TesteEstudante();    
      e.matricula = 2004001;    
      e.nome = "Maria Silva";    
      e.sexo = 'f';    
      e.atribuirNota(1, 7.0);    
      e.atribuirNota(2,  8.2);    
      e.atribuirNota(3,  6.0);    
      e.atribuirNota(4,  5.5);    
      exibir1();  
    }    
        
   private double lerNota(int i) {
	// TODO Auto-generated method stub
	return 0;
}

private void atribuirNota(int i, double d) {
	// TODO Auto-generated method stub
	
}

public static <e> void exibir1(){    
           
       System.out.println(" matricula = "+ 2004001);    
       String Maria = null;    
       System.out.println(" nome = "+ Maria);    
       System.out.println(" sexo = "+ 'f');    
       System.out.println(" nota1 = " +  7);    
       System.out.println(" nota2 = " +  8);    
       System.out.println(" nota3 = " +  6);    
       System.out.println(" nota4 = " +  5);    
        
      e.exibir1();    
   }    
}

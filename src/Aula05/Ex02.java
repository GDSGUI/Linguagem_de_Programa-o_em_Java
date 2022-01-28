package Aula05;
import javax.swing.JOptionPane;

public class Ex02 {
    public static void main (String arg [ ]) 
      {
         int a, b;
	      a = Integer.parseInt(JOptionPane.showInputDialog ("Digite um número"));
	      b = Integer.parseInt(JOptionPane.showInputDialog ("Digite um número"));
         calcula_Media(a, b);
      }
  
 static void calcula_Media(int numero1, int numero2)
	{
	  double media;
	  media = ((double)(numero1 + numero2) / 2);
     System.out.println("Media = " +media);
	}

}

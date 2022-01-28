package Aula06;
import javax.swing.JOptionPane;

public class Ex02 {
   public static void main (String arg [ ]) 
     {
          int num;
          num = Integer.parseInt(JOptionPane.showInputDialog ("Digite um número:"));
          JOptionPane.showMessageDialog (null,"O fatorial é: "+Fatorial(num));   
     }

 static int Fatorial(int num) 
    {
        int aux;
        aux = (num - 1);
        while (aux != 0)
            {
                num = (num * aux);
                aux--; // equivale --> aux = (aux - 1) 
            }
          return num;
    }
}

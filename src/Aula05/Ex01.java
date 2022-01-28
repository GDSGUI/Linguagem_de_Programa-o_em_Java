package Aula05;
import javax.swing.JOptionPane;

public class Ex01 {
      static int num1,num2;
     public static void main (String arg [ ]) 
       {
        num1= Integer.parseInt(JOptionPane.showInputDialog ("Digite um número 1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog ("Digite um número 2"));
        calcula_Media();
       }
      
     static void calcula_Media()
           {
             double media;
               media = ((double)(num1 + num2) / 2);
            System.out.println("Media = " +media);
          }
    }

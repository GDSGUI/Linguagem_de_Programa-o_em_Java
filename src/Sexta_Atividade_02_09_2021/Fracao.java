package Sexta_Atividade_02_09_2021;

import javax.swing.JOptionPane;
public class Fracao {
public static void main (String arg [ ])
     {
          double N;
          N = Integer.parseInt(JOptionPane.showInputDialog ("Digite um número"));
   
        double Divi, Soma, Numero, Inteiro;
        Divi = 1;
        Inteiro = 1;
        Numero = 1;
        while(Divi <= N)
        {
            Numero = ((Inteiro/Divi++) + Numero);
        {
       
        System.out.println("A fração: "+Numero);
       
        }
}
     }
    } 
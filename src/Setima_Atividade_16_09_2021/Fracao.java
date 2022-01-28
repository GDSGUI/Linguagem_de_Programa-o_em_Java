package Setima_Atividade_16_09_2021;
import javax.swing.JOptionPane;
/*
Programador: Guilherme Gomes dos Santos
Data: 16/09/2021
2.	Receba um número N. Calcule e mostre o resultado da série:  1/1! + 1/2! + 1/3! ... + 1/N! 
Sugestão: Desenvolver 2 funções, onde haverá a chamada de uma função na outra. 

*/
public class Fracao {
    public static void main(String [] args){
    
    double N;
    N = Integer.parseInt(JOptionPane.showInputDialog ("Digite um número"));
    JOptionPane.showMessageDialog (null,"O fatorial é "+Fracao(N));   
}

static double Fracao(double N) {
    double Divi, Soma, Numero, Inteiro;
    Divi = 1;
    Inteiro = 1;
    Numero = 1;
    while(Divi <= N){
        {
            Numero = ((Inteiro/Divi++)+ Numero);
        }
    }
    return (double) Numero;
    }
}
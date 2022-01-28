package Aula02;

import javax.swing.*;
public class Ex01
{
public static void main (String args [ ])   {
    double x; // declaração de variáveis 
    // mensagem ao usuário e entrada de dados
    x = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real"));
    // condicionais
    if (x > 0)
        {
   
        System.out.println (x + " é positivo"); // saída de resultados
        } // fim do if
    } // fim do void main
} // fim da classe Positivo
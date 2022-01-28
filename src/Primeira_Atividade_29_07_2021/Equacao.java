/*
Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0).
Calcule e mostre as raízes reais (considerar que a equação possui 2 raízes).
*/
package Primeira_Atividade_29_07_2021;

import javax.swing.JOptionPane;
public class Equacao {
   public static void main (String args [ ] ) {
       
       int a, b, c, Delta, Raiz_1, Raiz_2;
       a = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor para A, Lembrando que não pode ser 0: "));
       b = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor para B: "));
       c = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor para C: "));
       
       Delta = (int) (Math.pow(b, 2))+(-4*a*c);
       
       Raiz_1 = (int) (  ( b + (Math.sqrt (Delta) )  )  / ( 2*a ) );
       Raiz_2 = (int) (  ( -b - (Math.sqrt (Delta) )  )  / ( 2*a ) );
       
       JOptionPane.showMessageDialog(null,"O Valor de Delta é: " + Delta);
       JOptionPane.showMessageDialog(null,"O Valor da 1° Raiz é: " + Raiz_1);
       JOptionPane.showMessageDialog(null,"O Valor da 2° raiz é: " + Raiz_2);
   }
   }
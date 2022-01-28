/*
Receba os valores em x e y.
Efetua a troca de seus valores e mostre seus conteúdos.
*/
package Primeira_Atividade_29_07_2021;
import javax.swing.JOptionPane;
public class Troca_Numeros {
   public static void main (String args [ ] ) {
       
       int X, Y, X_Real, Y_Real;
       X = Integer.parseInt(JOptionPane.showInputDialog(" Digite um Valor para X: "));
       Y = Integer.parseInt(JOptionPane.showInputDialog(" Digite um Valor para Y: "));
       
       X_Real = Y;
       Y_Real = X;
       
       JOptionPane.showMessageDialog(null,"O Valor de X é: " + X_Real);
       JOptionPane.showMessageDialog(null,"O Valor de Y é: " + Y_Real);
       

   }
   }
/*
Receba a temperatura em graus Celsius.
Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
*/

package Primeira_Atividade_29_07_2021;

import javax.swing.JOptionPane;
public class fahrenheit {
   public static void main (String args [ ] ) {

   int  Celsius, soma; 
   Celsius = Integer.parseInt(JOptionPane.showInputDialog("Qual é a Temperatura que esta fazendo no Momento?")); 
   soma = (9 * Celsius + 160) / 5;
   JOptionPane.showMessageDialog(null,"O Valor em Fahrenheit é: " + soma);
   }
 }

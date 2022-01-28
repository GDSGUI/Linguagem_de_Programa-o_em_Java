package Aula01;
import javax.swing.JOptionPane;
public class Soma {
   public static void main (String args [ ] ) {

   int  Celsius,soma; 
   Celsius = Integer.parseInt(JOptionPane.showInputDialog("Qual é a Temperatura que esta fazendo no Momento?")); 
   soma = (9 * Celsius + 160) / 5;
   JOptionPane.showMessageDialog(null,"O Valor em Fahrenheit é: " + soma);
   }
 }
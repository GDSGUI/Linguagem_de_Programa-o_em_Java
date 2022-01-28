package Aula02;
import javax.swing.*;
public class Ex04 {
    public static void main (String args [ ]) {
        int codigo = 0;  
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código"));
        switch (codigo) {      
            case 1 : System.out.println ("O código é um "); 
                break;
            case 2 : System.out.println ("O código é dois"); 
                break;
            case 3 : System.out.println ("O código é tres"); 
                break;
            default  : System.out.println ("Diversos");
        }
    } // fim do void main
} // fim da classe Positivo

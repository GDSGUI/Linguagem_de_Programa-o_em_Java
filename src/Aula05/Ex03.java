package Aula05;
import javax.swing.JOptionPane;

public class Ex03 {
    static int x,y;
 public static void main (String args [ ]) {
    x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor X "));
    y = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor Y "));
    Ordem();
 }
 
 static void Ordem() {
    if(x > y){
        JOptionPane.showMessageDialog(null,"Os números em ordem decrescente são: " + x + " , " + y);
       }
    else{
         JOptionPane.showMessageDialog(null,"Os números em ordem decrescente são: " + y + " , " + x);
        }
    }
}   

/*
Receba o ano de nascimento e o ano atual.
Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
*/

package Primeira_Atividade_29_07_2021;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Ano {
    public static void main (String args [ ] ) {
        
        int Nascimento, Atual, Daqui_17Anos;
        
        Nascimento = Integer.parseInt(JOptionPane.showInputDialog(" Qual Ano Você Nasceu?: "));
        Atual = LocalDate.now (). getYear ();
                JOptionPane.showMessageDialog(null,"O Ano Atual em que Estamos é: "+Atual);
                
        Daqui_17Anos = (Atual - Nascimento) + 17;
        
        JOptionPane.showMessageDialog(null,"Daqui 17 Anos Você terá: "+Daqui_17Anos);


   }
   
}

/*
19.	Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
Programador: Guilherme Gomes
Data:13/08/2021
*/
package Terceira_Atividade_12_08_2021.Estrutura_Decisao;
import javax.swing.JOptionPane;

public class Ordem_Crescente {
    public static void main(String[] args) {
        int Numero1, Numero2;

        Numero1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite Um Numero: "));
        Numero2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite Outro Numero: "));

        if(Numero1 < Numero2){
        JOptionPane.showMessageDialog(null,"A Ordem Crescente Será: "+"\n"+ Numero1+" > "+Numero2);
        }
        else{
            if(Numero1 > Numero2){
                JOptionPane.showMessageDialog(null,"A Ordem Crescente Será: "+"\n"+ Numero2+" > "+Numero1);
            }
            else{
                JOptionPane.showMessageDialog(null,"A Ordem Será a Mesma pois os Numeros São iguais");

            }
        }
    }
}

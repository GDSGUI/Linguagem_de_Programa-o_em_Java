/*
Programador: Guilherme Gomes
Data:13/08/2021
20.	Receba um valor inteiro.
Verifique e mostre se é divisível por 2 e 3.
*/

package Terceira_Atividade_12_08_2021.Estrutura_Decisao;
import javax.swing.JOptionPane;

public class Divisivel_2ou3 {
    public static void main(String[] args) {
        int Numero;

        Numero =  Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero: "));
        if(Numero %2 == 0){
            JOptionPane.showMessageDialog(null,"O Numero que Você Digitou: "+Numero+"\n"+" Ele é Divisivel por 2");
        }
        else{
            if(Numero %3 == 0){
            JOptionPane.showMessageDialog(null,"O Numero que Você Digitou: "+Numero+"\n"+" Ele é Divisivel por 3");
        }
        else{
            if(Numero %2 != 0 || Numero %3 != 0){
                JOptionPane.showMessageDialog(null,"O Numero que Você Digitou: "+Numero+"\n"+" Vai dar um Valor Quebrado");
                }
            }   
        }
    }
}
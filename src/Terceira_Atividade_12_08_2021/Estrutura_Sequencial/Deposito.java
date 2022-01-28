/*
Programador: Guilherme Gomes
Data: 12/08/2021
8.	Receba o valor de um depósito em poupança.
Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
*/
package Terceira_Atividade_12_08_2021.Estrutura_Sequencial;
import javax.swing.JOptionPane;

public class Deposito {
    public static void main(String[] args) {
        int Deposito;
        int Mes;

        Deposito =  Integer.parseInt(JOptionPane.showInputDialog("Qual é o do Deposito que você quer fazer?: "));
        Mes =  ((int) ((Deposito * 1.3)/100)+Deposito);

        JOptionPane.showMessageDialog(null,"A Cada Mês que Passar o Valor que Estiver na Poupança vai Render 1.3%");
        JOptionPane.showMessageDialog(null,"O Seu Deposito depois de 1 Mês Será de: R$"+" "+Mes+" Reais");

    }
}

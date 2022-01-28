/*
2.	Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
Programador: Guilherme Gomes
Data: 12/08/2021
*/ 
package Terceira_Atividade_12_08_2021.Estrutura_Sequencial;
import javax.swing.JOptionPane;

public class Reajuste {
    public static void main(String[] args) {
        int Salario, Reajuste;

        Salario = Integer.parseInt(JOptionPane.showInputDialog("Qual é o Seu Salario Bruto?: "));
        Reajuste = (int) (Salario * 0.15)+ Salario;
        JOptionPane.showMessageDialog(null,"Você recebeu um Reajuste de 15% no seu Salario");
        JOptionPane.showMessageDialog(null,"E o Seu Novo Salario é de: R$"+" "+Reajuste+" Reais");

    }
}
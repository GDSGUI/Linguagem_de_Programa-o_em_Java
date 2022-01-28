/*
Programador: Guilherme Gomes
Data: 12/08/2021
3.	Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
*/
package Terceira_Atividade_12_08_2021.Estrutura_Sequencial;
import javax.swing.JOptionPane;

public class Triangulo {
    public static void main(String[] args) {
        double Base;
        double Altura;
        double Soma;

        Base =  Integer.parseInt(JOptionPane.showInputDialog("Qual é a Base do Triangulo?: "));
        Altura =  Integer.parseInt(JOptionPane.showInputDialog("Qual é a Altura do Triangulo?: "));

        Soma = (Base * Altura)/2;

        JOptionPane.showMessageDialog(null,"A Area do Triangulo é: "+Soma);
    }
}

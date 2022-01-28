/*
Programador: Guilherme Gomes
Data: 12/08/2021
18.	Receba 4 notas bimestrais de um aluno.
Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
a.	Se a média for >= 6,0 exibir “APROVADO”;
b.	Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c.	Se a média for < 3,0 exibir “RETIDO”.

*/

package Terceira_Atividade_12_08_2021.Estrutura_Decisao;
import javax.swing.JOptionPane;

public class Notas {
    public static void main(String[] args) {
        double Nota1, Nota2, Nota3, Nota4;
        double Media;

        Nota1 =  Integer.parseInt(JOptionPane.showInputDialog("Qual foi sua Nota no Primeiro Bimestre?: "));
        Nota2 =  Integer.parseInt(JOptionPane.showInputDialog("Qual foi sua Nota no Segundo Bimestre?: "));
        Nota3 =  Integer.parseInt(JOptionPane.showInputDialog("Qual foi sua Nota no Terceiro Bimestre?: "));
        Nota4 =  Integer.parseInt(JOptionPane.showInputDialog("Qual foi sua Nota no Quarto Bimestre?: "));

        Media = (Nota1 + Nota2 + Nota3 + Nota4)/4;

        if(Media>=6){
            JOptionPane.showMessageDialog(null,"Sua Nota é: "+Media+"\n"+" Você foi Aprovado Parabens");
        }
        else{
            if(Media <3){
                JOptionPane.showMessageDialog(null,"Sua Nota é: "+Media+"\n"+"Sinto Muito Você foi Reprovado");
            }
        else{
            if(Media>=3 || Media<6){
                JOptionPane.showMessageDialog(null,"Sua Nota é: "+Media+"\n"+"Está em Exame");
                }
            }
        }
    }
}

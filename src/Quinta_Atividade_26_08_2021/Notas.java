package Quinta_Atividade_26_08_2021;
import javax.swing.JOptionPane;
/*
Programador: Guilherme Gomes
Data: 26/08/2021
Receba 4 notas bimestrais de um aluno.
Calcule a média aritmética. Mostre a mensagem de acordo
com a média (com passagem de parâmetro(s))
a. Se a média for >= 6.0 exibir “APROVADO”;
b. Se a média for >= 3.0 e < 6.0 exibir “EXAME”;
c. Se a média for < 3.0 exibir “RETIDO” 
*/
public class Notas {
    public static void main(String[] args) 
    {
        int Nota_1, Nota_2, Nota_3, Nota_4;
        Nota_1 = Integer.parseInt(JOptionPane.showInputDialog ("Digite a 1° Nota"));
	    Nota_2 = Integer.parseInt(JOptionPane.showInputDialog ("Digite a 2° Nota"));
        Nota_3 = Integer.parseInt(JOptionPane.showInputDialog ("Digite a 3° Nota"));
	    Nota_4 = Integer.parseInt(JOptionPane.showInputDialog ("Digite a 4° Nota"));
        Soma_Media(Nota_1, Nota_2, Nota_3, Nota_4);
    }

    static void Soma_Media(int PrimeiraN, int SegundaN, int TerceiraN, int QuartaN) {
        double media;
        media = ((double)(PrimeiraN + SegundaN + TerceiraN + QuartaN)/ 4);

        if(media >= 6){
        System.out.println("Você foi Aprovado Parabens"+"\n"+"Ah Sua Media é: "+ media);
        }
        else{
            if(media < 3){
                System.out.println("Sinto Muito Você foi Reprovado"+"\n"+"Ah Sua Media foi: "+ media);
            }
            
            else{
                if(media >= 3 || media < 6){
                System.out.println("Em Exame Ainda");
                }
            }
        }
    }
}

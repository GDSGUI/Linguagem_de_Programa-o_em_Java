package Aula02;
import javax.swing.*;

public class Ex03 {
        public static void main (String args [ ]) {
           double n1, n2, n3, n4, media; // declaração de variáveis
           // mensagem ao usuário e entrada de dados
           n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
           n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
           n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
           n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota bimestral"));
           media = (n1 + n2 + n3 + n4) / 4; // processamento de dados
           System.out.println ("A média é: " + media); // saída de resultados
           // Condicionais
           if (media >= 7) {
             System.out.println ("Aluno aprovado");
              }
           else {
                    if (media < 3)     {
                         System.out.println ("Aluno reprovado");
                     }
                else    {
                            System.out.println ("Aluno em exame");
                        } // do media < 3
        } // do media >= 7
    } // fim do void main
} //fim da classe} //fim da classe

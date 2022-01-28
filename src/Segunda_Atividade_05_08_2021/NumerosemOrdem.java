/*
Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem.
Mostre os 4 números em ordem crescente.
*/
/*
Programador: Guilherme Gomes
Data: 06/08/2021
*/
package Segunda_Atividade_05_08_2021;
import javax.swing.*;

public class NumerosemOrdem {
    public static void main (String args [ ]) {
    int A, B, C, D;
    A = 30;
    B = 60;
    C = 90;

    JOptionPane.showMessageDialog(null,"O Valor de A é: 30, o de B é:60, e de C é:90");

        D = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor para D: "));
        JOptionPane.showMessageDialog(null,"Iremos Colocar em Ordem Crescente ");


                if(D<=A && A<=B && B<=C){ ;
                    System.out.print("A Ordem Crescente é: "+D);
                    System.out.print(" > "+A);
                    System.out.print(" > "+B);
                    System.out.print(" > "+C);
                }
                else
                {
                    if(A<=D && D<=B && B<=C){ ;
                        System.out.print("A Ordem Crescente é: "+A);
                        System.out.print(" > "+D);
                        System.out.print(" > "+B);
                        System.out.print(" > "+C); 
                    }
                    else
                    {
                        if(A<=B && B<=D && D<=C){ ;
                            System.out.print("A Ordem Crescente é: "+A);
                            System.out.print(" > "+B);
                            System.out.print(" > "+D);
                            System.out.print(" > "+C); 
                        }
                        else
                    {
                        if(A<=B && B<=C && C<=D){ ;
                            System.out.print("A Ordem Crescente é: "+A);
                            System.out.print(" > "+B);
                            System.out.print(" > "+C);
                            System.out.print(" > "+D); 
                    }
                }
            }
        }
    }
}

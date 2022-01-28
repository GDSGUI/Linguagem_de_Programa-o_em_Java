/*
Receba 2 valores inteiros.
Calcule e mostre o resultado da diferença do maior pelo menor valor.
*/
/*
Programador: Guilherme Gomes
Data: 05/08/2021
*/
package Segunda_Atividade_05_08_2021;
import javax.swing.*;
public class Doisnumerosinteiros {
    public static void main (String args [ ] ) {
    int valor1, valor2, soma;

    valor1 = Integer.parseInt(JOptionPane.showInputDialog(" Digite um Primeiro valor : "));
    valor2 = Integer.parseInt(JOptionPane.showInputDialog(" Digite um Segundo Valor: "));

    if(valor1> valor2){
        soma = valor1 - valor2;
        System.out.print("O Maior Valor é: "+ valor1+"\n"+"O Menor Valor é: "+ valor2+"\n");
        System.out.print("A Diferença entre os 2 Valores é de: "+soma);
        }
        else
        {
            if(valor2> valor1){
                soma = valor2 - valor1;
                System.out.print("O Maior Valor é: "+ valor2+"\n"+"O Menor Valor é: "+ valor1+"\n");
                System.out.print("A Diferença entre os 2 Valores é de: "+soma);
            }
        else
        {
            soma = valor1 - valor2;
            System.out.print("Os Valores são iguais"+"\n"+"A Diferença entre os 2 Valores é: "+soma);
            }
        }
    }
}
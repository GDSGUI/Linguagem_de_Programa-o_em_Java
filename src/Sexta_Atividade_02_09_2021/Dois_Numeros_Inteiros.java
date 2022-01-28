package Sexta_Atividade_02_09_2021;
import javax.swing.JOptionPane;

/*
Receba 2 números inteiros, verifique qual o maior entre eles.
Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
*/
public class Dois_Numeros_Inteiros {
    
    static int N1, N2;
    public static void main (String args [ ]) {
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero "));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro Numero "));
        Ordem();
    }
    static void Ordem() {
         int Soma, Calculo;
         if(N1 > N2 || N2 > N1){
             Soma= N1 + N2;
             if(Soma %3==0){
                 Calculo = Soma/3;

                 if(N1 > N2){
                     System.out.println("O Maior Numero é: "+N1);
                 }
                 else{
                    System.out.println("O Maior Numero é: "+N2);
                 }
                 System.out.println("O Valor é: "+Soma);
                
                System.out.println(""+Calculo+" + "+Calculo+" + "+Calculo+" é igual ah: "+Soma);
             }
                    else{
                        System.out.println("Esse Valor não é um Número Impár");
            }
        }
    }  
}
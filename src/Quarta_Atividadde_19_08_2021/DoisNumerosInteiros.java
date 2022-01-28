package Quarta_Atividadde_19_08_2021;
/*
Programador: Guilherme Gomes
Data: 20/08/2021
Receba 2 números inteiros, verifique qual o maior entre eles.
Calcule e mostre o resultado da somatória dos números ímpares entre esses valores */
import javax.swing.JOptionPane;
public class DoisNumerosInteiros {
    public static void main(String[] args) {
        int N1, N2, Total, SomaN2, SomaN1;
        N1 = Integer.parseInt(JOptionPane.showInputDialog(" Digite o Primeiro Numero : "));
        N2 = Integer.parseInt(JOptionPane.showInputDialog(" Digite um Primeiro valor : "));

        if(N1 > N2){
            Total = N1 + N2;
            if(Total %2==0);
            while(N2 < Total){
                SomaN2 = N2;
                SomaN2 = SomaN2 + 2;
                System.out.println("O Numero "+N2 +" + 2 é igual: "+ SomaN2);
                N2 = N2 + 2;
            }
            System.out.print("Os 2 Valores que Você Digitou a soma entre eles é igual   ah: "+ Total);

        }
            else{
                if(N2 > N1){
                    Total = N1 + N2;
                    if(Total %2==0);
                    while(N1 < Total){
                        SomaN1 = N1;
                        SomaN1 = SomaN1 + 2;
                        System.out.println("O Numero "+N1 +" + 2 é igual: "+ SomaN1);
                        N1 = N1 + 2;
                }
                System.out.print("Os 2 Valores que Você Digitou a soma entre eles é igual   ah: "+ Total);
            }
            else{
                if(N1 > N2){
                    Total = N1 + N2;
                    if(Total %3==0);
                    while(N2 < Total){
                        SomaN2 = N2;
                        SomaN2 = (SomaN2 + 3) - 2;
                        System.out.println("O Numero "+N1 +" + 2 é igual: "+ SomaN2);
                        N2 = N2 + 3;
                    }
                    System.out.print("Os 2 Valores que Você Digitou a soma entre eles é igual   ah: "+Total);
            }
            else{
                if(N2 > N1){
                    Total = N1 + N2;
                    if(Total %3==0);
                    while(N1 < Total){
                        SomaN1 = N1;
                        SomaN1 = (SomaN1 + 3)-2;
                        System.out.println("O Numero "+N1 +" + 2 é igual: "+ SomaN1);
                        N1 = N1 + 3;
                    }
                    System.out.print("Os 2 Valores que Você Digitou a soma entre eles é igual   ah: "+Total);
                }
                else{
                    System.out.println("Esses Valores São iguais");
                }
                }
            }
        }
    }
}
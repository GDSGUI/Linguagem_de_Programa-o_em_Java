package Setima_Atividade_16_09_2021;
import javax.swing.JOptionPane;
/* 
Programador: Guilherme
Data: 16/09/2021
1.	Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
Venda Mensal  e	Preço Atual	Preço Novo
   < 500	   < 30	+ 10%
>= 500 e < 1000   >= 30 e < 80	+15%
>= 1000	>= 80	- 5%
Obs.: para outras condições, preço novo será igual ao preço atual.
*/
public class Media_mensal_produto {
    static double Preco_Atual, Media_Mensal, Calculo;
    public static void main(String[] args) {
    Preco_Atual = Integer.parseInt(JOptionPane.showInputDialog("Qual é o Preço Atual do produto?"));
    Media_Mensal = Integer.parseInt(JOptionPane.showInputDialog("Qual é a Média mensal desse Produto?"));
    Calculo();

    }
    static void Calculo(){
        double Soma, Preco_Novo;
        if(Media_Mensal < 500 && Preco_Atual < 30){
            Soma = (double)(Preco_Atual * 10)/ 100;
            Preco_Novo = Preco_Atual + Soma;
            JOptionPane.showMessageDialog(null," O Preço Novo será de: "+Preco_Novo);
        }
        else
        if(Media_Mensal < 1000 && Preco_Atual  < 80){
            Soma = (double)(Preco_Atual * 15)/ 100;
            Preco_Novo = Preco_Atual + Soma;
            JOptionPane.showMessageDialog(null," O Preço Novo será de: "+Preco_Novo);
        }
        else
        if(Media_Mensal >= 1000 && Preco_Atual >=80){
            Soma =(double)(Preco_Atual * 5)/ 100;
            Preco_Novo = Preco_Atual - Soma;
            JOptionPane.showMessageDialog(null," O Preço Novo será de: "+Preco_Novo);
        }
    else{
        JOptionPane.showMessageDialog(null, " O Preço será o mesmo de: "+Preco_Atual);
    }
    }
}

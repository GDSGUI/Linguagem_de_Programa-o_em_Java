package DecimaQuartaAtivida_04_11_2021;
import java.io.*;
import javax.swing.*;
public class MetodosNotas {
    public Notas[] CarregarNotas(Notas[] notas)throws IOException{
        int i = 0 ; 
        int escolha = 0;
        while (escolha < 1){
     notas[i].nota = escolha = Integer.parseInt(JOptionPane.showInputDialog (" Olá, Qual é o Valor que você Gostaria de Sacar?"));
     if (escolha >= 2 && escolha <= 3000 && escolha!=3){
         JOptionPane.showMessageDialog(null,"Pedido Realizado");
     }
     else if (escolha < 2 ){
         JOptionPane.showMessageDialog(null,"Por Favor Digite um Valor de No Minimo de 2 R$");
     }
     else if (escolha > 3000){
         JOptionPane.showMessageDialog(null,"Por Favor o Valor Limite para Sacar é de 3.000,00 R$, 'Não Digite um Valor Maior'");
     }
     else if (escolha == 3){
         JOptionPane.showMessageDialog(null,"Por Favor Escolha um Valor Diferente de 3,00 R$ para Sacar Pois não temos moedas Somente Cedulas");
     }
     else{
         JOptionPane.showMessageDialog(null,"VALOR SOLICITADO INVALIDO");
     }
        }
    return notas;
}
    public Notas [] Cedulas (Notas [] notas)throws IOException{
        int i;
        int diferenca3;
        int V200 = 200;
        int V100 = 100;
        int V50 = 50;
        int V20 = 20;
        int V10 = 10;
        int V5 = 5;
        int V2 = 2;
        for (i = 0 ; i < 6; i++){
            if (V200 >= V200){
                V200 = notas[i].nota / 200;
                notas[i].nota = notas[i].nota  % 200;
                if (V200 != 0)
                    JOptionPane.showMessageDialog(null,V200+" Notas de R$ 200,00 Reais");
            }
            if (V100 >= V100){
                V100 = notas[i].nota / 100;
                notas[i].nota = notas[i].nota  % 100;
                if (V100 != 0)
                    JOptionPane.showMessageDialog(null,V100+" Notas de R$ 100,00 Reais");
            }
            if (V50 >= V50){
                V50 = notas[i].nota / 50;
                notas[i].nota = notas[i].nota  % 50;
                if (V50 != 0)
                    JOptionPane.showMessageDialog(null,V50+" Notas de R$ 50,00 Reais");
            }
            if (V20 >= V20){
                V20 = notas[i].nota / 20;
                notas[i].nota = notas[i].nota  % 20;
                if (V20 != 0)
                    JOptionPane.showMessageDialog(null,V20+" Notas de R$ 20,00 Reais");
            }
            if (V10 >= V10){
                V10 = notas[i].nota / 10;
                notas[i].nota = notas[i].nota  % 10;
                if (V10 != 0)
                    JOptionPane.showMessageDialog(null,V10+" Notas de R$ 10,00 Reais");
            }
            if (V5 >= V5){
                V5 = notas[i].nota / 5;
                notas[i].nota = notas[i].nota  % 5;
                if (V5 != 0)
                    JOptionPane.showMessageDialog(null,V5+" Notas de R$ 5,00 Reais");
            }
            if (V2 >= V2){
                V2 = notas[i].nota / 2;
                notas[i].nota = notas[i].nota  % 2;
                if (V2 != 0)
                    JOptionPane.showMessageDialog(null,V2+" Notas de R$ 2,00 Reais");
            }
        }
        return notas;
    }
    public Notas [] Estatistica (Notas [] notas)throws IOException{
        int i = 0;
        int Valor_Cedula, Resto_Cedula;
        int V200 = 200 * 100;
        int V100 = 100 * 100;
        int V50 = 50 * 100;
        int V20 = 20 * 100;
        int V10 = 10 * 100;
        int V5 = 5 * 100;
        int V2 = 2 * 100;
        
        Valor_Cedula = V200 + V100 + V50 + V20 + V10 + V5 + V2;
        Resto_Cedula = Valor_Cedula - notas[i].nota;        
        JOptionPane.showMessageDialog(null,"O Valor Restante no Caixa é: R$ "+Resto_Cedula+" Reais");
        
    return notas;
    }
}

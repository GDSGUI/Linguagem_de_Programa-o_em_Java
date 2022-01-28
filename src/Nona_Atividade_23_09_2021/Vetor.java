package Nona_Atividade_23_09_2021;
import javax.swing.JOptionPane;

public class Vetor {
    public static void main(String[] args) {
        int i;
        Double Quantidade [ ] = new Double [5];
        Double Preco [ ] = new Double [5];
        Double Total_Geral, Total_Venda,Total_Quantidade, Total_Preco, Comissao;
        Total_Geral = (double) 0;
        for ( i = 0 ; i <= 4 ; i++ ){
            Quantidade[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade vendida do "+(i+1)+ "° Produto"));
        }
        for ( i = 0 ; i <= 4 ; i++ ){
            Preco[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do "+(i+1)+ "° Produto"));
        }
        {
        for ( i = 0 ; i <= 4 ; i++ ){

            {JOptionPane.showMessageDialog(null,"Quantidade Vendida do " + (i+1) + "° Produto = "+Quantidade[i]);
            Total_Quantidade = 0 + Quantidade[i];

        }
            
            {JOptionPane.showMessageDialog(null,"Valor do " + (i+1) + "° Produto = " +Preco[i]);}
            Total_Preco = 0 + Preco[i];

            Total_Venda = Total_Quantidade * Total_Preco;
            JOptionPane.showMessageDialog(null,"Total da Venda do "+(i+1)+"° Produto = " +Total_Venda);
        
        {
        
            Total_Geral = Total_Geral + Total_Venda;
        
        }
            Comissao = (Total_Geral * 5)/ 100;
            JOptionPane.showMessageDialog(null,"Valor Total da Venda é = " +Total_Geral);
            JOptionPane.showMessageDialog(null,"O Valor da Comissão é = " + Comissao);
    }
    }
        }
    }
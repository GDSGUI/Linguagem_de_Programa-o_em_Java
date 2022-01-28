package Aula09;
import javax.swing.*;

public class Ex01 {
    public static void main(String[] args) {
        // declaração de variáveis e/ou constantes
	int i;
    double media , soma = 0;     
  double notas[ ] = new double [4];
  // processamento de dados
     for ( i = 0 ; i <= 3 ; i++ )  {
     // mensagem ao usuário e entrada de dados
     notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota "  +(i+1)));
     soma = soma + notas[i];
  } // for
  media = soma/4;
  // saída de resultados
  JOptionPane.showMessageDialog(null,"A média é: " +media);
 } // void main
} // classe MediaAritmetica 


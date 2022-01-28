package Codigo_fonte2;

import javax.swing.*;
public class ClassePrincipal {
public static void main(String[] args) {
Cidade[] cidade = new Cidade[3];
int i;
Classe_Metodos x = new Classe_Metodos();
for (i = 0; i < 3; i++){
cidade [i] = new Cidade();
}
int opc = 0 ;
while (opc!=9){
opc = Integer.parseInt(JOptionPane.showInputDialog
("1 - Cadastro Estatística \n 2 - Consulta por quantidade de acidentes \n 3 - Consulta por estatísticas de acidentes \n 4 - Acidentes acima da média das 10 cidades \n 9 - Finaliza"));
switch (opc) {
case 1 : cidade = x.CodigoCidade(cidade); // CHAMADA FUNÇÃO
break;
case 2 : x.Acidentes(cidade); // CHAMADA PROCEDIMENTO
break;
case 3 : x.Estatistica(cidade);
break;
case 4 : x.Maior(cidade);
break;
case 9 : JOptionPane.showMessageDialog(null,"Programa finalizado");
break;
default : JOptionPane.showMessageDialog(null,"Opção Inválida");
} // FECHA SWITCH
} // FECHA WHILE
} // FECHA METODO PRINCIPAL
}
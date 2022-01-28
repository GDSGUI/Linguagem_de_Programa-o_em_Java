package DecimaTerceiraAtividade;
import java.io.IOException;
import javax.swing.*;
/*
Programador: Guilherme Gomes dos Santos
Data: 01/011/2021
*/
public class ClassePrincipal {
    public static void main(String args[]) throws IOException{
Cidade[] cidade = new Cidade[10];
int i;
Classe_Metodos x = new Classe_Metodos();
for (i = 0; i < 10; i++){
cidade [i] = new Cidade();
}
int opc = 0 ;
while (opc!=9){
opc = Integer.parseInt(JOptionPane.showInputDialog
("1 - Cadastro Estatística \n 2 - Consulta por quantidade de acidentes \n 3 - Consulta por estatísticas de acidentes \n 4 - Acidentes acima da média das 10 cidades \n 9 - Finaliza"));
switch (opc) {
case 1 : x.GravaCidade(cidade); // CHAMADA PROCEDIMENTO
break;
case 2 : x.LerConsulta(cidade);
break;
case 3 : x.Separar_Maior_Menor(cidade);
break;
case 4 : x.Maior_todos(cidade);
break;
case 9 : JOptionPane.showMessageDialog(null,"Programa finalizado");
break;
default : JOptionPane.showMessageDialog(null,"Opção Inválida");
} // FECHA SWITCH
} // FECHA WHILE
} // FECHA METODO PRINCIPAL
}
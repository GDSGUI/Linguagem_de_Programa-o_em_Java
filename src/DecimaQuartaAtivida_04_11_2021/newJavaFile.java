package DecimaQuartaAtivida_04_11_2021;
import java.io.IOException;
import javax.swing.*;
/*
Programador: Guilherme
Caixa Eletronico
 */
public class newJavaFile {    
    public static void main(String args[]) throws IOException{
        int i;
        Notas [ ] notas = new Notas [6];
        MetodosNotas x = new MetodosNotas();
  for (i = 0 ; i < 6 ; i++){
       notas[i] = new Notas();
  }
 
  int opc = 0 ;
  while (opc!=9){
     opc = Integer.parseInt(JOptionPane.showInputDialog
              ("1 – Carregar Notas\n" + "2 – Retirar Notas\n" + "3 – Estatística\n" + "9 – Fim"));
     switch (opc) {
            case 1 : notas = x.CarregarNotas(notas);
            break;
            case 2 : x.Cedulas(notas);
            break;
            case 3 : x.Estatistica(notas);
            break;
            case 9 : JOptionPane.showMessageDialog(null,"Programa finalizado");
            break;
            default : JOptionPane.showMessageDialog(null,"Opção Inválida");
            break;
         }
  }
 }
    }
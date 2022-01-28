package DecimaPrimeira_Atividade_07_10_2021;
import javax.swing.JOptionPane;
/*
Calcule a média dos alunos de uma disciplina.
Considere uma matriz de 3 linhas e 2 colunas. Cada linha está associada a um aluno de uma determinada disciplina.
O programa solicita a nota de cada aluno, retorna a média de cada aluno ((nota1+nota2) /2) em um vetor 3 linhas
*/
public class Notas {
    ClasseAlunos m = new ClasseAlunos();
    
    public static void main (String args[]) {
        ClasseAlunos m = new ClasseAlunos();
        int[][] Alunos= new  int[3][2];
        double [] Media = new double[3];
        int opcoes = 0;
      do {
       opcoes = Integer.parseInt(JOptionPane.showInputDialog("1 - CarregarNotas \n2 - CalcularMedia \n3 - MostrarMedia \n9 - Finalizar"));
       switch (opcoes)
            {
                  case 1: Alunos = m.CarregarNotas(Alunos);
                               break;
                  case 2: Media = m.CalcularMedia(Alunos);
                               break;
                  case 3: m.MostrarMedia(Media);
                               break;
                  case 9: JOptionPane.showMessageDialog(null,"finaliza");
                               break;
                  default: JOptionPane.showMessageDialog(null,"opc inválida");
            }
      }
      while(opcoes != 9);
   }
}
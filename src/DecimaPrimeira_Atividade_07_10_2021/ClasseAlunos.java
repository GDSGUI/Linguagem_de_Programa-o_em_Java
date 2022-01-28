package DecimaPrimeira_Atividade_07_10_2021;
import javax.swing.JOptionPane;
public class ClasseAlunos {
 
 public int[ ][ ] CarregarNotas(int Alunos [ ][ ]) {
int i, j;
for(i = 0 ; i<3 ; i++) {
for ( j=0; j<2; j++) {
Alunos[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite a Nota " +(j+1)+ " do " +(i+1)+"° Aluno"));
}
}
return Alunos;
}
public double[] CalcularMedia(int Alunos[][]) {
  int i, j;
  double [] media = new double[3];
  for(i = 0 ; i <3 ; i++) {
    for(j = 0 ; j<2 ; j++) {
      media[i] = media[i] + Alunos[i][j];
    }
    media [i] = (media[i]/2);
  }
  JOptionPane.showMessageDialog(null,"Medias Calculadas com sucesso");
  return media;
}
public void MostrarMedia(double media[]) {
  String mostra = " ";
  for(int i = 0 ; i <3 ; i++) {
    mostra += ("\n "+"A média do " +(i+1)+ "° Aluno é: " +media[i]);
  }
  JOptionPane.showMessageDialog(null,mostra);
}
}
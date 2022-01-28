package Decima_Atividade_30_09_2021;
/*

*/
import javax.swing.*;
public class Alunos_Matrizes {
public static void main(String[] args) {
   int i, j;
   double Alunos [ ] [ ] = new double [3] [2];
   double media,MediaP1, MediaP2, soma, SomaP1, SomaP2;
   SomaP1 = 0.0;
   SomaP2 = 0.0;
   MediaP1 = 0.0;
   MediaP2 = 0.0;
   for (i = 0 ; i < 3 ; i++ )
   {
       media = 0.0;
       soma = 0.0;
       for (j = 0 ; j < 2 ; j++) 
       {
           Alunos[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota " +(j+1)+ " do " +(i+1)+"° Aluno"));
           soma = soma + Alunos[i][j];
           if (j==0)
           {
               SomaP1 = SomaP1 + Alunos [i] [0] ;
            }
            else
            {
    SomaP2 = SomaP2 + Alunos [i] [1] ;
            }
        }  
        media = soma/2;
        System.out.println ("A média do " +(i+1)+ "° Aluno é: " + media);
    }   
    MediaP1 = SomaP1/3;
    MediaP2 = SomaP2/3;
    System.out.println ("A média 1° Prova é: " + MediaP1);
    System.out.println ("A média 2° Prova é: " + MediaP2);
    }
}

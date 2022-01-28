package Codigo_fonte2;

import javax.swing.*;
public class Classe_Metodos {
  public Cidade[] CodigoCidade(Cidade[] cidade){
         int i;
         for (i = 0 ; i < 3 ; i++){
             cidade[i].codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo da "+ (i+1) +" ° Cidade"));
             cidade[i].nome = JOptionPane.showInputDialog("Digite o Nome da " + (i+1) +"° Cidade");
             cidade[i].quantidade =Integer.parseInt(JOptionPane.showInputDialog("Digite o N° de Acidentes da "+ (i+1) +"° Cidade"));
         }
         return cidade;
    }

public void Acidentes(Cidade[] cidade){
        int i;
        for (i = 0 ; i < 3; i++)
            {
              if(cidade[i].quantidade > 100 && cidade[i].quantidade < 500){
                 System.out.println("Codigo: "+cidade[i].codigo+"\n"+"Cidade: "+cidade[i].nome +"\n"+"N° de Acidentes: "+cidade[i].quantidade+"\n");
            }

            }
 }
 
public void Estatistica(Cidade[] cidade){
    int i;
      int qtd_Maior, qtd_Menor;
      int codigo_Maior = 0;
      int codigo_Menor = 0;
      String Nome_Maior = " ";
      String Nome_Menor = " ";
      qtd_Maior = 0;
      qtd_Menor = 0;

      qtd_Maior =  cidade[0].quantidade;
      qtd_Menor =  cidade[0].quantidade;

      for (i = 0 ; i < 3; i++)
         {

             if (cidade[i].quantidade >= qtd_Maior)
                {
                   qtd_Maior = cidade[i].quantidade;
                   Nome_Maior = cidade[i].nome;
                   codigo_Maior = cidade[i].codigo;
                }
               if (cidade[i].quantidade <= qtd_Menor)
                {
                   qtd_Menor = cidade[i].quantidade;
                   Nome_Menor = cidade[i].nome;
                   codigo_Menor = cidade[i].codigo;
                }
         }

              System.out.println("Codigo: "+codigo_Maior+"\n"+"Cidade: "+Nome_Maior+"\n"+ "O Maior N° de Acidentes foi de: "+qtd_Maior);

             System.out.println("Codigo: "+codigo_Menor+"\n"+"Cidade: "+Nome_Menor+"\n"+ "O Menor N° de Acidentes foi de: "+qtd_Menor+"n");
      }
 
public void Maior(Cidade[] cidade){
    int i;
      int qtd_Maior;
      int codigo_Maior = 0;
      String Nome_Maior = " ";
      qtd_Maior = 0;

      qtd_Maior =  cidade[0].quantidade+cidade[0].quantidade; 
      for (i = 0 ; i < 1; i++) 
         {

             if (cidade[i].quantidade > qtd_Maior) 
                {
                   qtd_Maior = cidade[i].quantidade;
                   Nome_Maior = cidade[i].nome;
                   codigo_Maior = cidade[i].codigo;
                }
         }
      System.out.println("A Cidade com Quantidade de Acidentes Acima das outras ");
      System.out.println("Codigo: "+codigo_Maior+"\n"+"Cidade: "+Nome_Maior+"\n"+ "O Maior N° de Acidentes foi de: "+qtd_Maior);
      }
}
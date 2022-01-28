package DecimaTerceiraAtividade;
import java.io.*;
import javax.swing.*;
public class Classe_Metodos {
    
    public Cidade[] GravaCidade(Cidade[] cidade)throws IOException{
        int i;  String fileName = "ArquivoAluno.txt";	
      BufferedWriter coletar = new BufferedWriter(new FileWriter( fileName ));
         for (i = 0 ; i < 10 ; i++){cidade[i] = new Cidade();  }
     for (i = 0 ; i < 10 ; i++)  {
             cidade[i].codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo da "+ (i+1) +" ° Cidade"));
             coletar.write(Integer.toString(cidade[i].codigo)); coletar.newLine();
             cidade[i].nome = JOptionPane.showInputDialog("Digite o Nome da " + (i+1) +"° Cidade");
             coletar.write( cidade[i].nome ); coletar.newLine();
             cidade[i].quantidade =Integer.parseInt(JOptionPane.showInputDialog("Digite o N° de Acidentes da "+ (i+1) +"° Cidade"));
             coletar.write(Integer.toString(cidade[i].quantidade)); coletar.newLine();
         }
         System.out.println("COLETA DE DADOS REALIZADA COM SUCESSO ");
         coletar.close();
         return cidade;
    }
    
public void LerConsulta (Cidade[] cidade) throws IOException{
    int i;	
    String fileName = "ArquivoAluno.txt";	
    BufferedReader ler = new BufferedReader(new FileReader( fileName ));	
    for (i = 0 ; i < 10 ; i++){ cidade[i] = new Cidade();
    
    cidade[i].codigo = Integer.parseInt(ler.readLine());	
    cidade[i].nome = ler.readLine();	
    cidade[i].quantidade = Integer.parseInt(ler.readLine());
    }
    for (i = 0 ; i < 10; i++) {
            if (cidade[i].quantidade >100 && cidade[i].quantidade < 500){
          System.out.println("Codigo: "+cidade[i].codigo + " Nome: " + cidade[i].nome + " n° de Acidentes: " +cidade[i].quantidade);
    }
     ler.close();	
    }
  }
public void Separar_Maior_Menor (Cidade[] cidade) throws IOException{
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
String fileName = "ArquivoAluno.txt";	
    BufferedReader separar = new BufferedReader(new FileReader( fileName ));	
    for (i = 0 ; i < 10 ; i++){ cidade[i] = new Cidade();
    cidade[i].codigo = Integer.parseInt(separar.readLine());	
    cidade[i].nome = separar.readLine();	
    cidade[i].quantidade = Integer.parseInt(separar.readLine());
      for (i = 0 ; i < 10; i++)
         {
             if (cidade[i].quantidade >= qtd_Maior)
                {
                   qtd_Maior  = cidade[i].quantidade;
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
               System.out.println("Codigo: "+codigo_Maior+"\n"+"Cidade: "+Nome_Maior+"\n"+ "O Maior N° de Acidentes foi de: "+qtd_Maior+"\n");
             System.out.println("Codigo: "+codigo_Menor+"\n"+"Cidade: "+Nome_Menor+"\n"+ "O Menor N° de Acidentes foi de: "+qtd_Menor+"\n");
      }
    separar.close();
}
public void Maior_todos (Cidade[] cidade) throws IOException{
    int i;
    int qtd_Maior;
      int codigo_Maior = 0;
      String Nome_Maior = " ";

      qtd_Maior =  cidade[0].quantidade + cidade[0].quantidade;
    String fileName = "ArquivoAluno.txt";	
    BufferedReader maior = new BufferedReader(new FileReader( fileName ));
    
    for (i = 0 ; i < 10 ; i++){ cidade[i] = new Cidade();
    cidade[i].codigo = Integer.parseInt(maior.readLine());	
    cidade[i].nome = maior.readLine();	
    cidade[i].quantidade = Integer.parseInt(maior.readLine());
      for (i = 0 ; i < 10; i++)
         {
             if (cidade[i].quantidade >= qtd_Maior)
                {
                   qtd_Maior  = cidade[i].quantidade;
                   Nome_Maior = cidade[i].nome;
                   codigo_Maior = cidade[i].codigo;
                }
     }
             System.out.println("A Cidade com Quantidade de Acidentes Acima das outras ");
     
      System.out.println("Codigo: "+codigo_Maior+"\n"+"Cidade: "+Nome_Maior+"\n"+ "O Maior N° de Acidentes foi de: "+qtd_Maior);
     }
maior.close();
}
}
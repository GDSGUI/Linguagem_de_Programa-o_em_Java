import java.io.*;
import javax.swing.*;	
 public class ClasseMetodos {
     
  public void GravaAluno (Aluno[ ] aluno  ) throws IOException {	
      int i;  String fileName = "ArquivoAluno.txt";	
      BufferedWriter gravar = new BufferedWriter(new FileWriter( fileName ));	
    
     for (i = 0 ; i < 3 ; i++)  {	
          gravar.write( aluno[i].pnome ); gravar.newLine();	
          gravar.write( aluno[i].unome );   gravar.newLine();	
          gravar.write(Integer.toString(aluno[i].pontos));   gravar.newLine(); 
       } 
           System.out.println("GRAVAÇÃO FEITA COM SUCESSO ");	
           gravar.close();
  } 
   
   public void LerAluno ( Aluno[ ] aluno ) throws IOException	 {	
     int i;	
    String fileName = "ArquivoAluno.txt";	
    BufferedReader ler = new BufferedReader(new FileReader( fileName ));	
    for (i = 0 ; i < 3 ; i++)   {
          aluno[i] = new Aluno(); }
    for (i = 0 ; i < 3 ; i++)   {	
          aluno[i].pnome = ler.readLine();  	
          aluno[i].unome = ler.readLine();	
          aluno[i].pontos = Integer.parseInt(ler.readLine());    }	
  	
    for (i = 0 ; i < 3; i++) {	
          System.out.println(aluno[i].pnome + " " + aluno[i].unome + " pontos: " + aluno[i].pontos);   }
     ler.close();	
  }	
}	
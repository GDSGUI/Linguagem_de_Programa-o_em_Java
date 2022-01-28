package Aula06;

public class Ex01 {
    class Dados3 {
        static String Dados (String disc , String fac)
        {  
          String mens;
          mens = "nome da disciplina => " + disc + "\n nome da instituição de ensino =>" + fac;
          return mens;
        } 
         
       public static void main (String arg [ ]) {
            String m;
            m = Dados("Linguagem de Programação", "FATEC – ZONA LESTE ");
            System.out.println(" " +m);
           }
      } 
}

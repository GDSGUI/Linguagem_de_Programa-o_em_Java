package Aula06;

public class Ex03 {
    public static void main(String[] args) {
        String m;
        m = Dados1();
        System.out.println(" " +m);
    }

    static String Dados1 ()
    {
        String disc, fac, mens;
        disc = "Linguagem de Programação ";
        fac = "FATEC - ZONA LESTE";
        mens = "nome da disciplina => " + disc + "\n nome da instituição de ensino =>" + fac;
        return mens;
    }
}

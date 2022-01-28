package Quarta_Atividadde_19_08_2021;
/*
Programador: Guilherme Gomes
Data: 21/08/2021
Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7. */
public class DoisDados {
    public static void main(String[] args) {
        int Dado1 = 1;
        int Dado2 = 6;
        int Limite;
        int Limite1;

        while(Dado1 < 7){
            Limite  = Dado1;
            Limite1 = Dado2;
            Limite = Limite + Limite1;
            System.out.println(" "+Dado1+" +"+" "+Dado2+" é igual ah: " + Limite);
        
            Dado1 = Dado1 + 1;
            Dado2 = Dado2 - 1;
        }
    }
}
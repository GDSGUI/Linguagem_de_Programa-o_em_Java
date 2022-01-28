package Quarta_Atividadde_19_08_2021;
/*
Programador: Guilherme Gomes
Data: 19/08/2021
Calcule e mostre o quadrado dos números entre 10 e 150.*/
public class MostraraoQuadrado {
    public static void main(String[] args) {
    int Numero = 1;
    int Limite;

    while(Numero <= 150){
        Limite  = Numero;
        Limite = Limite * Limite;
        System.out.println("O Valor de "+Numero+" Ao Quadrado é: " + Limite);

        Numero = Numero+1;
        }
    }
}
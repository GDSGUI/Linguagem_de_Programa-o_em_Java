package Quinta_Atividade_26_08_2021;
import javax.swing.*;
/*
Programador: Guilherme Gomes
Data: 28/08/2021
Receba a hora de início e de final de um jogo (HH,MM),
calcular o tempo do jogo em horas e minutos, sabendo
que o tempo máximo é menor que 24 horas e pode
começar num dia e terminar em outro.
*/
public class Horas {
    public static void main(String[] args) {
        int Hora_Inicial, Hora_Final;
        int Minuto_Inicial, Minuto_Final;
        int Tempo_Hora, Tempo_Minuto;

        Hora_Inicial = Integer.parseInt(JOptionPane.showInputDialog("Qual é o Horario Inicial do Jogo?"));
        Minuto_Inicial = Integer.parseInt(JOptionPane.showInputDialog("Qual é o Minuto Inicial do Jogo?"));
        Hora_Final = Integer.parseInt(JOptionPane.showInputDialog("Qual é o Horario Final do Jogo?"));
        Minuto_Final = Integer.parseInt(JOptionPane.showInputDialog("Qual é o Minuto Final do Jogo?"));

        if(Hora_Inicial <= Hora_Final && Minuto_Inicial <= Minuto_Final){
            Tempo_Hora = Hora_Final - Hora_Inicial;
            Tempo_Minuto = Minuto_Final - Minuto_Inicial;
            System.out.println("O Jogo Durou "+Tempo_Hora+" Horas e "+ Tempo_Minuto+" Minutos");

        }
        else{
        if(Hora_Final <= Hora_Inicial && Minuto_Final <= Minuto_Inicial){
            Tempo_Hora = Hora_Final + 24 - Hora_Inicial;
            Tempo_Minuto = Minuto_Final + 59 - Minuto_Inicial;
            System.out.println("O Jogo Durou "+Tempo_Hora+" Horas e "+ Tempo_Minuto+" Minutos");

        }
        else{
            if(Hora_Inicial <= Hora_Final && Minuto_Inicial >= Minuto_Final){
                Tempo_Hora = Hora_Final - Hora_Inicial;
                Tempo_Minuto = Minuto_Inicial - Minuto_Final;
                System.out.println("O Jogo Durou "+Tempo_Hora+" Horas e "+ Tempo_Minuto+" Minutos");

        }
        else{
            if(Hora_Inicial >= Hora_Final && Minuto_Final >= Minuto_Inicial){
            Tempo_Hora = Hora_Inicial - Hora_Final;
            Tempo_Minuto = Minuto_Final - Minuto_Inicial;
            System.out.println("O Jogo Durou "+Tempo_Hora+" Horas e "+ Tempo_Minuto+" Minutos");


        }
        else{
            if(Hora_Inicial >= Hora_Final && Minuto_Inicial >= Minuto_Final){
            Tempo_Hora = Hora_Final + 24 - Hora_Inicial;
            Tempo_Minuto = Minuto_Final + 59 - Minuto_Inicial;
            System.out.println("O Jogo Durou "+Tempo_Hora+" Horas e "+ Tempo_Minuto+" Minutos");

        }
        else{
            if(Hora_Final >= Hora_Inicial && Minuto_Inicial >= Minuto_Final){
            Tempo_Hora = Hora_Final - Hora_Inicial;
            Tempo_Minuto = Minuto_Final + 59 - Minuto_Inicial;
            System.out.println("O Jogo Durou "+Tempo_Hora+" Horas e "+ Tempo_Minuto+" Minutos");
            }
        else{
            System.out.println("Erro Valor Invalido!");
        }

                        }
                    }
                }
            }
        }
    }
}

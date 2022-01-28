/*
Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l.
Receber o tempo de percurso e a velocidade média.
*/
package Primeira_Atividade_29_07_2021;
import javax.swing.JOptionPane;

public class KM {
    public static void main(String args[]){
        int KM_Litro = 12, Tempo, Velocidade_Media, Distancia, Consumo;
        Tempo = Integer.parseInt(JOptionPane.showInputDialog(" Qual foi o Tempo Gasto na Viagem?: "));
        Velocidade_Media = Integer.parseInt(JOptionPane.showInputDialog("Qual foi a Velocidade Media em KM/H?: "));
        Distancia = Tempo*Velocidade_Media;
        Consumo = Distancia / KM_Litro;
        
        JOptionPane.showMessageDialog(null,"A Distancia Percorrida foi de: "+Distancia);
        JOptionPane.showMessageDialog(null,"O Consumo foi de: "+Consumo);
    }
}

/*
Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes.
Calcule o salário que serão as horas trabalhadas x o valor por hora.
Calcule o salário líquido (= Salário Bruto – desconto).
A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber
 */
package Primeira_Atividade_29_07_2021;
import javax.swing.JOptionPane;

public class Folha_de_Pagamento {
    public static void main(String args[]){
        int Hrs_Trabalhadas, Salario_Hora, Desconto_VR, Desconto_VT, Descendentes, 
                soma_VR, soma_VT,Descendente_Soma, Slr_Bruto, soma_Slr_Liquido;
        
        Slr_Bruto = Integer.parseInt(JOptionPane.showInputDialog(" Qual o Valor do seu Salario Bruto?: "));
        Hrs_Trabalhadas = Integer.parseInt(JOptionPane.showInputDialog(" Total de Horas Trabalhadas no Mês?: "));
        Desconto_VR = Integer.parseInt(JOptionPane.showInputDialog(" Qual é o desconto do seu VR?: "
                + "Se Não tiver coloque Zero:"));
        Desconto_VT = Integer.parseInt(JOptionPane.showInputDialog(" Qual é o desconto do seu VT?: "
                + "Se Não tiver coloque Zero:"));
        Descendentes = Integer.parseInt(JOptionPane.showInputDialog(" Você tem filhos?"
                + "Senão Tiver Coloque Zero "));
        Salario_Hora = (Slr_Bruto/Hrs_Trabalhadas);
        soma_VR = (int) (Slr_Bruto*Desconto_VR)/100;
        soma_VT = (int) (Slr_Bruto*Desconto_VT)/100;
        Descendente_Soma =(Descendentes * 100);
        soma_Slr_Liquido = Slr_Bruto+Descendente_Soma - ((soma_VR + soma_VT ));
        
        JOptionPane.showMessageDialog(null,"O Seu Salrio Hora é: "+"R$"+Salario_Hora);
        JOptionPane.showMessageDialog(null,"O Desconto do VR é de: "+"R$"+soma_VR);
        JOptionPane.showMessageDialog(null,"O Desconto do VT é de: "+"R$"+soma_VT);
        JOptionPane.showMessageDialog(null,"Você tem um Adicional por descendentes de: " + "R$"+Descendente_Soma);
        JOptionPane.showMessageDialog(null,"O Seu Salrio Liquido será de: "+"R$"+soma_Slr_Liquido);

    }

    
}

/*
Receba o código correspondente ao cargo de um funcionário e seu salário atual e mostre o cargo, o valor do aumento e seu salário.
Os cargos estão na tabela. (Utilizar estrutura switch... case).
*/
/*
Programador: Guilherme Gomes
Data: 06/08/2021
*/
package Segunda_Atividade_05_08_2021;
import javax.swing.*;

public class Cargos {
    public static void main(String[] args) {
        int Cargo1 = (int) 50; int Cargo2 = (int)35; int Cargo3 = (int)20; int Cargo4 = (int)10;
        int Cargo = 0;
        int Salario, Soma1, Soma2, Soma3, Soma4, Total1, Total2, Total3, Total4;

        JOptionPane.showMessageDialog(null,"Cargos"+"\n"
        +"Cargo1 = Escriturário"+"\n"
        +"Cargo2 = Secretário"+"\n"
        +"Cargo3 = Caixa"+"\n"
        +"Cargo4 = Gerente"+"\n"
        +"Cargo5 = “Não há cargo”");

        Salario = Integer.parseInt(JOptionPane.showInputDialog("Qual o Seu Salario Bruto?: "));
        Cargo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Seu Cargo"));
        Soma1 = ((Salario * (int) Cargo1)/100);Total1 = Soma1 + Salario;
        Soma2 = ((Salario * (int) Cargo2)/100);Total2 = Soma2 + Salario;
        Soma3 = ((Salario * (int) Cargo3)/100);Total3 = Soma3 + Salario;
        Soma4 = ((Salario * (int) Cargo4)/100);Total4 = Soma4 + Salario;

        switch (Cargo) {
       case 1 : 
       Cargo1: System.out.println ("O Seu Cargo é Escriturário"+"\n"+"E o seu Salario é: "+"R$ "+Salario);
       System.out.println("Você ganhou um adicional de: "+"R$ "+Soma1+"\n"+"E o seu Novo Salario será: "+Total1);
        break;
       case 2 :
       Cargo2: System.out.println ("O Seu Cargo é Secretário"+"\n"+"E o seu Salario é: "+"R$ "+Salario);
        System.out.println("Você ganhou um adicional de: "+"R$ "+Soma2+"\n"+"E o seu Novo Salario será: "+Total2);
        break;
        case 3 :
        Cargo3: System.out.println ("O Seu Cargo é Caixa"+"\n"+"E o seu Salario é: "+"R$ "+Salario);
        System.out.println("Você ganhou um adicional de: "+"R$ "+Soma3+"\n"+"E o seu Novo Salario será: "+Total3);
        break;
        case 4 :
        Cargo4 : System.out.println ("O Seu Cargo é Gerente"+"\n"+"E o seu Salario é: "+"R$ "+Salario);
        System.out.println("Você ganhou um adicional de: "+"R$ "+Soma4+"\n"+"E o seu Novo Salario será: "+Total4);
                                                          break;
        default  : System.out.println ("“Não há cargo”");
        }
    }
}
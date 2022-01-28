package Aula11;
import javax.swing.JOptionPane;
public class ClassePrincipal {
    public static void main (String args[]) {
        ClasseMetodos m = new ClasseMetodos();
        int v[ ] = new  int[5];
        int opc = 0;
      do {
       opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carregar \n2 - Classificar \n3 - Mostrar \n9 - Finalizar"));
       switch (opc)
            {
                  case 1: v = m.FunçãoCarrega(v);
                               break;
                  case 2: v = m.FunçãoClassifica(v);
                               break;
                  case 3: m.ProcedimentoMostra(v);
                               break;
                  case 9: JOptionPane.showMessageDialog(null,"finaliza");
                               break;
                  default: JOptionPane.showMessageDialog(null,"opc inválida");
            }
      }
      while(opc != 9);
   }
}
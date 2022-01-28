package Aula11;
import javax.swing.JOptionPane;
public class Ex01 {
    public static void main (String args[]) {
        int v[ ] = new  int[5];
        int opc = 0;
      do {
       opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carregar \n2 - Classificar \n3 - Mostrar \n9 - Finalizar"));
       switch (opc)
            {
                  case 1: v = FunçãoCarrega(v);
                               break;
                  case 2: v = FunçãoClassifica(v);
                               break;
                  case 3: ProcedimentoMostra(v);
                               break;
                  case 9: JOptionPane.showMessageDialog(null,"finaliza");
                               break;
                  default: JOptionPane.showMessageDialog(null,"opc inválida");
            }
      }
      while(opc != 9);
   }
    
   static int[ ] FunçãoCarrega(int v[ ]) {
        int  i;
        for(i = 0 ; i<5 ; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i+1) + "o elemento do vetor."));
        }
        return v;
    }
    
    static int[ ] FunçãoClassifica(int v[ ]) {
        int i, j, aux;
        for(i = 0 ; i<4 ; i++) {
            for(j = i+1 ; j<5 ; j++) {         
                if(v[i]>v[j]) {            
                    aux = v[i];                          
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
       JOptionPane.showMessageDialog(null,"Classificação efetuada com sucesso"); 
       return v;
    }
    
    static void ProcedimentoMostra(int v[ ]) {
        String mostra = " ";
        for (int i=0; i<5; i++) { 
             mostra += ("\t "+v[i]);
        }
        JOptionPane.showMessageDialog(null,mostra);
    }
}

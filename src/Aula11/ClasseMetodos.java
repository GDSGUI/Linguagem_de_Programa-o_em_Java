package Aula11;
import javax.swing.JOptionPane;

public class ClasseMetodos {
    public int[ ] FunçãoCarrega(int v[ ]) {
        int  i;
        for(i = 0 ; i<5 ; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i+1) + "o elemento do vetor."));
        }
        return v;
    }
    
    public int[ ] FunçãoClassifica(int v[ ]) {
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
    
    public void ProcedimentoMostra(int v[ ]) {
        String mostra = " ";
        for (int i=0; i<5; i++) { 
             mostra += ("\t "+v[i]);
        }
        JOptionPane.showMessageDialog(null,mostra);
    }
}

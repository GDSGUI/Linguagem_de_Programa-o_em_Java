package Aula04;

public class Ex04 {
        public static void main(String args [ ]) {
              int i, num, fat ;
              for (num = 1 ; num <= 5 ; num++)  {
                    fat = num;
                    for (i = (num - 1) ; i > 1 ; i --)  {
                          fat = (fat * i); 
                       } // segundo for
                    System.out.println ("O valor do fatorial de " + num + " é " + fat); 
                 } // primeiro for
           } // main
     } // classe

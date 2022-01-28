package Aula04;

public class Ex03 {
        public static void main(String args []) {
              int  i, fat, num = 1; 
              do {
                    fat = num;  
                    i = (num - 1);
                    do {
                          fat = fat * i;  
                           i = (i - 1);
                       } while (i > 1);
                   if (num == 1) { System.out.println ("O valor do fatorial de " + num + " é " + 1); }
                    else {   System.out.println ("O valor do fatorial de " + num + " é " + fat);  }
                   num = num + 1;
                 } while (num <= 10);   } // main
     } // classe

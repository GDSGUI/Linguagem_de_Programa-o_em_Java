package Aula04;

public class Ex02 {
        public static void main(String args []) {
             int i, fat, num= 1;
              while (num <= 7) {
                    fat = num;  
                   i = num  -  1;
                    while (i > 1)  {
                          fat = fat * i; 
                          i = i - 1;
                       } // segundo enquanto
                    System.out.println ("O valor do fatorial de " + num + " é " + fat); 
                    num = num + 1;
                 } // primeiro enquanto
           } // main
     } // classe

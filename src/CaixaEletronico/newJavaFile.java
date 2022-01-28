package CaixaEletronico;
import java.util.Scanner;
        public class newJavaFile {
            public static void main(String args[]) {
                Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor que você deseja sacar");
	int valor_0067 = input.nextInt();
	
        int nota200_0067 = 200;
	int nota100_0067 = 100;
	int nota20_0067 = 20;
	int nota50_0067 = 50;
	int nota10_0067 = 10;
	int nota5_0067 = 5;
	int nota2_0067 = 2;	
        
        if(nota200_0067 >= nota200_0067) {
		nota200_0067 = valor_0067 / 200; 
		valor_0067 = valor_0067 % 200;   
		if (nota200_0067 != 0)
			System.out.println(nota200_0067 + " notas de R$ 200,00");
	} 
	if(nota100_0067 >= nota100_0067) {
		nota100_0067 = valor_0067 / 100; 
		valor_0067 = valor_0067 % 100;   
		if (nota100_0067 != 0)
			System.out.println(nota100_0067 + " notas de R$ 100,00");
	} 
	
	if(nota50_0067 >= nota50_0067) {
		nota50_0067 = valor_0067 / 50;
		valor_0067 = valor_0067 % 50;
		if (nota50_0067 != 0)
			System.out.println(nota50_0067 + " notas de R$ 50,00");
	}
	
	if(nota20_0067 >= nota20_0067) {
		nota20_0067 = valor_0067 / 20;
		valor_0067 = valor_0067 % 20;
		if (nota20_0067 != 0)
			System.out.println(nota20_0067 + " notas de R$ 20,00");
	}
	
	if(nota10_0067 >= nota10_0067) {
		nota10_0067 = valor_0067 / 10;
		valor_0067 = valor_0067 % 10;
		if (nota10_0067 != 0)
			System.out.println(nota10_0067 + " notas de R$ 10,00");
	}
	
	if(nota5_0067 >= nota5_0067) {
		nota5_0067 = valor_0067 / 5;
		valor_0067 = valor_0067 % 5;
		if (nota5_0067 != 0)
			System.out.println(nota5_0067 + " notas de R$ 5,00"); 
	}
	
	if(nota2_0067 >= nota2_0067) {
		nota2_0067 = valor_0067 / 2;
		valor_0067 = valor_0067 % 2;
		if (nota2_0067 != 0)
			System.out.println(nota2_0067 + " notas de R$ 2,00");
	}
}
}
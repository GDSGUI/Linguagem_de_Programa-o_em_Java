package DecimaQuartaAtivida_04_11_2021;

 class Notas {
    int nota;
    int cedulas;
	
  // Método Construtor	
  Notas()
   {	
     this(0, 0);	
   }	

  // Método Procedimento
  Notas (int notapedido,
          int cedularetirar)
  
   {	
     nota  = notapedido;
     cedulas = cedularetirar;
   }
}

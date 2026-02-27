package main;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Hello World!");  
//		
		Carro.carro1 = new Carro("Astra","Chevrolet","Verde",1998);
		System.out.println("O carro é um " + carro1.getMarca() + carro1.getNome());
		
		Trator.trator1 = new Trator("Tratorzao","Tratores Braza","Azul bebe",2026);
		System.out.println("O carro é um " + trator1.getMarca() + trator1.getNome());
	}

}

package main;

public class Carro {
	private String nome;
	private String marca;
	private String cor;
	private int ano;
	
	public Carro(String nome, String marca, String cor, int ano) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	 
	public void buzinar () {
		return("Bi Biiihhh");
	}
}

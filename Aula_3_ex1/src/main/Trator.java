package main;

public class Trator extends Carro {
	private int Torque;
	private float Potencia;
	
	public Trator(String nome, String marca, String cor, int ano, int torque, float potencia) {
		super(nome, marca, cor, ano);
		Torque = torque;
		Potencia = potencia;
	}
	public int getTorque() {
		return Torque;
	}
	public void setTorque(int torque) {
		Torque = torque;
	}
	public float getPotencia() {
		return Potencia;
	}
	public void setPotencia(float potencia) {
		Potencia = potencia;
	}
	

package it.polito.oop.rubrica.classi;

public class Voce {

	private String nome;
	private String cognome;
	private String numTelefono;
	
	public Voce(String nome, String cognome, String numTelefono){
		this.nome = nome;
		this.cognome = cognome;
		this.numTelefono = numTelefono;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}
	
	public String toString() {
		return nome + " " + cognome + " " + numTelefono;
	}
}

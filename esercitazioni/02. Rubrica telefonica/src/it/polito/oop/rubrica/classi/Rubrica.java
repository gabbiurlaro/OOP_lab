package it.polito.oop.rubrica.classi;

public class Rubrica {
	private String nome;
	private Voce[] voci;
	private static final int MAX_VOCI = 100;
	private int next = 0;
	
	public Rubrica(String nome){
		this.nome = nome;
		voci = new Voce[MAX_VOCI];
	}
	
	public String getNome() {
		return nome;
	}
	
	public void aggiungi(Voce v) {
		if(next >= MAX_VOCI) {
			System.err.println("Rubrica piena.");
		}
		else {
			voci[next++] = v;
		}
	}
	
	public String voce(int index) {
		if(index <= next) {
			return voci[index-1].toString();
		}
		else {
			System.err.println("Elemento non esistente");
			return "";
		}
	}
	
	public String primo() {
		if(next == 0) {
			System.err.println("Rubrica vuota.");
			return "";
		}
		else {
			return voci[0].toString();
		}
	}
	
	public String elenco() {
		StringBuffer s = new StringBuffer("(");
		for(int i=0; i<next-1; i++) {
			s.append(voci[i].toString()).append(", ");
		}
		s.append(voci[next-1].toString()).append(")");
		return s.toString();
	}
	
	public Voce ricerca(String key) {
		for(int i=0; i<voci.length; i++) {
			if(voci[i].getNome().equals(key) == true || voci[i].getCognome().equals(key) == true || voci[i].getNumTelefono().equals(key) == true) {
				return voci[i];
			}
		}
		return new Voce("", "", "");
	}
}

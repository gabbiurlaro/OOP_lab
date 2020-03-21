package it.polito.oop.rubrica;

import it.polito.oop.rubrica.classi.*; //import di Rubrica e Classi

public class MainClass {

	public static void main(String[] args) {
		Rubrica R = new Rubrica("Main");
		R.aggiungi(new Voce("Giuseppe","Conte","0831111111"));
		R.aggiungi(new Voce("Luigi","Di Maio","083111231"));
		R.aggiungi(new Voce("Roberto","Speranza","0831431534"));
		R.aggiungi(new Voce("Rocco","Casalino","08311123233"));
		R.aggiungi(new Voce("Lucia","Azzolina","08311221131"));

		System.out.println(R.elenco());
		System.out.println(R.ricerca("Casalino"));
	}

}

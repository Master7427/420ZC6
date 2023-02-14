package atelier10;

import java.util.Scanner;

public class EsperanceDeVie {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);

		String nom;
		char genre;
		int mois;
		int annes;
		int age;
		int jour;
		int esperanceDeVie;

		System.out.println("Saissisez votre nom : ");
		nom = clavier.nextLine();

		System.out.println("Quelle est votre genre");
		genre = clavier.next().charAt(0);
		switch (genre) {
		case 'F':
			esperanceDeVie = 84;
			System.out.println("Quelle est votre date de naissance");
			jour = clavier.nextInt();
			mois = clavier.nextInt();
			annes = clavier.nextInt();
			age = calculAge(annes);
			System.out.println("Date de naissance : " + jour + " / " + mois + " / " + annes);
			calculAnne(annes,age,esperanceDeVie,nom);
		case 'H':
			esperanceDeVie = 80;
			System.out.println("Quelle est votre date de naissance");
			jour = clavier.nextInt();
			mois = clavier.nextInt();
			annes = clavier.nextInt();
			age = calculAge(annes);
			System.out.println("Date de naissance : " + jour + " / " + mois + " / " + annes);
			calculAnne(annes,age,esperanceDeVie,nom);
		}

	}

	public static int calculAge(int annes) {
		int age;
		return age = 2021 - annes;
	}

	public static void calculAnne(int annes, int ages, int esperanceDeVie, String nom) {
		 ages = calculAge(annes);
		int annesRestant = esperanceDeVie - ages;
		int annesDePlus = ages - esperanceDeVie;

		if (ages > esperanceDeVie) {
			System.out.print("Bonjour " + nom + ","+ "vous avez " + ages + " Bravo, vous avez battu le record de l'esperance de vie quebecoise de " + annesDePlus + " ans ");
		}
		if (ages < esperanceDeVie)
			System.out.print(
					"Bonjour " + nom + "," + "vous avez " + ages + " Il vous reste " + annesRestant + " ans a vivre. ");

	}

}

import java.util.Scanner;


public class Teste {

	public void bienvenue() {

		System.out.println("Bienvenue dans mon application de distribution de salaire par age");
		System.out.println();
	}

	public void saisiridentite (Tester ss) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Saisir votre nom");
		ss.setNom(sc.nextLine());
		System.out.println("Saisir votre prenom");
		ss.setPrenom(sc.nextLine());
		System.out.println("Saisir votre age");
		ss.setAge(sc.nextInt());
		return;
	}

	public int salaireemploye(Tester ss) {
	

		if(ss.getAge()>=20){
			ss.setSalaire(200000);
		}
			else{
				ss.setSalaire(150000);
			}
			return ss.getSalaire();
		}
		

	
		public void afficher (Tester ss) {

			System.out.println("nom: "+ss.getNom());
			System.out.println("Prenom: "+ss.getPrenom());
			System.out.println("Age: "+ss.getAge());
			System.out.println("votre Salaire est de: "+ss.getSalaire()+"FCFA");

		}
}
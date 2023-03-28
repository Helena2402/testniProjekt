import java.util.ArrayList;

public class Student extends Osoba {
	String jmbag;
	ArrayList<Predmet> listaPredmeta;
	
	// prvi konstruktor
	public Student() {
		ime = "";
		prezime = "";
		oib = "";
		adresa = "";
		dat_rodenja = "";
		jmbag = "";
	}
	// drugi konstruktor
	public Student(String i, String p, String o, String a, String d_r, String j, ArrayList<Predmet> pred) {
		ime = i;
		prezime = p;
		oib = o;
		adresa = a;
		dat_rodenja = d_r;
		jmbag = j;
		listaPredmeta = pred;
	}
	
	public void sumaECTS() {
		String predmeti = "";
		Integer zbroj = 0;
		for (Predmet pred : listaPredmeta) {
			predmeti += pred.ime;
			predmeti += ", ";
			zbroj += pred.ECTS;
		}
		System.out.println("Predmeti: " + predmeti.substring(0, predmeti.length() - 2));
		System.out.println("Ukupno ECTS-a: " + zbroj);
	}
	
	
	
	public static void main(String[] args) {
		//liste predmeta
		ArrayList<Predmet> PredmetiJan= new ArrayList<Predmet>();
		PredmetiJan.add(new Predmet ("Matematika",6));
		PredmetiJan.add(new Predmet("Geografija",4));
		PredmetiJan.add(new Predmet("Francuski",3));
		PredmetiJan.add(new Predmet("Informatika",5));
		PredmetiJan.add(new Predmet("Njemacki",3));
		
		ArrayList<Predmet> PredmetiPetra= new ArrayList<Predmet>();
		PredmetiPetra.add(new Predmet ("Engleski",4));
		PredmetiPetra.add(new Predmet("Geologija",4));
		PredmetiPetra.add(new Predmet("Latinski",6));
		PredmetiPetra.add(new Predmet("Priroda",3));
		PredmetiPetra.add(new Predmet("Tjelesni",1));
		
		//studenti
		Student Jan = new Student("Jan", "Martic","23432156789","Ulica Kod kuglane, 22","12.12.2000.","00030145824",PredmetiJan);
		Jan.Ispis();
		Jan.sumaECTS();
		
		System.out.println("----------------------------");
		
		Student Petra = new Student("Petra", "Martic","23432156789","Ulica Snjegovica, 22","12.12.2000.","00030145824",PredmetiPetra);
		Petra.Ispis();
		Petra.sumaECTS();
	}
}

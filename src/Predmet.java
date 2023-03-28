
public class Predmet {
	String ime;
	Integer ECTS;
	// prvi konstruktor
	public Predmet(){
		ime = "";
		ECTS = 0;
	}
	// drugi konstruktor
	public Predmet(String i, Integer ects){
			ime = i;
			ECTS = ects;
	}
}

public class Osoba {
	String ime;
	String prezime;
	String oib;
	String adresa;
	String dat_rodenja;
	// prvi konstruktor
	public Osoba() {
		ime = "";
		prezime = "";
		oib = "";
		}
	// drugi konstruktor
	public Osoba(String i, String p, String o, String a, String d_r) {
		ime = i;
		prezime = p;
		oib = o;
		adresa = a;
		dat_rodenja = d_r;
		}
	public void Ispis()
	{
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("OIB: " + oib);
		System.out.println("Adresa prebivališta: " + adresa);
		System.out.println("Datum rodenja: " + dat_rodenja);
		
	}
	public void AzurirajAdresu(String a){
		if(a != null && !a.isEmpty())
			adresa = a;
		else System.out.println("Pogresan unos!");;
	}
	public void ProvjeraOIB() {
		try {
			long l = Long.parseLong(oib);
			if(l < 0) {
				System.out.println("OIB ne smije biti negativan broj!");
				return;
				}
		}
		catch(NumberFormatException nfe){
			System.out.println("OIB mora sadržavati samo znamenke!");
			return;
		}
		if( oib.length()!=11) {
			System.out.println("OIB mora sadržavati 11 znamenaka!");
			return;
		}
		else {
			System.out.println("OIB je ispravnog formata.");
			}
		}
	
	public static void main(String[] args) {
		Osoba o2 = new Osoba("Ivan", "Horvat", "98765432100", "Matije Gupca 11, 33000 Virovitica", "01.01.2000.");
		o2.Ispis();
		o2.AzurirajAdresu("Ilica 111, 10000 Zagreb");
		o2.AzurirajAdresu("");
		o2.Ispis();

	}
}
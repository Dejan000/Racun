
public class Main {

	public static void main(String[] args) {
		Proizvod proizvod = new Proizvod(1,"Banana",350);
		System.out.println(proizvod);
		
		Racun racun1 = new Racun(1,"3.April",3500); 
		Stavka stavka = new Stavka(1,2,racun1);
		System.out.println(stavka);
		System.out.println(racun1);
		Kategorija kategorija = new Kategorija(1,"voce");
		System.out.println(kategorija);
		

	}

}

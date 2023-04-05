
public class Stavka {
	
	Racun racun;
	int id;
	int kolicina;
	
	public Stavka() {
		this.id = 0;
		this.kolicina = 0;
		this.racun = null;
		
	}
	
	
	public Stavka(int id,int kolicina, Racun racun) {
		this.id = id;
		this.kolicina = kolicina;
		this.racun = racun;
	}
	
	
	public Stavka(int kolicina, Racun racun) {
		this.id = id;
		this.kolicina = kolicina;
		this.racun = racun;
	}
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Stavka [racun=" + racun + ", id=" + id + ", kolicina=" + kolicina + "]";
	}







	public Racun getRacun() {
		return racun;
	}
	public void setRacun(Racun racun) {
		this.racun = racun;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	
	

}

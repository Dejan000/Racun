
public class Kategorija {
	
	int id;
	String naziv;
	
	public Kategorija() {
		this.id = 0;
		this.naziv = "";
		
	}
	public Kategorija(int id, String naziv) {
		this.id = id;
		this.naziv = naziv;
		
	}
	
	public Kategorija(String naziv) {
		
		this.naziv = naziv;
		
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Kategorija [id=" + id + ", naziv=" + naziv + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

}


public class Proizvod {
	
	
	private int id;
	private String naziv;
	private int cena;
	
	public Proizvod() {
		this.id = 0;
		this.naziv = "";
		this.cena = 0;
		}
	
	public Proizvod(int id,String naziv,int cena) {
		this.id = id;
		this.naziv = naziv;
		this.cena = cena;
		}
	public Proizvod(String naziv,int cena) {
		
		this.naziv = naziv;
		this.cena = cena;
		}
	
	
	
	
	@Override
	public String toString() {
		return "Proizvod [id=" + id + ", naziv=" + naziv + ", cena=" + cena + "]";
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
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}

}


public class Racun {
	
	private int id;
	private String datum;
	private int cena;
	
	public Racun() {
		
		this.id = 0;
		this.datum = "";
		this.cena = 0;
				
		
	}
	public Racun(String datum, int cena) {
		
		
		this.datum = datum;
		this.cena = cena;
				
		
		}
	
	public Racun(int id,String datum, int cena) {
		
		this.id = id;
		this.datum = datum;
		this.cena = cena;
		}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Racun [id=" + id + ", datum=" + datum + ", cena=" + cena + "]";
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}

}

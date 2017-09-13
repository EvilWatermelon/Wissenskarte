package Wissenseinheiten;

public class Frage {
	
	protected String frage;

	
	public String getFrage() {
		
		return frage;
		
	}

	public void setFrage(String frage) {
		
		this.frage = frage;
		
	}

	public String getAntwort() {
		
		return antwort;
		
	}
	
	public void setAntwort(String antwort) {
		
		this.antwort = antwort;
		
	}

	private String antwort;
	
	public Frage (String frage, String antwort){
		
		this.frage = frage;
		this.antwort = antwort;
		
	}
}

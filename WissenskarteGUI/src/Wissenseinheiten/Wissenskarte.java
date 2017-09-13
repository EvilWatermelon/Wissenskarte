package Wissenseinheiten;

public class Wissenskarte{
	
	protected Frage frage;
	protected Frage antwort;

	protected String titel;
	protected String content_front;
	private String content_back;
	private String keywords;
	private int angezeigteSeite;
	public final int FRONT = 1, BACK = 2;
	
	
	public Wissenskarte(String titel, String content_front, String content_back, String keywords){
		
		this.angezeigteSeite = FRONT;
		this.titel = titel;
		this.content_front = content_front;
		this.content_back = content_back; 
		this.keywords = keywords;
		int wrongA = 0;
	}
	public String getAktuelleSeite(){
		
		if(angezeigteSeite == FRONT){
			
			return titel + content_front;
		}else{
			
			return titel + content_back;
		}
	}
	
	public String flip(){
		
		angezeigteSeite =(FRONT == angezeigteSeite) ? BACK:FRONT;
		
		return getAktuelleSeite();	
	}
	
	public boolean enthaelt (String suchbegriff){
		
		if(content_front.contains (suchbegriff) || 
		   content_back.contains(suchbegriff) || 
		   titel.contains(suchbegriff) || 
		   keywords.contains(suchbegriff)){
			
			return true;
			
		} else{
			
			return false;
		}
	}
	
	public String getTitel() {
		
		return titel;
	}

	public void setTitel(String titel) {
		
		this.titel = titel;
	}

	public String getContent_front() {
		
		return content_front;
	}

	public void setContent_front(String content_front) {
		
		this.content_front = content_front;
	}

	public String getContent_back() {
		
		return content_back;
	}

	public void setContent_back(String content_back) {
		
		this.content_back = content_back;
	}

	public String getKeywords() {
		
		return keywords;
	}

	public void setKeywords(String keywords) {
		
		this.keywords = keywords;
	}
	
	public Frage getFrage(){
		
		return frage;
	}
	
	public void setFrage(Frage frage){
		
		this.frage = frage;
		
	}
	
	public Frage getAntwort() {
		
		return antwort;
		
	}

	public String setAntwort(Frage antwort) {
		
		if(antwort.equals(antwort)) {
			
			return "RICHTIGE ANTWORT!";
			
		} else {
			
			return "FALSCHE ANTWORT!";
		}
		
	}
}

package Wissenseinheiten;

public class Counter implements ApplyInterface {

	private int anzahl;
	
	@Override
	public void apply(Wissenskarte w) {
		
		anzahl++;
		
	}
	private int getAnzahl(){
		
		return anzahl;
		
	}
	
}

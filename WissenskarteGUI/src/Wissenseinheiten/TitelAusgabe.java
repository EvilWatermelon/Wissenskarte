package Wissenseinheiten;

public class TitelAusgabe implements ApplyInterface {

	@Override
	public void apply(Wissenskarte w) {
		
		System.out.println( "Titel: " + w.getTitel() );
		
	}

	
}

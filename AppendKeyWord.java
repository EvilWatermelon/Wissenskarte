package Wissenseinheiten;

public class AppendKeyWord implements ApplyInterface {

	private String newKey = "Angeschaut";
	
	@Override
	public void apply(Wissenskarte w) {
		
		w.setKeywords(w.getKeywords() + "Angeschaut");
		
	}

}

package Wissenseinheiten;

public interface AbstractCardList {

	/** 
	 * F�gt die Wissenskarte w am Anfang der Liste ein 
	 * @param w neue Wissenskarte f�r die Liste 
	 */ 
	public void addFirst (Wissenskarte w); 
	
	/** 
	 * F�gt die Wissenskarte w am Ende der Liste ein 
	 * @param w neue Wissenskarte f�r die Liste 
	 */ 
	public void addLast (Wissenskarte w); 
	
	/**  
	 * @return das erste Element der Liste 
	 */ 
	public Wissenskarte getFirst (); 
	
	/** 
	 * @return das letzte Element der Liste 
	 */ 
	public Wissenskarte getLast (); 
	
	/**  
	 * @param n legt den Index fest, z.B. Karte an der Stelle 3 
	 * @return die Wissenskarte an der Indexstelle n. 
	 */ 
	public Wissenskarte getWissenskarte (int n);
	
	/** 
	 * Diese Methode durchl�uft alle Wissenskarten. Sobald eine  
	 * Wissenskarte gefunden wurde, die keyword in den Schl�sselw�rtern 
	 * enth�lt, soll diese Wissenskarte zur�ckgeliefert werden. 
	 * Wenn keine Karte das keyword enth�lt, wird null zur�ckgeliefert. 
	 * Es wird keine Exception ausgel�st. 
	 * @param keyword Suchbegriff f�r die Schl�sselw�rter 
	 * @return die erste Wissenskarte, die das keyword enth�lt oder null 
	 *  
	 */
	public Wissenskarte getWissenskarte (String keyword); 
	
	/** 
	 * @return true wenn die Liste leer ist 
	 */ 
	public boolean isEmpty ();
	
	/** 
	 * @return Anzahl der Element in dieser Liste 
	 */ 
	public int anzahl(); 
	
	/** 
	 * Diese Methode soll eine for-each Schleife �ber alle Wissenskarten 
	 * enthalten. Jede einzelne Wissenskarte soll dann an die    
	 * apply(Wissenskarte w) - Methode des applicators �bergeben werden. 
	 * @param applicator Implementierung des ApplyInterfaces, in der  
	 *                   apply(...) Methode wird f�r jede Wissenskarte  
	 *                   eine Aktion ausgef�hrt. Siehe auch n�chste Seite! 
	 */ 
	public void applyForEach (ApplyInterface applicator); 
	
//	public Wissenskarte getNext();
//	public Wissenskarte getPrev();
}

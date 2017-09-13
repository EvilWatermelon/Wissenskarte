package Wissenseinheiten;

public interface ApplyInterface {
		
		/** 
		 * Dieses Interface stellt eine apply(...) Methode bereit, 
		 *  mit der eine beliebige Operation für eine Wissenskarte  
		 * ausgeführt werden kann. Implementierungen können z.B. zählen,  
		 * für wie viele Karten die apply-Methode 
		 * aufgerufen wurde oder jede einzelne Wissenskarte verändern. 
		 * @param w mit dieser Wissenskarte soll etwas geschehen 
		 */ 
		public void apply (Wissenskarte w) ; 
		
} 


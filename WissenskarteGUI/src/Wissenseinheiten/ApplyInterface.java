package Wissenseinheiten;

public interface ApplyInterface {
		
		/** 
		 * Dieses Interface stellt eine apply(...) Methode bereit, 
		 *  mit der eine beliebige Operation f�r eine Wissenskarte  
		 * ausgef�hrt werden kann. Implementierungen k�nnen z.B. z�hlen,  
		 * f�r wie viele Karten die apply-Methode 
		 * aufgerufen wurde oder jede einzelne Wissenskarte ver�ndern. 
		 * @param w mit dieser Wissenskarte soll etwas geschehen 
		 */ 
		public void apply (Wissenskarte w) ; 
		
} 


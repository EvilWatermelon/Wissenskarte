package Wissenseinheiten;

import java.util.ArrayList;

public class Testclass {
	public static void main(String[] args){

		//Tests
		SingelyCardList list = new SingelyCardList();
		
		ArrayList <Wissenskarte> alleKarten = new ArrayList <Wissenskarte> ();
		
		Wissenskarte karte1 = new Wissenskarte ("Peter Pain", "Zockt WoW", "Horde", "Peter");
		alleKarten.add(karte1);
		Wissenskarte karte2 = new Wissenskarte ("Koeln", "Einwohnerzahl 1 Millionen", "Liegt in NRW", "Stadt");
		alleKarten.add(karte2);
		Wissenskarte karte3 = new Wissenskarte ("Java", "Ist eine Insel", "Kann man auch als Kaffee trinken", "OOP");
		alleKarten.add(karte3);
		Wissenskarte karte4 = new Wissenskarte ("C#", "Braucht .NET-Komponenten", "Ist eine Objektorientierte Programmiersprache", "Spiele");
		alleKarten.add(karte4);
		Wissenskarte karte5 = new Wissenskarte ("TH Koeln", "Hat 11 Fakultaeten", "Informatiker sind die besten", "Campus");
		alleKarten.add(karte5);
		
		Frage neue_Frage = new Frage("Was zockt Peter?", "WoW");
		Frage neue_Frage1 = new Frage("Wo liegt Koeln?", "In NRW");
		Frage neue_Frage2 = new Frage("Welches Getraenk ist Java?", "Kaffee");
		Frage neue_Frage3 = new Frage("Was braucht C#?", ".NET-Komponenten");
		Frage neue_Frage4 = new Frage("Was sind Informatiker?", "Die besten");
		
		list.addFirst(karte1);
		list.addLast(karte2);
		
		System.out.println("Erstes: " + list.getFirst() );
		System.out.println("Letztes: " + list.getLast() );
		
		System.out.println("Erwartet: 3, Tatsächlich: " + list.anzahl() );
		
		System.out.println(list.isEmpty());
		
		list.getWissenskarte(10);
		list.getWissenskarte("Keyword");
		
		list.applyForEach(new TitelAusgabe());
		
		
		
	}
}

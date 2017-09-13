package Wissenseinheiten;

import javax.swing.JFrame;
import Wissenseinheiten.FlashCardEditor;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

public class Lernsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		//ArrayList <Wissenskarte> alleKarten = new ArrayList <Wissenskarte> ();
		SingelyCardList alleKarten = new SingelyCardList();

		Wissenskarte karte1 = new Wissenskarte ("Peter Pain", "Zockt WoW", "Horde", "Peter");
		alleKarten.addLast(karte1);
		Wissenskarte karte2 = new Wissenskarte ("Koeln", "Einwohnerzahl 1 Millionen", "Liegt in NRW", "Stadt");
		alleKarten.addLast(karte2);
		Wissenskarte karte3 = new Wissenskarte ("Java", "Ist eine Insel", "Kann man auch als Kaffee trinken", "OOP");
		alleKarten.addLast(karte3);
		Wissenskarte karte4 = new Wissenskarte ("C#", "Braucht .NET-Komponenten", "Ist eine Objektorientierte Programmiersprache", "Spiele");
		alleKarten.addLast(karte4);
		Wissenskarte karte5 = new Wissenskarte ("TH Koeln", "Hat 11 Fakultaeten", "Informatiker sind die besten", "Campus");
		alleKarten.addLast(karte5);
		
		
		Frage neue_Frage = new Frage("Was zockt Peter?", "WoW");
		karte1.setFrage(neue_Frage);
		
		Frage neue_Frage1 = new Frage("Wo liegt Koeln?", "In NRW");
		karte2.setFrage(neue_Frage1);
		
		Frage neue_Frage2 = new Frage("Welches Getraenk ist Java?", "Kaffee");
		karte3.setFrage(neue_Frage2);
		
		Frage neue_Frage3 = new Frage("Was braucht C#?", ".NET-Komponenten");
		karte4.setFrage(neue_Frage3);
		
		Frage neue_Frage4 = new Frage("Was sind Informatiker?", "Die besten");
		karte5.setFrage(neue_Frage4);
		
		FlashCardEditor frame = new FlashCardEditor(alleKarten);
	}
}



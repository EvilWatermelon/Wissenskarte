package Wissenseinheiten;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
import javax.xml.soap.Text;

public class JFlashCard extends JPanel{

	private Wissenskarte currentCard;
	private int anzeigeModus = 0;
	private String text = "";
	
	private Font font = new Font("Serif", Font.BOLD, 30);
	
	public JFlashCard(Wissenskarte currentCard){
		
		setPreferredSize(new Dimension(500, 150));
		setBackground(Color.WHITE);
		this.currentCard = currentCard; 
		
	}
	@Override
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		Graphics2D g2d = ( Graphics2D ) g;
		
		g2d.drawRect( 10, 10, getWidth() - 20, getHeight() - 20);
		
		g2d.setFont(font);
		
		switch(this.anzeigeModus){
			
			case 0:
				g2d.setColor(Color.BLACK);
			break;
			
			case 1:
				g2d.setColor(Color.BLACK);
			break;
			
			case 2:
				g2d.setColor(Color.RED);
			break;
			
			case 3:
				g2d.setColor(Color.GREEN);
			break;
			
		}  
		g2d.drawString( this.text, 40, 50);
	}
	public void setText(String text){
		
		this.text = text;
		
	}
	public int getAnzeigeModus() {
		
		return anzeigeModus;
		
	}
	public void setAnzeigeModus(int anzeigeModus) {
		
		this.anzeigeModus = anzeigeModus;
		setString();
		
	}
	public void setString(){
	
		switch(this.anzeigeModus){
			case 0:
				this.text = currentCard.getContent_front();
			break;
			
			case 1:
				this.text = currentCard.getContent_back();
			break;
			
			case 2:
				this.text = currentCard.getFrage().getFrage();
			break;
			
			case 3:
				this.text = currentCard.getFrage().getAntwort();
			break;
		
		}
		repaint();
	}
}

package Wissenseinheiten;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.TextUI;

public class FlashCardPlayer extends JFrame{

	private Wissenskarte currentCard;
	
	public FlashCardPlayer(Wissenskarte currentCard){
		
		this.currentCard = currentCard;
		buildGUI();
		
	}
	private void buildGUI(){
		
		Container content = getContentPane();
		
		
		JPanel uiPanel = new JPanel();
		final JFlashCard flashCard = new JFlashCard( currentCard );
		
		JLabel lbVorne = new JLabel( "Vorne" );
		lbVorne.addMouseListener( new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				flashCard.setAnzeigeModus( 0 );
				
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				
				
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
			}
			
			
		});
		JLabel lbHinten = new JLabel( "Hinten" );
		lbHinten.addMouseListener( new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				
				flashCard.setAnzeigeModus( 1 );
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			
		});
		JLabel lbFrage = new JLabel( "Frage" );
		lbFrage.addMouseListener( new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				
				flashCard.setAnzeigeModus( 2 );
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			
		});
		JLabel lbAntwort = new JLabel( "Antwort" );
		lbAntwort.addMouseListener( new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {

				flashCard.setAnzeigeModus( 3 );
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			
		});
		
		lbFrage.setForeground(Color.RED);
		lbAntwort.setForeground(Color.GREEN);
		
		
		uiPanel.add(lbVorne);
		
		uiPanel.add(lbHinten);
		
		uiPanel.add(lbFrage);
		
		uiPanel.add(lbAntwort);
		
		content.add( uiPanel, BorderLayout.SOUTH );
		content.add( flashCard, BorderLayout.NORTH );
		
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

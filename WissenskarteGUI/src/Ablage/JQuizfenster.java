package Ablage;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Wissenseinheiten.Wissenskarte;

public class JQuizfenster extends JFrame{
	
	private Wissenskarte frage;
	JLabel lbBitteWaehlen = new JLabel("Bitte Wählen.");
	
	ArrayList<Wissenskarte> wissenskarten = new ArrayList<Wissenskarte>();
	 
	public JQuizfenster(ArrayList<Wissenskarte> wissenskarten){
		
		super("Quiz");
		this.wissenskarten = wissenskarten;
		buildGUI();
		
	}
	public void buildGUI(){
		
		Container content = getContentPane();
		
		Wissenskarte currentFrage = wissenskarten.get((int) (Math.random() * wissenskarten.size()));
		
		JPanel fragenPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel lbFrage = new JLabel();
		
		
		fragenPanel.add(lbFrage);
		lbFrage.setText(currentFrage.getFrage().getFrage());
		fragenPanel.add(lbBitteWaehlen);
		
		JPanel interactionPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		JButton btnOne = new JButton();
		btnOne.setText(currentFrage.getFrage().getAntwort());
		interactionPanel.add(btnOne);
		btnOne.addActionListener( new ActionListener(){
	
			
			@Override
			public void actionPerformed(ActionEvent e) {
				((JButton)( e.getSource())).getText();
				lbBitteWaehlen.setText("Richtig!");
			
		}});
		JButton btnTwo = new JButton();
		btnTwo.setText("Hallo");
		interactionPanel.add(btnTwo);
		btnTwo.addActionListener( new ActionListener(){
	
			@Override
			public void actionPerformed(ActionEvent e) {
				((JButton)( e.getSource())).getText();
				lbBitteWaehlen.setText("Falsch!");
			}
			
			
		});
		JButton btnThree = new JButton();
		btnThree.setText("Komische Frage");
		interactionPanel.add(btnThree);
		btnThree.addActionListener( new ActionListener(){
	
			
			@Override
			public void actionPerformed(ActionEvent e) {
				((JButton)( e.getSource())).getText();
				lbBitteWaehlen.setText("Falsch!");
			}
			
		});
		JButton btnFour = new JButton();
		btnFour.setText("Eine Antwort");
		interactionPanel.add(btnFour);
		btnFour.addActionListener( new ActionListener(){
	
			@Override
			public void actionPerformed(ActionEvent e) {
				((JButton)( e.getSource())).getText();
				lbBitteWaehlen.setText("Falsch!");
			}
			
			
		});
		JButton btnNext = new JButton();
		btnNext.setText("Nächste Frage");
		interactionPanel.add( btnNext );
		btnNext.addActionListener( new ActionListener(){
	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JQuizfenster frame = new JQuizfenster( wissenskarten );
				
			}
		});
		
		content.add( interactionPanel, BorderLayout.CENTER);
		content.add( fragenPanel, BorderLayout.NORTH);
		
		
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		}	
}

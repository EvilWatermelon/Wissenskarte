package Wissenseinheiten;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Wissenseinheiten.SingelyCardList.Node;

public class FlashCardEditor extends JFrame {


	//private ArrayList<Wissenskarte> wissenskarten = new ArrayList<Wissenskarte>();
	SingelyCardList liste = new SingelyCardList();
	
	private static final JTextField btnConfirm = null;
	private Wissenskarte currentWissenskarte = null;
	private int index = 0;
	
	
	JTextField inputTitel = new JTextField();
	JTextField inputVorderseite = new JTextField();
	JTextField inputRueckseite = new JTextField();
	JTextField inputSchluesselwoerter = new JTextField();
	JTextField inputFrage = new JTextField();
	JTextField inputAntwort = new JTextField();
	
	public FlashCardEditor(SingelyCardList liste){
		
		super("Wissenskarten");
		this.liste = liste;
		buildGUI();
		
	}
	private void buildGUI(){
		
		Container content = getContentPane();
		
		Font font = new Font("Serif", Font.BOLD, 30);
		
		JButton btnNext = new JButton(">");
		JButton btnPrev = new JButton("<");
		
		
		
		btnNext.setFont(font);
		btnPrev.setFont(font);
		
		JPanel uiPanel = new JPanel();
		
		BoxLayout bl = new BoxLayout(uiPanel, BoxLayout.Y_AXIS);
		uiPanel.setLayout(bl);
		
		JLabel lbTitel = new JLabel("Titel: ");
		JLabel lbVorderseite = new JLabel("Vorderseite: ");
		JLabel lbRueckseite = new JLabel("Rueckseite: ");
		JLabel lbSchluesselwoerter = new JLabel("Schluesselwoerter: ");
		JLabel lbFrage = new JLabel("Frage und Antwort: ");
		JLabel lbAntwort = new JLabel();
		
		showWissenskarte();
		
		uiPanel.add(lbTitel);
		uiPanel.add(inputTitel);
		
		uiPanel.add(lbVorderseite);
		uiPanel.add(inputVorderseite);
		
		uiPanel.add(lbRueckseite);
		uiPanel.add(inputRueckseite);
		
		uiPanel.add(lbSchluesselwoerter);
		uiPanel.add(inputSchluesselwoerter);
		
		uiPanel.add(lbFrage);
		uiPanel.add(inputFrage);
		
		uiPanel.add(lbAntwort);
		uiPanel.add(inputAntwort);
		
		JPanel interactionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JButton btnShow = new JButton( "Anzeigen" );
		JButton btnConfirm = new JButton( "Uebernehmen" );
		JButton btnQuiz = new JButton( "Quiz starten" );
		
		JButton btnNew = new JButton( "Neu" );
		interactionPanel.add(btnNew);
		
		btnNew.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				addWissenskarte(new Wissenskarte( "", "", "", "" ));
				
			}	
		});
		btnShow.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				FlashCardPlayer frame = new FlashCardPlayer( currentWissenskarte );
				
			}
		});		
		interactionPanel.add( btnConfirm );
		interactionPanel.add( btnShow );
		interactionPanel.add( btnQuiz );
		
		ActionListener l = new GoNext( this );
		btnNext.addActionListener(l);
		ActionListener goprev = new GoPrev( this );
		btnPrev.addActionListener( goprev );
		
		content.add( uiPanel, BorderLayout.CENTER );
		content.add( interactionPanel, BorderLayout.NORTH );
		content.add( btnNext, BorderLayout.EAST );
		content.add( btnPrev, BorderLayout.WEST );
		
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}
	public void addWissenskarte(Wissenskarte k) {
		
		liste.addLast(k);
		currentWissenskarte = k;
		showWissenskarte();
		
	}
	public void showWissenskarte(){
		
		if( currentWissenskarte == null ) return;
		
			inputTitel.setText( currentWissenskarte.getTitel() );
			inputVorderseite.setText( currentWissenskarte.getContent_front() );
			inputRueckseite.setText(currentWissenskarte.getContent_back());
			inputSchluesselwoerter.setText(currentWissenskarte.getKeywords());
			inputFrage.setText(currentWissenskarte.getFrage().getFrage());
			inputAntwort.setText(currentWissenskarte.getFrage().getAntwort());
	}
	public class GoNext implements ActionListener{

		private FlashCardEditor flashCardEditor;
		
		public GoNext (FlashCardEditor flashCardEditor){
			
			this.flashCardEditor = flashCardEditor;
			
		}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			flashCardEditor.next();
			
		}
	}
	public void next(){
		
		index++;
		
		if(index < liste.anzahl()){
			
			index = liste.anzahl() -1;
			
		}
		liste.getWissenskarte(index);
		showWissenskarte();
	}
	public class GoPrev implements ActionListener{

		FlashCardEditor flashCardEditor;
		
		public GoPrev(FlashCardEditor flashCardEditor){
			
			this.flashCardEditor = flashCardEditor;
		
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			
			flashCardEditor.prev();
			
		}	
	}
	public void prev(){
		
		index--;
		
		if(index < 0){
			
			index = liste.anzahl() +1;
			
		}
		
		liste.getWissenskarte(index);
		showWissenskarte();

	}
	public class ActionConfirm implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(currentWissenskarte != null){
				
				currentWissenskarte.setTitel(inputTitel.getText());
				currentWissenskarte.setContent_front(inputVorderseite.getText());
				currentWissenskarte.setContent_back(inputRueckseite.getText());
				currentWissenskarte.setKeywords(inputSchluesselwoerter.getText());
				currentWissenskarte.getFrage().setFrage(inputFrage.getText());
				currentWissenskarte.getFrage().setAntwort(inputAntwort.getText());
				
			}	
		}
	}
}
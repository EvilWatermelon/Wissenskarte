package Wissenseinheiten;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import Wissenseinheiten.SingelyCardList.Node;

public class DoubleList implements AbstractCardList {

private ArrayList<Wissenskarte> wissenskarten = new ArrayList<Wissenskarte>();
	
	private DNode first = null;
	private DNode last = null;
	private DNode current = null;
	private DNode runPointer;
	private Wissenskarte currentWissenskarte = null;
	
	
	@Override
	public void addFirst(Wissenskarte w) {
		
		if( isEmpty() ){
		
			first = new DNode(w, first, last);
			last = first;
			
		} else {
			
			first = new DNode(w, first, null);
			first.prev.next = first;
			
		}
		
	}
	@Override
	public void addLast(Wissenskarte w) {
		
		if( isEmpty() ){
			
			last = new DNode(w, last, first);
			first = last;
			
		} else {
			
			last = new DNode(w, null, last);
			last.prev.next = last;
			
		}
		
	}
	@Override
	public Wissenskarte getFirst() {
		
		if( isEmpty() ) throw new NoSuchElementException();
		
		current = first;
		
		return first.data;
		
	}
	@Override
	public Wissenskarte getLast() {

		if( isEmpty() ) throw new NoSuchElementException();

		current = last;
		
		return current.data;
		
	}
	@Override
	public Wissenskarte getWissenskarte(int n) {
		
		Wissenskarte temp = null;
		
		for(int i = 0; i < wissenskarten.size(); i++){
			
			if( wissenskarten.indexOf(n) == n ){
				
				temp = wissenskarten.get(n);
				
			}
		}
		return temp;
	}
	@Override
	public Wissenskarte getWissenskarte(String keyword) {
		
		if(isEmpty()) return null;
		
		DNode runPointer = first;
		
		while(runPointer != null){
			
			if(runPointer.data.getKeywords().contains(keyword)){
				
				return runPointer.data;
				
			} 
			
			runPointer = runPointer.next;
			
		}
		
		return null;
		
	}
	@Override
	public boolean isEmpty() {
		
		return first == null;
		
	}
	@Override
	public int anzahl() {
		
		if( isEmpty() ) return 0;
		
		int size = 0;
		DNode runPointer = first;
		
		while(runPointer != null){
			
			runPointer = runPointer.next;
			size++;
			
		}
		
		return size;
		
	}
	@Override
	public void applyForEach(ApplyInterface applicator) {
		
		DNode runPointer = first;
		
		while(runPointer != null){
			
			applicator.apply(runPointer.data);
			runPointer = runPointer.next;
			
		}
		
	}
	public class DNode {
		
		Wissenskarte data;
		DNode next;
		DNode prev;
		
		public DNode(Wissenskarte data, DNode next, DNode prev){
			
			this.data = data;
			this.next = next;
			this.prev = prev;
		}
	}
}

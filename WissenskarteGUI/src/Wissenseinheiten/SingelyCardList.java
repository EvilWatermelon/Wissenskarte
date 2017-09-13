package Wissenseinheiten;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class SingelyCardList implements AbstractCardList {

	private ArrayList<Wissenskarte> wissenskarten = new ArrayList<Wissenskarte>();
	
	private Node first = null;
	private Node runPointer;
	private Wissenskarte currentWissenskarte = null;
	
	
	@Override
	public void addFirst(Wissenskarte w) {
		
		first = new Node(w, first);
		
	}
	@Override
	public void addLast(Wissenskarte w) {
		
		Node newNode = new Node(w, null);
		
		if(first == null){
			
			first = newNode;
			
		} else {
			
			Node tempNode = first;
			
			while(tempNode.next != null) tempNode = tempNode.next;
			
			tempNode.next = newNode;
		}
		
	}
	@Override
	public Wissenskarte getFirst() {
		
		if( isEmpty() ) throw new NoSuchElementException();
		
		return first.data;
		
	}
	@Override
	public Wissenskarte getLast() {

		if( isEmpty() ) throw new NoSuchElementException();

		Node runPointer = first;

		while(runPointer.next != null){

			runPointer  = runPointer.next;

		}
		
		return runPointer.data;
		
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
		
		Node runPointer = first;
		
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
		Node runPointer = first;
		
		while(runPointer != null){
			
			runPointer = runPointer.next;
			size++;
			
		}
		
		return size;
		
	}
	@Override
	public void applyForEach(ApplyInterface applicator) {
		
		Node runPointer = first;
		
		while(runPointer != null){
			
			applicator.apply(runPointer.data);
			runPointer = runPointer.next;
			
		}
		
	}
	public class Node {
		
		Wissenskarte data;
		Node next;
		
		public Node(Wissenskarte data, Node next){
			
			this.data = data;
			this.next = next;
			
		}

		public Wissenskarte getData() {
			return data;
		}

		public void setData(Wissenskarte data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
			
		}
	}
}

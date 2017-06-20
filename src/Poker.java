import java.util.*;
public class Poker {

	public static void main(String[] args) {
		List<Card> hand = new ArrayList<Card>();
		Deck deck= new Deck(); 
		for( int i = 0 ; i < 7 ; i++){
			Card crd = deck.draw(); 
			hand.add(crd);
		}	
		System.out.println(hand);
		
	}
}

import java.util.*;
public class Deck {
	List<Card> deck = new ArrayList<Card>();
	public Deck(){
		for (Suits s : Suits.values()) {
		    for (Ranks r : Ranks.values()) {
		         Card c = new Card(s,r);
		         deck.add(c);
		    }  
		}
		Collections.shuffle(this.deck);
	}
	
	public Card draw(){
		return deck.remove(0);
	}
	public void shuffle(){
		deck = null; 
		for (Suits s : Suits.values()) {
		    for (Ranks r : Ranks.values()) {
		         Card c = new Card(s,r);
		         deck.add(c);
		    }  
		}
	}
	public List<Card> getCurrentDeck(){
		List<Card> newDeck = new ArrayList<Card>();
		for(Card i :deck){
		newDeck.add(i);
		}
		return newDeck; 
	}
	

}


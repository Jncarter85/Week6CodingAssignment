package Week6CodingAssignment;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	} 
	public void setName(String name) {
		this.name = name;
	}
	
	public void draw(Deck d) {
		Card drawnCard = d.drawCard();
		hand.add(drawnCard);
	}

	public void incrementScore() {
		this.score++;
	}
	
	public Card flip() {
		Card topOfHand = hand.get(0);
		return hand.remove(0);
	}
	
	public void describe() {
		System.out.println(name);
		System.out.println(hand);
	}

	
	}



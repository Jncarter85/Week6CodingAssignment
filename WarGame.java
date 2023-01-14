package Week6CodingAssignment;

public class WarGame {

	public static void main(String[] arg) {
		WarGame wg = new WarGame();
		wg.playGame();
	}
	private void playGame() {
		Deck d = new Deck();
		Player p = new Player();
		p.setName("Player 1");
		Player p2 = new Player();
		p2.setName("Player 2");
		System.out.println(d);
		drawCards(d, p, p2);
		flipCards(p, p2);
		findWinner(p, p2);
		
	}
	
	private void drawCards(Deck d, Player p, Player p2) {
		for(int i = 1; i <= 26; i++) {
			p.draw(d);
			p2.draw(d);
		
		}
	}
	
	
	private void flipCards(Player p, Player p2) {
		for(int i = 1; i <= 26; i++)  {
	Card toHp = p.flip();
	Card toHp2 = p2.flip();
	if(toHp.getValue() > toHp2.getValue()) {
		p.incrementScore();
		
	} else {
		p2.incrementScore();
		
	}
		}
	}
	
	
	
	private void findWinner(Player p, Player p2) {
		if(p.getScore() > p2.getScore()) {
			System.out.println("Player one wins");
		}else if (p2.getScore() > p.getScore()) {
			System.out.println("Player two wins");
		}else {
			System.out.println("Draw");
		}
	}
}

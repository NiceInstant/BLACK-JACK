import java.util.ArrayList;

public class points {

	public static void main(String[] args) {
	    
		String[] s = {"6♠", "7♠", "8♠", "9♠", "10♠", "B♠", "D♠", "K♠", "T♠","6♣", "7♣", "8♣", "9♣", "10♣", "B♣", "D♣", "K♣", "T♣","6♥", "7♥", "8♥", "9♥", "10♥", "B♥", "D♥", "K♥", "T♥","6♦", "7♦", "8♦", "9♦", "10♦", "B♦", "D♦", "K♦", "T♦"};
		   for(int i = 0;i < s.length; i++ )
			   System.out.print(s[i] + " "  );
		ArrayList<Card> cards = new ArrayList<>();
           
		Card piki6 = new Card("6♠", 2);
		Card piki7 = new Card("7♠", 3);
		Card piki8 = new Card("8♠", 4);
		Card piki9 = new Card("9♠", 5);
		Card piki10 = new Card("10♠", 6);
		Card piki11 = new Card("B♠", 7);
		Card piki12 = new Card("D♠", 8);
		Card piki13 = new Card("K♠", 9);
		Card piki14 = new Card("T♠", 10);
	
		cards.add(piki6);
		cards.add(piki7);
		cards.add(piki8);
		cards.add(piki9);
		cards.add(piki10);
		cards.add(piki11);
		cards.add(piki12);
		cards.add(piki13);
		cards.add(piki14);
				
//		System.out.println(cards.get(3).setCard() + "==>" + cards.get(3).setC() );

	}

}

package flashcards;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DeckTest {
	String tl1, tl2, tl3, tl4, tl5, tl6, tl7, tl8, tl9, tl10;
	Card c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;
	List<Card> dummyDeck = new ArrayList<Card>();

	@Before
	public void setUp() throws Exception {
		tl1 = "Springfield,Illinois, 1, 2";
		tl2 = "Harrisburg,Pennsylvania,1,2";
		tl3 = "Sacramento,California,1,2";
		tl4 = "Olympia,Washington,1,2";
		tl5 = "Trenton,NewJersey,1,2";
		tl6 = "Lansing,Michigan,1,2";
		tl7 = "Columbus,Ohio,1,2";
		tl8 = "Albany,NewYork,1,2";
		tl9 = "Hartford,Connecticut,1,2";
		tl10 = "Providence,RhodeIsland,1,2";
		c1 = new Card(tl1);
		c2 = new Card(tl2);
		c3 = new Card(tl3);
		c4 = new Card(tl4);
		c5 = new Card(tl5);
		c6 = new Card(tl6);
		c7 = new Card(tl7);
		c8 = new Card(tl8);
		c9 = new Card(tl9);
		c10 = new Card(tl10);
		dummyDeck.add(0, c1);
		dummyDeck.add(1, c2);
		dummyDeck.add(2, c3);
		dummyDeck.add(3, c4);
		dummyDeck.add(4, c5);
		dummyDeck.add(5, c6);
		dummyDeck.add(6, c7);
		dummyDeck.add(7, c8);
		dummyDeck.add(8, c9);
		dummyDeck.add(9, c10);		
	}

	@Test
	public void testDeck() {
		Deck exampleDeck = new Deck("/Users/ryansloan/Desktop/capitals.txt");
		assertEquals(10, exampleDeck.deck.size());
		assertEquals(Arrays.toString(dummyDeck.get(0).getCard()), Arrays.toString(exampleDeck.getCard(0).getCard()));
		assertEquals(Arrays.toString(dummyDeck.get(1).getCard()), Arrays.toString(exampleDeck.getCard(1).getCard()));
		assertEquals(Arrays.toString(dummyDeck.get(2).getCard()), Arrays.toString(exampleDeck.getCard(2).getCard()));
		assertEquals(Arrays.toString(dummyDeck.get(3).getCard()), Arrays.toString(exampleDeck.getCard(3).getCard()));
		assertEquals(Arrays.toString(dummyDeck.get(4).getCard()), Arrays.toString(exampleDeck.getCard(4).getCard()));
		assertEquals(Arrays.toString(dummyDeck.get(5).getCard()), Arrays.toString(exampleDeck.getCard(5).getCard()));
		assertEquals(Arrays.toString(dummyDeck.get(6).getCard()), Arrays.toString(exampleDeck.getCard(6).getCard()));
		assertEquals(Arrays.toString(dummyDeck.get(7).getCard()), Arrays.toString(exampleDeck.getCard(7).getCard()));
		assertEquals(Arrays.toString(dummyDeck.get(8).getCard()), Arrays.toString(exampleDeck.getCard(8).getCard()));
		assertEquals(Arrays.toString(dummyDeck.get(9).getCard()), Arrays.toString(exampleDeck.getCard(9).getCard()));
	}

	@Test
	public void testWriteDeck() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDeck() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCard() {
		fail("Not yet implemented");
	}

}

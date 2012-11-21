package flashcards;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CardTest {
	String testString, testString2, testString3;
	Card testCard;
	
	@Before
	public void setUp() throws Exception {
		testString = "Albany,New York,10,5";
		testString2 = "Albany, New York, 10, 5";
		testCard = new Card(testString);		
	}

	@Test
	public void testCard() {
		assertArrayEquals(new String[] {"Albany", "New York", "10", "5"},  new Card(testString).getCard());
		assertArrayEquals(new String[] {"Albany", "New York", "10", "5"},  new Card(testString2).getCard());
	}

	@Test
	public void testGetCard() {
		assertArrayEquals(new String[] {"Albany", "New York", "10", "5"},  new Card(testString).getCard());
	}

	@Test
	public void testGetCardElement() {
		assertEquals("Albany", testCard.getCardElement(0));
		assertEquals("New York", testCard.getCardElement(1));
		assertEquals("10", testCard.getCardElement(2));
		assertEquals("5", testCard.getCardElement(3));
	}

	@Test
	public void testSetCardElement() {
		testCard.setCardElement(0, "Buffalo");
		testCard.setCardElement(1, "New Jersey");
		assertEquals("Buffalo", testCard.getCardElement(0));
		assertEquals("New Jersey", testCard.getCardElement(1));
	}

}

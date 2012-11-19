package flashcards;

public class Card {
	private String[] card = new String[4];
	String delimiter = ",";
	
	public Card(String line){
		 card = line.split(delimiter);
	}

	public String[] getCard(){
		return this.card;		
	}
	
	public String getCardElement(int pos){
		return this.card[pos];
	}
	
	public void setCardElement(int pos, String change){
		this.card[pos] = change;
	}
}
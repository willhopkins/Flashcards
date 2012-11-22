package flashcards;

public class BuildModel {
	
	Deck deck;
	Card currentCard;
	int currentPos = 0;
	
	public BuildModel(String filepath){
		deck = new Deck(filepath);
		currentCard = this.deck.getCard(0);
	}
	
	public void addCard(Card newCard){
		this.deck.getDeck().add(newCard);
	}
	
	public void editCard(int pos, String change){
		currentCard.setCardElement(pos, change);
	}
	
	public void findCard(String searchTerm){
		for (int i = 0; i < this.deck.getDeck().size(); i++){
			for (int j = 0; j < this.deck.getDeck().get(i).getCard().length; j++){
				if (searchTerm == this.deck.getDeck().get(i).getCard()[j]){
					currentCard = this.deck.getDeck().get(i);
					break;
				}
			}
		}
	}
	
	public void nextCard(){
		currentPos++;
		currentCard = this.deck.getDeck().get(currentPos);		
	}

    public void prevCard(){
        currentPos--;
        currentCard = this.deck.getDeck().get(currentPos);
    }
	
	public void writeOut(){
		this.deck.writeDeck();
	}
	

}

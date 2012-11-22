package flashcards;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Arrays;
import java.util.List;

public class Deck {
	List<Card> deck = new ArrayList<Card>();
	FileInputStream fstreamI; 
	FileOutputStream fstreamO;
	String commonPath;
	
	public Deck(String filepath){
		
		try {
			commonPath = filepath;
			fstreamI = new FileInputStream(commonPath);
			BufferedReader br = new BufferedReader(new InputStreamReader(new DataInputStream(fstreamI)));
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null){
				deck.add(new Card(sCurrentLine)); 
			}
			br.close();
		}catch (Exception e){System.err.println("Error: " + e.getMessage());}
	}
	
	public void writeDeck(){
		
		try{
			fstreamO = new FileOutputStream(commonPath);
			BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(new DataOutputStream(fstreamO)));
			for (int i = 0; i < this.deck.size(); i++){
				String rawline = Arrays.toString(this.getCard(i).getCard());
				String cleanLine = rawline.substring(1, rawline.length()-1);
				wr.write(cleanLine);
				wr.newLine();
			}
			wr.flush(); 
			wr.close();
		}catch (Exception e){System.err.println("Error: " + e.getMessage());}
	}
	
	public List<Card> getDeck(){return this.deck;}
	
	public void setDeck(Deck newDeck){this.deck = newDeck.getDeck();}
	
	public Card getCard(int pos){return this.deck.get(pos);}
	
	
}

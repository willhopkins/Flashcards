package flashcards;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Deck {
	
	public static List<Card> createDeck(String filepath){
		List<Card> deck = new ArrayList<Card>();
		try {
			FileInputStream fstream = new FileInputStream(filepath);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null)   {
				deck.add(new Card(sCurrentLine)); 
			}
		in.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
		return deck;
	}
	public static void writeDeck(List<Card> deck){}
}

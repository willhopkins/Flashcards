package flashcards;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.event.*;

public class BuildView extends JFrame {
	
	private JButton quit, search, prev, next;
	private JLabel question, answer;
	private JTextField qText, aText;
	
	BuildView(Deck deck){
		
		this.deck = deck; //FIXME I'm clearly implementing something wrong here
		
		//Initialize all JButtons
		quit = new JButton("Quit");
		search = new JButton("Search");
		prev = new JButton("Previous");
		next = new JButton("Next");
		
		//Add ActionListeners to all JButtons
		quit.addActionListener(new QuitListener());
		search.addActionListener(new SearchListener());
		prev.addActionListener(new PrevListener());
		next.addActionListener(new NextListener());
		
	}
	
	private class QuitListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent unused) {
			
		}		
	}
	
	private class SearchListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent unused) {
			//Implement dialog box with JTextField for search string?
		}
	}
	
	private class PrevListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent unused) {
			
		}		
	}
	
	private class NextListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent unused) {
			
		}
	}

}

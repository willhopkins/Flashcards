package flashcards;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;

public class BuildView extends JFrame implements Observer{
	
	private JButton quit, search, prev, next;
	private JLabel question, answer, interval, time;
	private JTextField qText, aText, iText, tText;
	private JPanel top, middleUpper, middleLower, bottom;
	
	BuildView(Deck deck){ //FIXME Am I passing the right object here?
		
		this.deck = deck; //FIXME I'm clearly implementing something wrong here
		
		//Initialize all JPanels
		top = new JPanel();
		middle = new JPanel();
		bottom = new JPanel();
		
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
		
		//Initialize all JLabels
		question = new JLabel("Question: ");
		answer = new JLabel("Answer: ");
		interval = new JLabel("Interval: ");
		time = new JLabel("Time: ");
		
		//Initialize all JTextFields
		qText = new JTextField();
		aText = new JTextField();
		iText = new JTextField();
		tText = new JTextField();
		
		//Add items to JPanels
		top.add(quit, BorderLayout.WEST);
		top.add(search, BorderLayout.EAST);
		middleUpper.add(question, BorderLayout.WEST);
		middleUpper.add(qText, BorderLayout.NORTH);
		middleUpper.add(answer, BorderLayout.WEST);
		middleUpper.add(aText, BorderLayout.SOUTH);
		middleLower.add(interval, BorderLayout.WEST);
		middleLower.add(iText, BorderLayout.NORTH);
		middleLower.add(time, BorderLayout.SOUTH);
		middleLower.add(tText, BorderLayout.EAST);
		bottom.add(prev, BorderLayout.WEST);
		bottom.add(next, BorderLayout.EAST);
		
	}
	
	private class QuitListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent unused) {
			//Write out and close GUI
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
			this.deck.prevCard(); //FIXME Call this method on the right object
		}		
	}
	
	private class NextListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent unused) {
			this.deck.nextCard(); //FIXME Call this method on the right object
		}
	}
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

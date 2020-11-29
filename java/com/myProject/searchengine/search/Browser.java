package com.myProject.searchengine.search;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import java.awt.Dimension;


public class Browser {
	

	private JFrame frame;
	private JTextField query;
	public static JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Browser window = new Browser();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Browser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblSearchQuery = new JLabel("SEARCH QUERY");
		lblSearchQuery.setForeground(Color.WHITE);
		lblSearchQuery.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSearchQuery.setBounds(255, 52, 163, 40);
		frame.getContentPane().add(lblSearchQuery);
		
		query = new JTextField();
		query.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		query.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		query.setBounds(155, 102, 366, 30);
		frame.getContentPane().add(query);
		query.setColumns(10);
		
		
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.setBackground(Color.BLACK);
		btnSearch.setForeground(Color.RED);
		btnSearch.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		btnSearch.setMnemonic(' ');
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				
					String l=query.getText();
					try {
						SearchMain.main1(l);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
									
				
			}
		});
		btnSearch.setBounds(182, 179, 85, 21);
		frame.getContentPane().add(btnSearch);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 274, 666, 172);
		Font font = new Font("Segoe Script", Font.BOLD, 10);
        textArea.setFont(font);
        textArea.setForeground(Color.BLUE);
		
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("CLEAR");
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			
				 public void actionPerformed(ActionEvent e){
				         query.setText("");
				         textArea.setText("");
				        //textfield.setText(null); //or use this
				    }
			
		});
		btnNewButton.setBounds(415, 179, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		
		
	}
}


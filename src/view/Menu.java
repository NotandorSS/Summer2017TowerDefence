package view;

import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends JFrame{
	JPanel menu;
	JPanel board;
	
	public Menu(){
		buildMenu();
		this.setContentPane(menu);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
	}
	
	private void buildMenu(){
		menu = new JPanel(new GridBagLayout());
		menu.setPreferredSize(new Dimension(800, 800));
		JButton button1 = new JButton("button1");
		JButton button2 = new JButton("button2");
		menu.add(button1);
		menu.add(button2);
	}
	
	public static void main(String[] args){
		Menu test = new Menu();
	}
}

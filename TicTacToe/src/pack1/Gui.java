package pack1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui {
	
	JFrame	jf;
	Draw draw;
	JButton btnReset;
	
	static JButton btn [] = new JButton[9]; //Wir brauchen 9 Button. 1 f�r jedes Feld
	static int state[] = new int[9];
	static int player = 0;
	static int gewinner = 0;

	public Gui() {
		
		jf = new JFrame();
		jf.setSize(800, 600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null); //Fenster zentrieren
		jf.setResizable(false);// das es sich nicht gr�sser ode kleiner ziehen l�sst
		jf.setTitle("Tic Tac Toe");
		
		for(int i = 0; i<btn.length; i++){ //damit werden alle Buttonzahlen abgefragt 
			btn[i] = new JButton();
			btn[i].setVisible(true);
			btn[i].addActionListener (new ActionHandler());
			btn[i].setFocusPainted(false);//text wird nicht umrandet
			btn[i].setContentAreaFilled(false);//inhalt der Button wird sichtbar
			btn[i].setBorder(null);
			jf.add(btn[i]);//button wird dem JFrame hinzugef�gt
		}
		
		ButtonPlacement.place();
		
		btnReset =new JButton("Reset");
		btnReset.setBounds(675, 500, 100, 40);
		btnReset.setVisible(true);
		btnReset.setBackground(new Color(51,102,153));
		btnReset.setForeground(Color.WHITE);
		btnReset.setFocusPainted(false);
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Funktion.reset();
			}
		});
		
		
		jf.add(btnReset);
		
		
		
		draw = new Draw();
		draw.setBounds(0,0,800,600);
		draw.setVisible(true);
		jf.add(draw);
		
		jf.setVisible(true); // erst am schluss sonst werden andere Dinge nicht angezeigt
		
		
		
	}

}
package snake;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	GameFrame(){
		Gamepannel pannel = new Gamepannel();
		this.add(pannel);
		this.setTitle("snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

}

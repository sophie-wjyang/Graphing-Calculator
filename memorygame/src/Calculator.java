import java.awt.*;
import javax.swing.*;

public class Calculator {
	public static void main(String[] args) {
		MainMenu aFrame = new MainMenu("New Window"); //new object of the MyFrame class
		aFrame.setSize(800,800); //size of window
		aFrame.setVisible(true); //makes the window visible
		aFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		aFrame.getContentPane().setBackground(Color.blue);
	}
}


import java.awt.*;
import javax.swing.*;

public class Calculator {
	public static void main(String[] args) {
		//MainMenu aFrame = new MainMenu("New Window");
		SimpleCalculator calculator = new SimpleCalculator("Simple Calculator"); //new object of the MyFrame class
		calculator.setSize(510,690); //size of window
		calculator.setVisible(true); //makes the window visible
		calculator.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}


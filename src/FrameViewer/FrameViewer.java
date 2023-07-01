package FrameViewer;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameViewer
{

	public static void main(String[] args)
	{
	      JFrame frame = new JFrame();
	      frame.setSize(400, 400);
	      JLabel label = new JLabel("Hello, Dillon Welsh!");
	      label.setOpaque(true);
	      Color myColor = new Color(150,250,150);
	      label.setBackground(myColor);
	      frame.add(label);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setVisible(true);
	}
}

/*
�Double the frame size.
�Change the greeting to �Hello, your name!�.
�Change the background color to pale green (see Exercise �� Graphics E2.11).
�For extra credit, add an image of yourself. (Hint: Construct an ImageIcon.)
*/
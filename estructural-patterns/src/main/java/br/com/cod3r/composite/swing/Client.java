package br.com.cod3r.composite.swing;

import javax.swing.*;
import java.awt.*;

public class Client {

	public static void main(String[] args) {
		JFrame frame =new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		JLabel title = new JLabel("TITLE");
		frame.add(title, BorderLayout.NORTH);

		JPanel panel = new JPanel(new FlowLayout());
		JLabel label = new JLabel("Label #1");
		JButton button= new JButton("Button #1");
		panel.add(label);
		panel.add(button);

		frame.add(panel, BorderLayout.CENTER);

		frame.setSize(300,300);
		frame.setVisible(true);
	}
}

package tut13.login_gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.*;

public class LoginGUI {
	// Declare variables
	private static JLabel headingLabel;
	private static JLabel userLabel;
	private static JTextField usernameInputField;
	private static JLabel passwordLabel;
	private static JPasswordField passwordInputLabel;
	private static JButton loginButton;
	private static JLabel errorLabel;
	private static JLabel success;

	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("Login");
		mainFrame.setSize(400, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(mainFrame);
		// create main panel
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(null);
		// Create title
		headingLabel = new JLabel("Login Form");
		headingLabel.setBounds(10, 10, 390, 25);
		headingLabel.setHorizontalAlignment(JLabel.CENTER);
		headingLabel.setFont(new Font("Arial", Font.BOLD, 25));
		// Create User label
		userLabel = new JLabel("User");
		userLabel.setBounds(30, 60, 80, 25);
		userLabel.setFont(new Font("Arial", Font.BOLD, 15));
		// Create username input field
		usernameInputField = new JTextField(30);
		usernameInputField.setBounds(110, 60, 165, 25);
		// Create password label
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(30, 90, 80, 25);
		passwordLabel.setFont(new Font("Arial", Font.BOLD, 15));
		// Create password input field
		passwordInputLabel = new JPasswordField(30);
		passwordInputLabel.setBounds(110, 90, 165, 25);
		// Create login button
		loginButton = new JButton("Login");
		loginButton.setBounds(100, 120, 80, 25);
		// Create error label
		errorLabel = new JLabel("");
		errorLabel.setBounds(30, 150, 490, 25);
		errorLabel.setFont(new Font("Arial", Font.BOLD, 16));
		errorLabel.setForeground(Color.RED);
		// Create success label
		success = new JLabel("");
		success.setBounds(30, 150, 490, 25);
		success.setFont(new Font("Arial", Font.BOLD, 16));
		success.setForeground(Color.RED);

		// Add components to panel
		mainPanel.add(headingLabel);
		mainPanel.add(userLabel);
		mainPanel.add(usernameInputField);
		mainPanel.add(passwordLabel);
		mainPanel.add(passwordInputLabel);
		mainPanel.add(errorLabel);
		mainPanel.add(success);
		mainPanel.add(loginButton);
		// set frame visible
		mainFrame.add(mainPanel);
		mainFrame.setVisible(true);

		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println("Button clicked");
				String username = usernameInputField.getText();
				String password = passwordInputLabel.getText();
				if ((username.length() < 1) || ((password.length() <1))) {
					errorLabel.setText("Username or password should not be empty!");
					usernameInputField.requestFocus();
					passwordInputLabel.requestFocus();

				} else if ((!username.equals("hieuhayho")) || (!password.equals("13072004")) ) {
					errorLabel.setText("Access denied, wrong username or password");
					passwordInputLabel.requestFocus();
				} else {
					System.out.println(username);
					System.out.println(password);
					success.setText("Login successful");
					success.requestFocus();
					errorLabel.setText("");
				}
			}
		});
	}

}

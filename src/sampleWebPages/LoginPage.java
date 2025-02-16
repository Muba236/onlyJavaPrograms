package sampleWebPages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginPage() {
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        // Create labels, text fields, and password field
        JLabel usernameLabel = new JLabel("Username:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        add(usernameLabel, constraints);

        usernameField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        add(usernameField, constraints);

        JLabel passwordLabel = new JLabel("Password:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        add(passwordLabel, constraints);

        passwordField = new JPasswordField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        add(passwordField, constraints);

        // Create login button
        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement login logic here
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (isValidCredentials(username, password)) {
                    // Successful login
                    System.out.println("Login successful!");
                } else {
                    // Invalid credentials
                    JOptionPane.showMessageDialog(null, "Invalid username or password.");
                }
            }
        });

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        add(loginButton, constraints);

        pack();
        setVisible(true);
    }

    // Replace this with your actual login validation logic
    private boolean isValidCredentials(String username, String password) {
        // Example: Check against a database or hardcoded values
        return username.equals("admin") && password.equals("password");
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
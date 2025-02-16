package sampleWebPages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPageChatGpt {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set the frame to maximize on startup
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true); // Optional: Remove window decorations for a modern look

        // Create a panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(33, 150, 243)); // Attractive blue background

        // Create constraints for GridBagLayout
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.anchor = GridBagConstraints.CENTER;

        // Create title label
        JLabel titleLabel = new JLabel("Login Page");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);
        panel.add(titleLabel, constraints);

        // Create username label and text field
        constraints.gridy++;
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setForeground(Color.WHITE);
        panel.add(usernameLabel, constraints);

        constraints.gridy++;
        JTextField usernameField = new JTextField(20);
        panel.add(usernameField, constraints);

        // Create password label and password field
        constraints.gridy++;
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setForeground(Color.WHITE);
        panel.add(passwordLabel, constraints);

        constraints.gridy++;
        JPasswordField passwordField = new JPasswordField(20);
        panel.add(passwordField, constraints);

        // Create login button
        constraints.gridy++;
        JButton loginButton = new JButton("Login");
        loginButton.setBackground(new Color(76, 175, 80)); // Green color
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        panel.add(loginButton, constraints);

        // Create close button
        JButton closeButton = new JButton("Close");
        closeButton.setBackground(Color.RED);
        closeButton.setForeground(Color.WHITE);
        closeButton.setFocusPainted(false);
        closeButton.setFont(new Font("Arial", Font.BOLD, 14));
        closeButton.setPreferredSize(new Dimension(80, 30)); // Set preferred size
        constraints.gridy++;
        panel.add(closeButton, constraints);

        // Add action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle login action
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // For demonstration purposes, we'll just print the credentials
                // In a real application, you should validate these against a database or other service
                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
            }
        });

        // Add action listener to the close button
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the window
                System.exit(0);
            }
        });

        // Create a top panel to hold the close button
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        topPanel.setBackground(new Color(33, 150, 243)); // Match background color of the main panel
        topPanel.add(closeButton, BorderLayout.EAST);

        // Create a container panel to add both top panel and main panel
        JPanel containerPanel = new JPanel();
        containerPanel.setLayout(new BorderLayout());
        containerPanel.add(topPanel, BorderLayout.NORTH);
        containerPanel.add(panel, BorderLayout.CENTER);

        // Add the container panel to the frame and make it visible
        frame.add(containerPanel);
        frame.setVisible(true);
    }
}


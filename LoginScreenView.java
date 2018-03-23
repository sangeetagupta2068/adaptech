package adaptech;

import adaptech.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class LoginScreenView extends DisplayScreenView implements ActionListener {

    JLabel nameLabel,passLabel,backLabel,loginLabel;
    JTextField nameField;
    JPasswordField passField;
    JButton loginButton,registerButton;
    JPanel namePanel,passPanel,buttonPanel;
    String name,pass;

    LoginScreenView(){

        loginLabel=new JLabel(":                Please Login if you are an existing user or else register yourself first                  :");
        loginLabel.setFont(new Font("SansSerif", Font.PLAIN, 24));
        loginLabel.setOpaque(true);
        loginLabel.setBackground(Color.WHITE);

        namePanel = new JPanel();
        nameLabel = new JLabel("ENTER USERNAME : ");
        nameField = new JTextField(20);
        nameLabel.setOpaque(true);
        nameLabel.setBackground(Color.WHITE);
        namePanel.add(nameLabel);
        namePanel.add(nameField);
        centerDisplayPanel.add(namePanel);

        passPanel = new JPanel();
        passLabel = new JLabel("ENTER PASSWORD : ");
        passLabel.setOpaque(true);
        passLabel.setBackground(Color.WHITE);
        passField = new JPasswordField(10);
        passPanel.add(passLabel);
        passPanel.add(passField);
        centerDisplayPanel.add(passPanel);

        buttonPanel=new JPanel();
        loginButton=new JButton("Login");
        registerButton=new JButton("Register");
        buttonPanel.add(loginButton);
        buttonPanel.add(registerButton);
        centerDisplayPanel.add(buttonPanel);
        centerDisplayPanel.add(loginLabel);

        displayScreenContainer.add(centerDisplayPanel,BorderLayout.CENTER);

        setVisible(true);
        setTitle("LOGIN SCREEN");
        setSize(1500,1500);
        //setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loginButton.addActionListener(this);
        registerButton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent actionEvent) {

        if(actionEvent.getActionCommand()=="Login") {

              //System.out.println("LOL" + nameField.getText());
              String compare = nameField.getText();
              //System.out.println(passField.getText() + nameField.getText());
              DatabaseConnectivity databaseConnectivity = new DatabaseConnectivity();

              try{

                  if(databaseConnectivity.checkLogin(nameField.getText(),passField.getText())==true){

                          if(!(new String(nameField.getText()).equals("admin"))){

                              JOptionPane.showMessageDialog(this,"You are now logged in!");
                              this.dispose();
                              GuideLineScreenView guideLineScreenView = new GuideLineScreenView();

                          }
                          else {

                                this.dispose();
                                Suggestion suggestion = new Suggestion();

                          }

                  }
                  else if(databaseConnectivity.checkLogin(nameField.getText(),passField.getText())!=true){

                              JOptionPane.showMessageDialog(this,"Incorrect UserName/Password!");
                              passField.setText("");
                              nameField.setText("");

                  }

              }

              catch(Exception exception){

                  System.out.println(exception);

              }

        }

        else if(actionEvent.getActionCommand()=="Register") {

              System.out.println("hey!");
              this.dispose();
              RegisterScreenView registerScreenView = new RegisterScreenView();
              //Register Form Object

        }

    }
    
}

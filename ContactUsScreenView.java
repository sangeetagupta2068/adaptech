package adaptech;

import adaptech.DisplayScreenView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class ContactUsScreenView extends DisplayScreenView implements ActionListener {

  String titleForContact,descriptionForContact;
  JPanel contactTitlePanel,contactDescriptionPanel,suggestionPanel,namePanel,emailPanel,buttonPanel;
  JTextField nameTextField,emailTextField;
  JTextArea suggestionTextField;
  JButton submitButton,resetButton;
  JLabel contactDescription,contactTitle,nameLabel,emailLabel,suggestionLabel;

  ContactUsScreenView() {

        //titleForContact="Adaptech - Create magic with Logic\n";

        Color lightGrey = new Color(218, 218, 230);
        Color darkBlue = new Color(59, 95, 125);

        descriptionForContact="<html><p>Let's talk!All your general queries and suggestions for AdapTech are welcomed !" +
       "<br>Please reach us by filling the given below form</p></html>";

        contactDescriptionPanel = new JPanel();
        contactDescriptionPanel.setBackground(lightGrey);


        contactTitlePanel = new JPanel();
        contactTitle=new JLabel(titleForContact);
        contactTitle.setFont(new Font("Lucida Blackletter", Font.BOLD, 30));
        contactTitle.setOpaque(true);
        contactTitlePanel.add(contactTitle);
        centerDisplayPanel.add(contactTitlePanel);

        contactDescription=new JLabel(descriptionForContact);
        contactDescription.setOpaque(true);
        contactDescription.setFont(new Font("Lucida Blackletter", Font.ITALIC, 15));
        contactDescriptionPanel.add(contactDescription);
        centerDisplayPanel.add(contactDescriptionPanel);

        namePanel = new JPanel();
        nameLabel = new JLabel("ENTER NAME : ");
        nameTextField = new JTextField(20);
        nameLabel.setOpaque(true);
        nameLabel.setBackground(Color.WHITE);
        namePanel.add(nameLabel);
        namePanel.add(nameTextField);
        centerDisplayPanel.add(namePanel);

        emailPanel = new JPanel();
        emailLabel = new JLabel("ENTER EMAIL-ID  : ");
        emailTextField = new JTextField(20);
        emailLabel.setOpaque(true);
        emailLabel.setBackground(Color.WHITE);
        emailPanel.add(emailLabel);
        emailPanel.add(emailTextField);
        centerDisplayPanel.add(emailPanel);

        suggestionPanel = new JPanel();
        suggestionLabel = new JLabel("ENTER SUGESSTION: ");
        suggestionTextField = new JTextArea(5, 20);
        suggestionPanel.add(suggestionLabel);
        suggestionPanel.add(suggestionTextField);
        centerDisplayPanel.add(suggestionPanel);

        buttonPanel = new JPanel();
        submitButton=new JButton("Submit");
        buttonPanel.add(submitButton);
        resetButton=new JButton("Reset");
        buttonPanel.add(resetButton);
        centerDisplayPanel.add(buttonPanel);

				displayScreenContainer.add(centerDisplayPanel,BorderLayout.CENTER);

        setVisible(true);
        setTitle("CONTACT US SCREEN");
        setSize(1500,1500);
        //setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submitButton.addActionListener(this);
        resetButton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent actionEvent) {

        if(actionEvent.getActionCommand()=="Submit") {

            DatabaseConnectivity databaseConnectivity = new DatabaseConnectivity();

            try{

                databaseConnectivity.insertApplicantSuggestion(nameTextField.getText(),emailTextField.getText(),suggestionTextField.getText());
                JOptionPane.showMessageDialog(this,"We will take this into account! :) ");

            }

            catch(Exception exception){

                System.out.println(exception);

            }

        }

        nameTextField.setText("");
        emailTextField.setText("");
        suggestionTextField.setText("");

    }

   public static void main(String... args) {

        ContactUsScreenView homeScreenView = new ContactUsScreenView();

    }

 }

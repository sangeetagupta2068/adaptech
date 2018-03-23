package adaptech;

import adaptech.DisplayScreenView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class RegisterScreenView extends DisplayScreenView implements ActionListener,ItemListener {

    JLabel nameLabel,userNameLabel,emailLabel, contactLabel, passLabel, confirmPassLabel,City,gender,qualification;
    JTextField nameTextField, lastNameTextField, userNameTextField, emailTextField,contactTextField;
    JTextArea qualificationField;
    String cityValue="",genderValue="";
    JPasswordField passField, confirmPassField;
    JRadioButton male, female;
    ButtonGroup genderRadioButton;
    JComboBox city;
    JButton registerButton,resetButton;
    JPanel namePanel, cityPanel, userNamePanel, passPanel, confirmPassPanel, emailPanel, contactPanel, genderPanel, qualificationsPanel,buttonPanel;

    RegisterScreenView() {

        namePanel = new JPanel();
        nameLabel = new JLabel("ENTER NAME : ");
        nameTextField = new JTextField(20);
        nameLabel.setOpaque(true);
        nameLabel.setBackground(Color.WHITE);
        namePanel.add(nameLabel);
        namePanel.add(nameTextField);
        centerDisplayPanel.add(namePanel);


        userNamePanel = new JPanel();
        userNameLabel= new JLabel("ENTER USER NAME : ");
        userNameTextField = new JTextField(20);
        userNameLabel.setOpaque(true);
        userNameLabel.setBackground(Color.WHITE);
        userNamePanel.add(userNameLabel);
        userNamePanel.add(userNameTextField);
        centerDisplayPanel.add(userNamePanel);

        emailPanel = new JPanel();
        emailLabel = new JLabel("ENTER EMAIL-ID  : ");
        emailTextField = new JTextField(20);
        emailLabel.setOpaque(true);
        emailLabel.setBackground(Color.WHITE);
        emailPanel.add(emailLabel);
        emailPanel.add(emailTextField);
        centerDisplayPanel.add(emailPanel);

        contactPanel = new JPanel();
        contactLabel = new JLabel("ENTER CONTACT NUMBER : ");
        contactTextField = new JTextField(20);
        contactLabel.setOpaque(true);
        contactLabel.setBackground(Color.WHITE);
        contactPanel.add(contactLabel);
        contactPanel.add(contactTextField);
        centerDisplayPanel.add(contactPanel);

        qualificationsPanel = new JPanel();
        qualification = new JLabel("ENTER QUALIFICATION: ");
        qualificationField = new JTextArea(5, 20);
        qualificationsPanel.add(qualification);
        qualificationsPanel.add(qualificationField);
        centerDisplayPanel.add(qualificationsPanel);

        genderPanel=new JPanel();
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        genderRadioButton = new ButtonGroup();
        genderRadioButton.add(male);
        genderRadioButton.add(female);
        gender = new JLabel("Gender: ");
        genderPanel.add(gender);
        genderPanel.add(male);
        genderPanel.add(female);
        centerDisplayPanel.add(genderPanel);

        cityPanel = new JPanel();
        City = new JLabel("City");
        city = new JComboBox();
        city.addItem("Hyderabad");
        city.addItem("Pune");
        city.addItem("Chennai");
        city.addItem("Guwahati");
        city.addItem("Bangalore");
        cityPanel.add(City);
        cityPanel.add(city);
        centerDisplayPanel.add(cityPanel);


        passPanel = new JPanel();
        passLabel = new JLabel("ENTER PASSWORD : ");
        passLabel.setOpaque(true);
        passLabel.setBackground(Color.WHITE);
        passField = new JPasswordField(20);
        passPanel.add(passLabel);
        passPanel.add(passField);
        centerDisplayPanel.add(passPanel);

        confirmPassPanel = new JPanel();
        confirmPassLabel = new JLabel("RE-ENTER PASSWORD : ");
        confirmPassLabel.setOpaque(true);
        confirmPassLabel.setBackground(Color.WHITE);
        confirmPassField = new JPasswordField(20);
        confirmPassPanel.add(confirmPassLabel);
        confirmPassPanel.add(confirmPassField);
        centerDisplayPanel.add(confirmPassPanel);

        buttonPanel = new JPanel();
        registerButton=new JButton("Register");
        buttonPanel.add(registerButton);
        resetButton=new JButton("Reset");
        buttonPanel.add(resetButton);
        centerDisplayPanel.add(buttonPanel);

        displayScreenContainer.add(centerDisplayPanel,BorderLayout.CENTER);

        setVisible(true);
        setTitle("REGISTER SCREEN");
        setSize(1500,1500);
        //setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        male.addItemListener(this);
        female.addItemListener(this);
        registerButton.addActionListener(this);
        resetButton.addActionListener(this);
        city.addItemListener(this);

    }


    public void actionPerformed(ActionEvent actionEvent) {

        if(actionEvent.getActionCommand()=="Register") {

            DatabaseConnectivity databaseConnectivity = new DatabaseConnectivity();

            try{

                databaseConnectivity.insertApplicantInformation("applicant_information",nameTextField.getText(),userNameTextField.getText(),emailTextField.getText(),Integer.parseInt(contactTextField.getText()),qualificationField.getText(),genderValue,cityValue,passField.getText());
                JOptionPane.showMessageDialog(this,"You have been registered! :) ");

            }

            catch(Exception exception){

                System.out.println(exception);

            }


        }
        else if(actionEvent.getActionCommand()=="Reset"){

            nameTextField.setText("");
            userNameTextField.setText("");
            emailTextField.setText("");
            contactTextField.setText("");
            passField.setText("");
            confirmPassField.setText("");
            qualificationField.setText("");

        }

    }

    public void itemStateChanged(ItemEvent itemEvent){

        cityValue=city.getSelectedItem().toString();

        if(male.isSelected()){

          genderValue="M";
          
        }
        else if(female.isSelected()){

          genderValue="F";

        }

    }

    public void removeItemListener(ItemListener itemListener){

    }



}

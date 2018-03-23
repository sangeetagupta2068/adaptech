package adaptech;

import adaptech.*;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;


public class ChangePasswordAdminView extends DisplayScreenAdminView implements ActionListener{

      JPanel buttonPanel;
      JButton button;
      JPanel passPanel,confirmPassPanel,userPanel;
      JLabel passLabel,confirmPassLabel,userLabel;
      JTextField userNameTextField;
      JPasswordField passField,confirmPassField;

      ChangePasswordAdminView(){

          userPanel = new JPanel();
          userLabel = new JLabel ("Enter username");
          userNameTextField = new JTextField(30);
          userPanel.add(userLabel);
          userPanel.add(userNameTextField);
          centerDisplayPanel.add(userPanel);


          buttonPanel = new JPanel();
          button = new JButton("Save Changes");
          buttonPanel.add(button);

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


          centerDisplayPanel.add(buttonPanel);

          displayScreenApplicantContainer.add(centerDisplayPanel,BorderLayout.CENTER);

          button.addActionListener(this);

          setSize(1500,1500);
          setTitle("CHANGE PASSWORD");
          setVisible(true);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      }

      public void actionPerformed(ActionEvent actionEvent){

          if(actionEvent.getActionCommand()=="Save Changes"){
              //code comes here
              try{

                if(passField.getText().equals(new String(confirmPassField.getText()))){

                  DatabaseConnectivity databaseConnectivity = new DatabaseConnectivity();
                  databaseConnectivity.setNewPassword(userNameTextField.getText(),passField.getText());
                  JOptionPane.showMessageDialog(this, "Your new password has been set. Check your email and confirm it's you!");

                }

                else{

                JOptionPane.showMessageDialog(this, "Password doesn't match!");
                passField.setText("");
                confirmPassField.setText("");

                }

            }

            catch(Exception exception){

                System.out.println(exception);

            }

        }
          
      }

}

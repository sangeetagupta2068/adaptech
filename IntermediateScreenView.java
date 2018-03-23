package adaptech;

import adaptech.*;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class IntermediateScreenView extends DisplayScreenApplicantView implements ActionListener {

    JPanel userPanel,buttonPanel,aboutTheOrganizationPanel;
    JLabel userLabel,aboutTheOrganizationTitleLabel;
    JTextField usernameField;
    JButton submit;
    String aboutTheOrganizationTitle;


    IntermediateScreenView(){

          Color lightGrey = new Color(218, 218, 230);


          aboutTheOrganizationTitle="Adaptech - Create magic with Logic";

          aboutTheOrganizationPanel = new JPanel();
          aboutTheOrganizationPanel.setPreferredSize(new Dimension(20, 30));
  				aboutTheOrganizationPanel.setBackground(lightGrey);

          aboutTheOrganizationTitleLabel=new JLabel(aboutTheOrganizationTitle);
          aboutTheOrganizationTitleLabel.setOpaque(true);
          aboutTheOrganizationTitleLabel.setFont(new Font("Lucida Blackletter", Font.BOLD, 30));
          aboutTheOrganizationPanel.add(aboutTheOrganizationTitleLabel);
          centerDisplayPanel.add(aboutTheOrganizationPanel);

          userPanel = new JPanel();
          userLabel = new JLabel("ENTER USERNAME");
          usernameField = new JTextField(40);
          userPanel.add(userLabel);
          userPanel.add(usernameField);
          centerDisplayPanel.add(userPanel);

          buttonPanel = new JPanel();
          submit=new JButton("Submit");
          buttonPanel.add(submit);
          centerDisplayPanel.add(buttonPanel);

          displayScreenApplicantContainer.add(centerDisplayPanel,BorderLayout.CENTER);

          submit.addActionListener(this);

          setVisible(true);
          setSize(1500,1500);
          //setResizable(false);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent actionEvent){

        if(actionEvent.getActionCommand()=="Submit"){

            TestScreen testScreen = new TestScreen();
            testScreen.userName=usernameField.getText();
            testScreen.setTitle("TEST");
            testScreen.setSize(1500,1500);
            testScreen.setVisible(true);
            testScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }

    }
    
}

package adaptech;

import adaptech.*;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;


class Suggestion extends DisplayScreenAdminView {

      JPanel suggestionPanel;
      String suggestion="";
      JLabel suggestionLabel;
      ResultSet resultSet;

      Suggestion(){

          try{

              DatabaseConnectivity databaseConnectivity = new DatabaseConnectivity();
              suggestionPanel = new JPanel();
              resultSet = databaseConnectivity.displaySuggestions();

                    suggestion = "<html>";
                    while(resultSet.next()){

                        suggestion = suggestion + "<br>" + resultSet.getString(1) + " suggested " + resultSet.getString(3) + ".";

                    }
                    suggestion = suggestion + "</html>";

          }
          catch(Exception exception){

              System.out.println(exception);
          }

          suggestionLabel = new JLabel(suggestion);
          suggestionLabel.setOpaque(true);
          suggestionLabel.setFont(new Font("Lucida Blackletter", Font.ITALIC, 15));
          suggestionPanel.add(suggestionLabel);
          centerDisplayPanel.add(suggestionPanel);

          displayScreenApplicantContainer.add(centerDisplayPanel,BorderLayout.CENTER);

          setSize(1500,1500);
          setTitle("RESULT SCREEN");
          setVisible(true);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
      }

}

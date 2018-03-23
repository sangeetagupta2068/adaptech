package adaptech;

import adaptech.*;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;


class Result extends DisplayScreenAdminView {

      JPanel resultPanel;
      String result="";
      JLabel resultLabel;
      ResultSet resultSet;

      Result(){

          try{

              DatabaseConnectivity databaseConnectivity = new DatabaseConnectivity();
              resultPanel = new JPanel();
              resultSet = databaseConnectivity.displayMarks();

                    result = "<html>";
                    while(resultSet.next()){

                        result = result + "<br>" + resultSet.getString(1) + " scored " + resultSet.getInt(2) + " marks";

                    }
                    result = result + "</html>";

          }

          catch(Exception exception){

              System.out.println(exception);

          }

          resultLabel = new JLabel(result);
          resultLabel.setOpaque(true);
          resultLabel.setFont(new Font("Lucida Blackletter", Font.ITALIC, 15));
          resultPanel.add(resultLabel);
          centerDisplayPanel.add(resultPanel);

          displayScreenApplicantContainer.add(centerDisplayPanel,BorderLayout.CENTER);

          setSize(1500,1500);
          setTitle("RESULT SCREEN");
          setVisible(true);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      }

}

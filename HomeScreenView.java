package adaptech;

import adaptech.DisplayScreenView;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class HomeScreenView extends DisplayScreenView {

    String aboutTheOrganizationTitle,aboutTheOrganization;
    JPanel aboutTheOrganizationPanel;
    JLabel aboutTheOrganizationLabel,aboutTheOrganizationTitleLabel;
		//static HomeScreenView homeScreenObj;

    HomeScreenView() {

        Color lightGrey = new Color(218, 218, 230);
        Color darkBlue = new Color(59, 95, 125);

				aboutTheOrganizationTitle="Adaptech - Create magic with Logic";

				aboutTheOrganization="<html><p><br><br>We work with people and organizations who have ambitious missions."
				 + "<br>We are focused on helping our industry improve, and believe in sharing what we learn." +
				  "<br>We set up smart teams who love challenges and think disruptively to help our clients succeed." +
				"<br>We do this by writing books, blogging, running events, talking at conferences, and championing open source...</p>"+
				"<p><br><br>We are strong believers in the power of software and technology as tools for social change."+
				"<br>Through our Social Impact Program, we collaborate with organizations with a humanitarian mission and broad reach,"
         +"<br>helping them use technology to make an impact.</p></html>";

        aboutTheOrganizationPanel = new JPanel();
        aboutTheOrganizationPanel.setPreferredSize(new Dimension(20, 30));
				aboutTheOrganizationPanel.setBackground(lightGrey);


        aboutTheOrganizationTitleLabel=new JLabel(aboutTheOrganizationTitle);
        aboutTheOrganizationTitleLabel.setOpaque(true);
        aboutTheOrganizationTitleLabel.setFont(new Font("Lucida Blackletter", Font.BOLD, 30));
        aboutTheOrganizationPanel.add(aboutTheOrganizationTitleLabel);

        aboutTheOrganizationLabel=new JLabel(aboutTheOrganization);
        aboutTheOrganizationLabel.setFont(new Font("Lucida Blackletter", Font.ITALIC, 15));
        aboutTheOrganizationPanel.add(aboutTheOrganizationLabel);

				centerDisplayPanel.add(aboutTheOrganizationPanel);

				displayScreenContainer.add(centerDisplayPanel,BorderLayout.CENTER);

        setVisible(true);
        setTitle("HOME SCREEN");
        setSize(1500,1500);
        //setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String... args) {

        HomeScreenView homeScreenView = new HomeScreenView();
        
    }

 }

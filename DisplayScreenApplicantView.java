package adaptech;

import adaptech.MenuBarApplicantView;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class DisplayScreenApplicantView extends JFrame {

    JPanel centerDisplayPanel,northDisplayPanel,eastDisplayPanel,westDisplayPanel;
    Container displayScreenApplicantContainer;
    MenuBarApplicantView menuBarApplicantView;

    DisplayScreenApplicantView() {

        menuBarApplicantView=MenuBarApplicantView.getInstanceOfMenuBarApplicantView();

        Color lightGrey = new Color(218, 218, 230);
        Color darkBlue = new Color(59, 95, 125);

        displayScreenApplicantContainer = getContentPane();
        displayScreenApplicantContainer.setLayout(new BorderLayout());
        displayScreenApplicantContainer.setBounds(235, 104, 180, 27);

        centerDisplayPanel = new JPanel();
        centerDisplayPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        centerDisplayPanel.setLayout(new BoxLayout(centerDisplayPanel,BoxLayout.Y_AXIS));
        centerDisplayPanel.setSize(new Dimension(30,40));
        centerDisplayPanel.setBackground(darkBlue);

        northDisplayPanel = new JPanel();
        northDisplayPanel.add(menuBarApplicantView.menuContainer);
        northDisplayPanel.setBackground(darkBlue);

        eastDisplayPanel = new JPanel();
        eastDisplayPanel.setBackground(darkBlue);

        westDisplayPanel = new JPanel();
        westDisplayPanel.setBackground(darkBlue);

        displayScreenApplicantContainer.add(northDisplayPanel,BorderLayout.NORTH);
        displayScreenApplicantContainer.add(eastDisplayPanel,BorderLayout.EAST);
        displayScreenApplicantContainer.add(westDisplayPanel,BorderLayout.WEST);

        //setSize(1500,1500);
        setVisible(true);
        //setResizable(false);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /*public static DisplayScreenApplicantView getInstanceOfDisplayScreenApplicantView() {

        if(DisplayScreenApplicantObj==null){
            DisplayScreenApplicantObj=new DisplayScreenApplicantView();
        }

        return DisplayScreenApplicantObj;

    }*/

}

package adaptech;

import adaptech.MenuBarAdminView;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class DisplayScreenAdminView extends JFrame {

    JPanel centerDisplayPanel,northDisplayPanel,eastDisplayPanel,westDisplayPanel;
    Container displayScreenApplicantContainer;
    MenuBarAdminView menuBarAdminView;

    DisplayScreenAdminView() {

        menuBarAdminView=MenuBarAdminView.getInstanceOfMenuBarAdminView();

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
        northDisplayPanel.add(menuBarAdminView.menuContainer);
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

    /*public static DisplayScreenAdminView getInstanceOfDisplayScreenAdminView() {

        if(DisplayScreenApplicantObj==null){
            DisplayScreenApplicantObj=new DisplayScreenAdminView();
        }

        return DisplayScreenApplicantObj;

    }*/

}

package adaptech;

import adaptech.MenuBarView;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class DisplayScreenView extends JFrame {

    JPanel centerDisplayPanel,northDisplayPanel,eastDisplayPanel,westDisplayPanel;
    Container displayScreenContainer;
    MenuBarView menuBarView;

    DisplayScreenView() {

        menuBarView=MenuBarView.getInstanceOfMenuBarView();
    
        Color lightGrey = new Color(218, 218, 230);
        Color darkBlue = new Color(59, 95, 125);

        displayScreenContainer = getContentPane();
        displayScreenContainer.setLayout(new BorderLayout());
        displayScreenContainer.setBounds(235, 104, 180, 27);

        centerDisplayPanel = new JPanel();
        centerDisplayPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        centerDisplayPanel.setLayout(new BoxLayout(centerDisplayPanel,BoxLayout.Y_AXIS));
        centerDisplayPanel.setSize(new Dimension(30,40));
        centerDisplayPanel.setBackground(darkBlue);

        northDisplayPanel = new JPanel();
        northDisplayPanel.add(menuBarView.menuContainer);
        northDisplayPanel.setBackground(darkBlue);

        eastDisplayPanel = new JPanel();
        eastDisplayPanel.setBackground(darkBlue);

        westDisplayPanel = new JPanel();
        westDisplayPanel.setBackground(darkBlue);

        displayScreenContainer.add(northDisplayPanel,BorderLayout.NORTH);
        displayScreenContainer.add(eastDisplayPanel,BorderLayout.EAST);
        displayScreenContainer.add(westDisplayPanel,BorderLayout.WEST);

        //setSize(1500,1500);
        setVisible(true);
        //setResizable(false);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /*public static DisplayScreenView getInstanceOfDisplayScreenView() {

        if(DisplayScreenObj==null){
            DisplayScreenObj=new DisplayScreenView();
        }

        return DisplayScreenObj;

    }*/

    public static void main(String... args) {

      DisplayScreenView displayScreenView=new DisplayScreenView();


    }

}

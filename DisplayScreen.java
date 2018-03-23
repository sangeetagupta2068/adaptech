package adaptech;

import javax.swing.*;
import java.awt.*;

public class DisplayScreen extends JFrame {

    Container displayContainer;
    JPanel logoPanel,menuPanel,northPanel,eastPanel,westPanel, southPanel;
    JLabel nameLabel,taglineLabel,logoLabel;
    JMenuBar menuBar;
    JMenuItem menuHome,menuLogin,menuRegister,menuContact;

    static DisplayScreen displayScreen;

    protected DisplayScreen(){

            Color lightGrey = new Color(218, 218, 230);
            Color darkBlue = new Color(59, 95, 125);

            displayContainer = getContentPane();
            displayContainer.setLayout(new BorderLayout());

            menuPanel=new JPanel();
            menuPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
            menuPanel.setBackground(lightGrey);

            logoPanel = new JPanel();
            logoPanel.setBackground(lightGrey);
            northPanel = new JPanel();
            westPanel = new JPanel();
            eastPanel= new JPanel();
            southPanel = new JPanel();

            northPanel.setBackground(darkBlue);
            eastPanel.setBackground(darkBlue);
            westPanel.setBackground(darkBlue);
            southPanel.setBackground(darkBlue);

            nameLabel= new JLabel("AdapTech");
            nameLabel.setFont(new Font("Lucida Blackletter", Font.BOLD, 30));

            taglineLabel=new JLabel("Create Magic With Logic");
            taglineLabel.setFont(new Font("Linux Biolinum Keyboard O", Font.PLAIN, 24));

            logoLabel = new JLabel(new ImageIcon("/home/sangeetagupta1998/Desktop/Java Project/javaform/javaLogo.png"));
            logoPanel.add(logoLabel);
            logoPanel.add(nameLabel);
            logoPanel.add(taglineLabel);

            menuBar = new JMenuBar();;
            menuHome = new JMenuItem("HOME");
            menuHome.setBackground(lightGrey);
            menuLogin = new JMenuItem("LOGIN");
            menuLogin.setBackground(lightGrey);
            menuRegister = new JMenuItem("REGISTER");
            menuRegister.setBackground(lightGrey);
            menuContact = new JMenuItem("CONTACT");
            menuContact.setBackground(lightGrey);


            menuBar.add(menuHome);
            menuBar.add(menuLogin);
            menuBar.add(menuRegister);
            menuBar.add(menuContact);
            menuBar.setBackground(lightGrey);
            setJMenuBar(menuBar);

            menuPanel.setBackground(Color.BLACK);
            menuPanel.add(logoPanel);
            menuPanel.add(menuBar);

            displayContainer.add(menuPanel, BorderLayout.CENTER);
            displayContainer.add(northPanel,BorderLayout.NORTH);
            displayContainer.add(westPanel,BorderLayout.WEST);
            displayContainer.add(eastPanel,BorderLayout.EAST);
            displayContainer.add(southPanel,BorderLayout.SOUTH);

    }

    public static void main(String... args) {

            DisplayScreen displayScreen = new DisplayScreen();
            displayScreen.setVisible(true);
            displayScreen.setSize(1500,1500);
            displayScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

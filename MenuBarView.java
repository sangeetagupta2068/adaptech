package adaptech;

import adaptech.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    public class MenuBarView extends JFrame implements ActionListener {

        Container menuContainer;
        JPanel logoPanel,menuPanel,centerPanel,northPanel,eastPanel,westPanel, southPanel;
        JLabel nameLabel,taglineLabel,logoLabel;
        JMenuBar menuBar;
        JMenuItem menuHome,menuLogin,menuRegister,menuContact;
        DisplayScreenView displayScreenView;

        static MenuBarView menuBarView;

        private MenuBarView(){

            Color lightGrey = new Color(218, 218, 230);
            Color darkBlue = new Color(59, 95, 125);

            menuContainer = getContentPane();
            menuContainer.setLayout(new BorderLayout());

            menuPanel=new JPanel();
            menuPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
            menuPanel.setBackground(lightGrey);

            logoPanel = new JPanel();
            northPanel = new JPanel();
            westPanel = new JPanel();
            eastPanel= new JPanel();
            southPanel = new JPanel();

            logoPanel.setBackground(lightGrey);
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

            menuBar = new JMenuBar();
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

            menuContainer.add(menuPanel, BorderLayout.CENTER);
            menuContainer.add(northPanel,BorderLayout.NORTH);
            menuContainer.add(westPanel,BorderLayout.WEST);
            menuContainer.add(eastPanel,BorderLayout.EAST);
            menuContainer.add(southPanel,BorderLayout.SOUTH);

            menuHome.addActionListener(this);
    				menuLogin.addActionListener(this);
    				menuRegister.addActionListener(this);
    				menuContact.addActionListener(this);

        }

        public static MenuBarView getInstanceOfMenuBarView(){

            if( menuBarView == null ) {

                menuBarView = new MenuBarView();

            }

            return menuBarView;

        }

        public void actionPerformed(ActionEvent actionEvent){

            if(actionEvent.getActionCommand()=="REGISTER"){

                  displayRegistrationForm();

            }

            else if(actionEvent.getActionCommand()=="HOME"){

                  displayHomeScreen();

            }

            else if(actionEvent.getActionCommand()=="CONTACT"){

                  displayContactUsScreen();

            }

            else if(actionEvent.getActionCommand()=="LOGIN") {

                  displayLoginScreen();
            }


        }

        public void displayRegistrationForm(){

        //this.dispose();
            displayScreenView=new RegisterScreenView();

        }

        public void displayHomeScreen() {

        //this.dispose();
            displayScreenView= new HomeScreenView();

        }

        public void displayContactUsScreen(){

        //this.dispose();
             displayScreenView= new ContactUsScreenView();

        }

        public void displayLoginScreen(){

            displayScreenView= new LoginScreenView();

        }

   }

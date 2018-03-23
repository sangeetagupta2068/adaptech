package adaptech;

import adaptech.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    public class MenuBarAdminView extends JFrame implements ActionListener {

        Container menuContainer;
        JPanel logoPanel,menuPanel,centerPanel,northPanel,eastPanel,westPanel, southPanel;
        JLabel nameLabel,taglineLabel,logoLabel;
        JMenuBar menuBar;
        JMenuItem menuProfile,menuResult,menuLogout,menuSuggestion;
        static MenuBarAdminView menuBarAdminView;
        DisplayScreenAdminView displayScreenAdminView;

        private MenuBarAdminView(){

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
            menuResult = new JMenuItem("Result");
            menuResult.setBackground(lightGrey);
            menuProfile = new JMenuItem("Password");
            menuProfile.setBackground(lightGrey);
            menuLogout = new JMenuItem("Logout");
            menuLogout.setBackground(lightGrey);
            menuSuggestion = new JMenuItem("Suggestions");
            menuSuggestion.setBackground(lightGrey);

            menuBar.add(menuResult);
            menuBar.add(menuProfile);
            menuBar.add(menuLogout);
            menuBar.setBackground(lightGrey);
            menuBar.add(menuSuggestion);
            setJMenuBar(menuBar);

            menuPanel.setBackground(Color.BLACK);
            menuPanel.add(logoPanel);
            menuPanel.add(menuBar);

            menuContainer.add(menuPanel, BorderLayout.CENTER);
            menuContainer.add(northPanel,BorderLayout.NORTH);
            menuContainer.add(westPanel,BorderLayout.WEST);
            menuContainer.add(eastPanel,BorderLayout.EAST);
            menuContainer.add(southPanel,BorderLayout.SOUTH);

            setVisible(true);
            setSize(1500,1500);

            menuResult.addActionListener(this);
    				menuProfile.addActionListener(this);
    				menuResult.addActionListener(this);
    				menuLogout.addActionListener(this);
            menuSuggestion.addActionListener(this);

        }

        public static MenuBarAdminView getInstanceOfMenuBarAdminView(){

            if( menuBarAdminView == null ) {

                menuBarAdminView = new MenuBarAdminView();

            }

            return menuBarAdminView;

        }

        public void actionPerformed(ActionEvent actionEvent){


            if(actionEvent.getActionCommand()=="Result"){

                  displayResultScreen();

            }

            else if(actionEvent.getActionCommand()=="Logout"){

                  displayLogoutUsScreen();

            }

            else if(actionEvent.getActionCommand()=="Suggestions"){

                  displaySuggestionScreen();

            }

            else if(actionEvent.getActionCommand()=="Password") {

                  changePasswordScreen();
            }


        }

        public void displayResultScreen() {

        //this.dispose();
            //displayScreenView= new ResultScreenView();
            //ResultcreenView ResultcreenView = new ResultcreenView();
            displayScreenAdminView = new Result();


        }

        public void displayLogoutUsScreen(){

        //this.dispose();
             JOptionPane.showMessageDialog(this,"You are logged out!");
             this.dispose();
             HomeScreenView homeScreenView=new HomeScreenView();

             //displayScreenView= new LogoutUsScreenView();

        }

        public void changePasswordScreen(){

            //displayScreenView= new ProfileScreenView();
            displayScreenAdminView = new ChangePasswordAdminView();

        }

        public void displaySuggestionScreen(){

            //displayScreenView= new ProfileScreenView();
            displayScreenAdminView = new Suggestion();

        }

   }

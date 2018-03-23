package adaptech;

import adaptech.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    public class MenuBarApplicantView extends JFrame implements ActionListener {

        Container menuContainer;
        JPanel logoPanel,menuPanel,centerPanel,northPanel,eastPanel,westPanel, southPanel;
        JLabel nameLabel,taglineLabel,logoLabel;
        JMenuBar menuBar;
        JMenuItem menuGuidelines,menuProfile,menuResult,menuLogout,menuTest;
        static MenuBarApplicantView menuBarApplicantView;
        DisplayScreenApplicantView displayScreenView;

        static MenuBarApplicantView menuBarView;

        private MenuBarApplicantView(){

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
            menuGuidelines = new JMenuItem("Guidelines");
            menuGuidelines.setBackground(lightGrey);
            menuProfile = new JMenuItem("Password");
            menuProfile.setBackground(lightGrey);
            menuResult = new JMenuItem("Result");
            menuResult.setBackground(lightGrey);
            menuLogout = new JMenuItem("Logout");
            menuLogout.setBackground(lightGrey);
            menuTest = new JMenuItem("Test");
            menuTest.setBackground(lightGrey);

            menuBar.add(menuGuidelines);
            menuBar.add(menuProfile);
            menuBar.add(menuResult);
            menuBar.add(menuLogout);
            menuBar.setBackground(lightGrey);
            menuBar.add(menuTest);
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

            menuGuidelines.addActionListener(this);
    				menuProfile.addActionListener(this);
    				menuResult.addActionListener(this);
    				menuLogout.addActionListener(this);
            menuTest.addActionListener(this);

        }

        public static MenuBarApplicantView getInstanceOfMenuBarApplicantView(){

            if( menuBarApplicantView == null ) {

                menuBarApplicantView = new MenuBarApplicantView();

            }

            return menuBarApplicantView;

        }

        public void actionPerformed(ActionEvent actionEvent){

            if(actionEvent.getActionCommand()=="Result"){

                  displayResult();

            }

            else if(actionEvent.getActionCommand()=="Guidelines"){

                  displayGuidelinesScreen();

            }

            else if(actionEvent.getActionCommand()=="Logout"){

                  displayLogoutUsScreen();

            }

            else if(actionEvent.getActionCommand()=="Password") {

                  displayChangePasswordScreen();
            }
            else if(actionEvent.getActionCommand()=="Test") {

                  giveTest();
            }


        }

        public void displayResult(){

        //this.dispose();
            //displayScreenView=new ResultScreenView();
            JOptionPane.showMessageDialog(this, "We will communicate to the selected applicants over email!");

        }

        public void displayGuidelinesScreen() {

        //this.dispose();
            displayScreenView= new GuideLineScreenView();


        }

        public void displayLogoutUsScreen(){

        //this.dispose();
             JOptionPane.showMessageDialog(this,"You are logged out!");
             this.dispose();
             HomeScreenView homeScreenView= new HomeScreenView();

        }

        public void displayChangePasswordScreen(){

            //displayScreenView= new ProfileScreenView();
            displayScreenView = new ChangePasswordApplicantView();


        }

        public void giveTest(){

              displayScreenView = new IntermediateScreenView();
        }

   }

package adaptech;

import adaptech.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TestScreen extends JFrame implements ActionListener {

        String userName;
        JRadioButton op1_1,op1_2,op1_3,op1_4;
        JRadioButton op2_1,op2_2,op2_3,op2_4;
        JRadioButton op3_1,op3_2,op3_3,op3_4;
        JRadioButton op4_1,op4_2,op4_3,op4_4;
        JRadioButton op5_1,op5_2,op5_3,op5_4;
        JRadioButton op6_1,op6_2,op6_3,op6_4;
        JRadioButton op7_1,op7_2,op7_3,op7_4;
        JRadioButton op8_1,op8_2,op8_3,op8_4;
        JRadioButton op9_1,op9_2,op9_3,op9_4;
        JRadioButton op10_1,op10_2,op10_3,op10_4;
        JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
        JLabel quesL1,quesL2,quesL3,quesL4,quesL5,quesL6,quesL7,quesL8,quesL9,quesL10;
        ButtonGroup ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10;
        JButton submit;
        String opt = "";

        TestScreen() {

            Container container=getContentPane();
            container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));
            //container.setLayout(new BorderLayout());

            p1=new JPanel();
            //p1.setLayout(new BoxLayout(p1,BoxLayout.X_AXIS));
            quesL1 = new JLabel("Binary code “0” means : ");
            op1_1 = new JRadioButton("State of absence");
            op1_2 = new JRadioButton("State of presence");
            op1_3 = new JRadioButton("State of Negative");
            op1_4 = new JRadioButton("State of Positive");
            ans1 = new ButtonGroup();
            ans1.add(op1_1);
            ans1.add(op1_2);
            ans1.add(op1_3);
            ans1.add(op1_4);
            container.add(quesL1);
            p1.add(op1_1);
            p1.add(op1_2);
            p1.add(op1_3);
            p1.add(op1_4);
            container.add(p1);


            p2=new JPanel();
            quesL2 = new JLabel("CAI stands for : ");
            op2_1 = new JRadioButton("Computer Aided Instruction");
            op2_2 = new JRadioButton("Computer Aided information");
            op2_3 = new JRadioButton("Cost Added Information");
            op2_4 = new JRadioButton("Computer Aided Infrastructure");
            ans2 = new ButtonGroup();
            ans2.add(op2_1);
            ans2.add(op2_2);
            ans2.add(op2_3);
            ans2.add(op2_4);
            container.add(quesL2);
            p2.add(op2_1);
            p2.add(op2_2);
            p2.add(op2_3);
            p2.add(op2_4);
            container.add(p2);

            p3=new JPanel();
            quesL3 = new JLabel("MICR reader is an ______ device.");
            op3_1 = new JRadioButton("Input");
            op3_2 = new JRadioButton("Output");
            op3_3 = new JRadioButton("Electric");
            op3_4 = new JRadioButton("Storage");
            ans3 = new ButtonGroup();
            ans3.add(op3_1);
            ans3.add(op3_2);
            ans3.add(op3_3);
            ans3.add(op3_4);
            container.add(quesL3);
            p3.add(op3_1);
            p3.add(op3_2);
            p3.add(op3_3);
            p3.add(op3_4);
            container.add(p3);

            p4=new JPanel();
            quesL4 = new JLabel("Internet is ______");
            op4_1 = new JRadioButton("Network of Networks");
            op4_2 = new JRadioButton("Networks of Communication");
            op4_3 = new JRadioButton("Networks of Data");
            op4_4 = new JRadioButton("Group of LAN");
            ans4 = new ButtonGroup();
            ans4.add(op4_1);
            ans4.add(op4_2);
            ans4.add(op4_3);
            ans4.add(op4_4);
            container.add(quesL4);
            p4.add(op4_1);
            p4.add(op4_2);
            p4.add(op4_3);
            p4.add(op4_4);
            container.add(p4);

            p5=new JPanel();
            quesL5 = new JLabel(" ________ are the transformations in the diagram, which are responsible for central processing functions.");
            op5_1 = new JRadioButton("Input transformations");
            op5_2 = new JRadioButton("Output transformations");
            op5_3 = new JRadioButton("System-processing transformations");
            op5_4 = new JRadioButton("Storage transformations");
            ans5 = new ButtonGroup();
            ans5.add(op5_1);
            ans5.add(op5_2);
            ans5.add(op5_3);
            ans5.add(op5_4);
            container.add(quesL5);
            p5.add(op5_1);
            p5.add(op5_2);
            p5.add(op5_3);
            p5.add(op5_4);
            container.add(p5);


            p6=new JPanel();
            quesL6 = new JLabel(" ________ is the methodology used in agile software development model.");
            op6_1 = new JRadioButton("Incremental development of working software");
            op6_2 = new JRadioButton("Internet communication and distribution");
            op6_3 = new JRadioButton("Rapid linear sequence development and reuse");
            op6_4 = new JRadioButton("Aspect-oriented software architecture");
            ans6 = new ButtonGroup();
            ans6.add(op6_1);
            ans6.add(op6_2);
            ans6.add(op6_3);
            ans6.add(op6_4);
            container.add(quesL6);
            p6.add(op6_1);
            p6.add(op6_2);
            p6.add(op6_3);
            p6.add(op6_4);
            container.add(p6);

            p7=new JPanel();
            quesL7 = new JLabel(" _______ tends to be susceptible to performance problems that are not recognized until field tests, when they are finally ..");
            op7_1 = new JRadioButton("Ad hoc workflows");
            op7_2 = new JRadioButton("Collaborative workflows");
            op7_3 = new JRadioButton("Administrative workflows");
            op7_4 = new JRadioButton("Production workflows");
            ans7 = new ButtonGroup();
            ans7.add(op7_1);
            ans7.add(op7_2);
            ans7.add(op7_3);
            ans7.add(op7_4);
            container.add(quesL7);
            p7.add(op7_1);
            p7.add(op7_2);
            p7.add(op7_3);
            p7.add(op7_4);
            container.add(p7);

            p8=new JPanel();
            quesL8 = new JLabel(" _______ typically handle low business value activities such as scheduling an interview.");
            op8_1 = new JRadioButton("Workflow system development");
            op8_2 = new JRadioButton(" Evolutionary development");
            op8_3 = new JRadioButton("Rapid linear sequence development");
            op8_4 = new JRadioButton(" Aspect-oriented development");
            ans8 = new ButtonGroup();
            ans8.add(op8_1);
            ans8.add(op8_2);
            ans8.add(op8_3);
            ans8.add(op8_4);
            container.add(quesL8);
            p8.add(op8_1);
            p8.add(op8_2);
            p8.add(op8_3);
            p8.add(op8_4);
            container.add(p8);

            p9=new JPanel();
            quesL9 = new JLabel(" _______ diagrams are used to illustrate the interactions between objects visually.");
            op9_1 = new JRadioButton("UML collaboration");
            op9_2 = new JRadioButton("UML sequence");
            op9_3 = new JRadioButton("System sequence");
            op9_4 = new JRadioButton("UML activity");
            ans9 = new ButtonGroup();
            ans9.add(op9_1);
            ans9.add(op9_2);
            ans9.add(op9_3);
            ans9.add(op9_4);
            container.add(quesL9);
            p9.add(op9_1);
            p9.add(op9_2);
            p9.add(op9_3);
            p9.add(op9_4);
            container.add(p9);

            p10=new JPanel();
            quesL10 = new JLabel(" _______ refers to translation of the current model to the target data model");
            op10_1 = new JRadioButton(" Reverse engineering");
            op10_2 = new JRadioButton(" Forward engineering ");
            op10_4 = new JRadioButton(" Data engineering");
            op10_3 = new JRadioButton(" Re-documentation");
            ans10 = new ButtonGroup();
            ans10.add(op10_1);
            ans10.add(op10_2);
            ans10.add(op10_3);
            ans10.add(op10_4);
            container.add(quesL10);
            p10.add(op10_1);
            p10.add(op10_2);
            p10.add(op10_3);
            p10.add(op10_4);
            container.add(p10);


            submit=new JButton("SUBMIT TEST");
            container.add(submit);
            submit.addActionListener(this);

            setTitle("Test Screen");
            setSize(1500,1500);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      }

      public void actionPerformed(ActionEvent ae){

            int marks=0;
    //String option = "";
            String ansArr[]= new String[10];

            if(op1_1.isSelected())
                  marks++;
            if(op2_2.isSelected())
                  marks++;
            if(op3_1.isSelected())
                  marks++;
            if(op4_1.isSelected())
                  marks++;
            if(op5_3.isSelected())
                  marks++;
            if(op6_1.isSelected())
                  marks++;
            if(op7_3.isSelected())
                  marks++;
            if(op8_2.isSelected())
                  marks++;
            if(op9_2.isSelected())
                  marks++;
            if(op10_4.isSelected())
                  marks++;

            DatabaseConnectivity databaseConnectivity = new DatabaseConnectivity();

            try{

                databaseConnectivity.insertApplicantMarks(marks,userName);
                JOptionPane.showMessageDialog(this,"Your score ^.^ : "  + marks);

            }

            catch(Exception exception){

              System.out.println(exception);

            }

        }

}

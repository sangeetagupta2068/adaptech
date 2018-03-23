package adaptech;

import adaptech.DisplayScreenApplicantView;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

class GuideLineScreenView extends DisplayScreenApplicantView {

	String titleForGuideLine,descriptionForGuideLine;
	JPanel guideLineTitlePanel,guideLineDescriptionPanel;
	JLabel guideLineDescription,guideLineTitle;

	GuideLineScreenView() {

			Color lightGrey = new Color(218, 218, 230);
			Color darkBlue = new Color(59, 95, 125);

			titleForGuideLine="Adaptech - Create magic with Logic\n";

			descriptionForGuideLine="<html><p><br>Greetings! We are glad you chose AdapTech."
			 +"<br>You are just two steps away from joining us."
			 + "<br>Please note the given below guidelinesfor the Adaptech Aptitude Test :"
			 + "<br><br>1.An applicant can attempt only once in every six months for this test"+
			 "<br>2.Once qualified, an applicant needs to mail his/her resume within 15 days of taking the test"+
			 "<br>3.Mobile phones should be switched off during the test." +
			 "<br>4.Any mallicious act caught during the test will be punished."+
			 "<br>Anyway, all the very best ! Looking forward to see you in our organization !:)</p></html>";

			guideLineDescriptionPanel = new JPanel();
			guideLineDescriptionPanel.setPreferredSize(new Dimension(20, 30));
			guideLineDescriptionPanel.setBackground(lightGrey);

			guideLineTitlePanel = new JPanel();
			//contactTitlePanel.setPreferredSize(new Dimension(20, 30));
			//contactTitlePanel.setBackground(lightGrey);


			guideLineTitle=new JLabel(titleForGuideLine);
			guideLineTitle.setFont(new Font("Lucida Blackletter", Font.BOLD, 30));
			guideLineTitlePanel.add(guideLineTitle);

			guideLineDescription=new JLabel(descriptionForGuideLine);
			guideLineDescription.setFont(new Font("Lucida Blackletter", Font.ITALIC, 15));
			guideLineDescriptionPanel.add(guideLineDescription);

			centerDisplayPanel.add(guideLineTitlePanel);
			centerDisplayPanel.add(guideLineDescriptionPanel);

      displayScreenApplicantContainer.add(centerDisplayPanel,BorderLayout.CENTER);

      setVisible(true);
      setTitle("GUIDELINES SCREEN");
      setSize(1500,1500);
      //setResizable(false);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

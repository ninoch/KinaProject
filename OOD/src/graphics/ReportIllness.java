package graphics;

import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class ReportIllness extends Report {

	public ReportIllness() {

	}

	@Override
	protected void make_reports() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		rnum = 20;
		reports = new JRadioButton[rnum];
		
		// TODO making message title
		for(int i = 0; i < rnum; i++)
		{
			reports[i] = new JRadioButton("1394/01/" + (i  + 1) + " _ title here");
			this.add(new Illness(), "#" + i);
		}
		
	}

}

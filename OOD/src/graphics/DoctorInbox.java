package graphics;

import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class DoctorInbox extends Inbox {

	public DoctorInbox() {

	}

	@Override
	protected void make_messages() {
		mnum = 20;
		messages = new JRadioButton[mnum];
		
		read = new boolean[mnum];
		// TODO making read array
		for(int i = 0; i < mnum; i++)
			read[i] = (i < 5);
		// TODO making message title
		for(int i = 0; i < mnum; i++)
		{
			messages[i] = new JRadioButton("message from patient # " + ( i  + 1));
			this.add(new DoctorMessage(), "#" + i);
		}
	}

}

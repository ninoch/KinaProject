package graphics;

import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class AdminAllPatients extends Users {

	public AdminAllPatients() {

	}
	
	@Override
	protected void make_users() {
		uNum = 10;
		users = new JRadioButton[uNum];
		for(int i = 0; i < uNum; i++)
		{
	    	users[i] = new JRadioButton("Patient #" + ( i + 1));
			this.add(new PatientProfile(), "#" + i);
		}
	}

}

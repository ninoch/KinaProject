package graphics;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class PatientAddActivity extends JPanel {
	private JTextField date;

	public PatientAddActivity() {
		this.setLayout(null);
		this.setSize(new Dimension(480, 400));
		
		JLabel label = new JLabel("\u0627\u0646\u062A\u062E\u0627\u0628 \u0641\u0627\u06CC\u0644:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(383, 78, 87, 14);
		add(label);
		
		JLabel label_1 = new JLabel("\u062A\u0627\u0631\u06CC\u062E \u0627\u0645\u0631\u0648\u0632:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(408, 126, 62, 14);
		add(label_1);
		
		date = new JTextField();
		date.setBounds(183, 123, 216, 20);
		add(date);
		date.setColumns(10);

		JLabel address = new JLabel();
		address.setBounds(10, 102, 389, 14);
		address.setVisible(false);
		add(address);
		
		JButton browse = new JButton("\u0627\u0646\u062A\u062E\u0627\u0628");
		browse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				address.setText("C:\\fileaddress");
				address.setVisible(true);
			}
		});
		browse.setBounds(183, 74, 216, 23);
		add(browse);
		
		JLabel label_2 = new JLabel("\u0641\u0631\u0645\u062A \u0642\u0627\u0628\u0644 \u0642\u0628\u0648\u0644: 1394/1/13");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(183, 154, 216, 14);
		add(label_2);
		

		JLabel warning = new JLabel();
		warning.setForeground(Color.RED);
		warning.setBounds(109, 370, 290, 14);
		warning.setVisible(false);
		add(warning);
		
		JButton add = new JButton("\u062B\u0628\u062A");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				warning.setVisible(false);
				if(date.getText().equals("warning"))
				{
					warning.setText("\u062E\u0637\u0627!");
					warning.setVisible(true);
				}
				else
				{
					// TODO
				}
			}
		});
		add.setBounds(10, 366, 89, 23);
		add(add);
		
	}

}

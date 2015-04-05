package graphics;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class DoctorToPatient extends JPanel {
	
	public DoctorToPatient() {
		this.setLayout(null);
		this.setSize(new Dimension(480, 400));
		
		JLabel label = new JLabel("\u0639\u0646\u0648\u0627\u0646 \u067E\u06CC\u0627\u0645:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(390, 39, 80, 14);
		add(label);
		
		JLabel label_1 = new JLabel("\u0645\u062A\u0646 \u067E\u06CC\u0627\u0645:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(390, 77, 80, 14);
		add(label_1);
		
		JTextArea message = new JTextArea();
		message.setBounds(10, 102, 460, 215);
		add(message);
		
		JButton back = new JButton("\u0628\u0627\u0632\u06AF\u0634\u062A");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		back.setBounds(10, 366, 89, 23);
		add(back);
		
		JButton send = new JButton("\u0627\u0631\u0633\u0627\u0644");
		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// int ind = to.getSelectedIndex();
				// System.err.println(to.getSelectedItem() + " is selected");
				// TODO
			}
		});
		send.setBounds(10, 328, 89, 23);
		add(send);
		
		JLabel title = new JLabel("\u0639\u0646\u0648\u0627\u0646 \u067E\u06CC\u0627\u0645 \u0627\u06CC\u0646\u062C\u0627!");
		title.setHorizontalAlignment(SwingConstants.RIGHT);
		title.setBounds(135, 39, 267, 14);
		add(title);
	}
}

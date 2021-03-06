package graphics;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Illness extends JPanel {
	private JTextField pId;
	private JTextField date;
	private JTextField illnessName;

	public Illness() {
		this.setSize(new Dimension(480, 400));
		this.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u0628\u06CC\u0645\u0647 \u0628\u06CC\u0645\u0627\u0631:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(278, 11, 192, 14);
		add(lblNewLabel);
		
		pId = new JTextField();
		pId.setBounds(288, 36, 182, 20);
		add(pId);
		pId.setColumns(10);
		
		JLabel label = new JLabel("\u062A\u0627\u0631\u06CC\u062E \u062B\u0628\u062A:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(86, 11, 192, 14);
		add(label);
		
		date = new JTextField();
		date.setColumns(10);
		date.setBounds(96, 36, 182, 20);
		add(date);
		
		JLabel label_1 = new JLabel("\u0646\u0627\u0645 \u0628\u06CC\u0645\u0627\u0631\u06CC:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(278, 67, 192, 14);
		add(label_1);
		
		illnessName = new JTextField();
		illnessName.setColumns(10);
		illnessName.setBounds(288, 92, 182, 20);
		add(illnessName);
		
		JTextArea description = new JTextArea();
		description.setBounds(10, 148, 460, 189);
		add(description);
		
		JLabel label_2 = new JLabel("\u062A\u0648\u0636\u06CC\u062D\u0627\u062A:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(278, 123, 192, 14);
		add(label_2);
		
		JButton add = new JButton("\u062B\u0628\u062A");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		add.setBounds(10, 366, 89, 23);
		add(add);

	}
}

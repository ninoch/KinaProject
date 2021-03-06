package graphics;

import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class DoctorsPatientSearch extends JPanel {
	private JTextField name;
	private JTextField familyName;
	private JTextField pId;

	public DoctorsPatientSearch() {
		this.setLayout(new CardLayout());
		this.setSize(new Dimension(480, 400));

		CardLayout cl = (CardLayout)(this.getLayout());
		cl.show(this, "search");
		
		JPanel search = new JPanel();
		search.setLayout(null);
		search.setSize(new Dimension(480, 400));
		
		this.add(search, "search");
		this.add(new DoctorsSearchResault(3), "result");
		
		JLabel label = new JLabel("\u0646\u0627\u0645 \u0628\u06CC\u0645\u0627\u0631:");
		label.setBounds(424, 35, 46, 14);
		search.add(label);
		
		name = new JTextField();
		name.setBounds(221, 60, 249, 20);
		search.add(name);
		name.setColumns(10);
		
		JLabel label_1 = new JLabel("\u0646\u0627\u0645 \u062E\u0627\u0646\u0648\u0627\u062F\u06AF\u06CC \u0628\u06CC\u0645\u0627\u0631:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(333, 91, 137, 14);
		search.add(label_1);
		
		familyName = new JTextField();
		familyName.setColumns(10);
		familyName.setBounds(221, 116, 249, 20);
		search.add(familyName);
		
		JLabel label_2 = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u0628\u06CC\u0645\u0647:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(352, 147, 118, 14);
		search.add(label_2);
		
		pId = new JTextField();
		pId.setColumns(10);
		pId.setBounds(221, 172, 249, 20);
		search.add(pId);
		
		JButton searchb = new JButton("\u062C\u0633\u062A\u062C\u0648");
		searchb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(DoctorsPatientSearch.this, "result");
			}
		});
		searchb.setBounds(120, 260, 89, 23);
		search.add(searchb);
	}

}

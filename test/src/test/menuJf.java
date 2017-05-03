package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menuJf extends JFrame {

	private JPanel contentPane;
	private JTextField  textField1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuJf frame = new menuJf();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public menuJf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5DE5\u8D44\u7BA1\u7406\u7CFB\u7EDF");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(257, 10, 188, 32);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 41, 690, 56);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("\u7528\u6237\u7BA1\u7406");
		button.setBounds(113, 9, 93, 37);
		panel.add(button);
		
		JButton btnNewButton = new JButton("\u7CFB\u7EDF\u7BA1\u7406");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 9, 93, 37);
		panel.add(btnNewButton);
		
		JButton button_1 = new JButton("\u5458\u5DE5\u4FE1\u606F\u7BA1\u7406");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(216, 9, 116, 37);
		panel.add(button_1);
		
		JButton button_2 = new JButton("\u57FA\u672C\u5DE5\u8D44\u7BA1\u7406");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(342, 9, 117, 37);
		panel.add(button_2);
		
		JButton button_3 = new JButton("\u5DE5\u8D44\u53D1\u653E");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(469, 9, 93, 37);
		panel.add(button_3);
		
		JButton button_4 = new JButton("\u5DE5\u8D44\u67E5\u8BE2");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setBounds(572, 9, 93, 37);
		panel.add(button_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 107, 87, 377);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("\u4FEE\u6539\u5BC6\u7801");
		btnNewButton_1.setBounds(0, 10, 87, 28);
		panel_1.add(btnNewButton_1);
		
		JButton button_5 = new JButton("\u7CFB\u7EDF\u8BF4\u660E");
		button_5.setBounds(0, 58, 87, 28);
		panel_1.add(button_5);
		
		JButton button_6 = new JButton("\u9000\u51FA\u7CFB\u7EDF");
		button_6.setBounds(0, 103, 87, 28);
		panel_1.add(button_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(138, 107, 534, 377);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(219, 61, 134, 29);
		panel_2.add(textField1);
		textField1.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(219, 137, 134, 29);
		panel_2.add(textField);
	}
}

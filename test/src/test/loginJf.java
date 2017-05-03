package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JComboBox;

public class loginJf extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton button;
	private JPasswordField passwordField;
	private JLabel label_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginJf frame = new loginJf();
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
	public loginJf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u7528\u6237\u540D");
		label.setBounds(68, 17, 54, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(174, 14, 134, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801");
		label_1.setBounds(68, 65, 42, 15);
		contentPane.add(label_1);
		
		JButton button2 = new JButton();
		button2.setText("\u767B\u5F55");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button2.setSize(100, 35);
		button2.setLocation(68, 154);
		contentPane.add(button2);
		
		button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setText("\u6CE8\u518C");
		button.setBounds(242, 154, 100, 35);
		contentPane.add(button);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(174, 62, 134, 29);
		contentPane.add(passwordField);
		
		String str1[] = {"管理员","普通用户"};
		JComboBox comboBox = new JComboBox(str1);
		comboBox.setEditable(true);
		comboBox.setToolTipText("");
		comboBox.setBounds(234, 101, 74, 21);
		contentPane.add(comboBox);
		
		label_2 = new JLabel("\u6743\u9650\uFF1A");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(174, 101, 54, 21);
		contentPane.add(label_2);
		
	}
}

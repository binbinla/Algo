package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.JList;

public class scrollPaneJf extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scrollPaneJf frame = new scrollPaneJf();
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
	public scrollPaneJf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 123, 150);
		scrollPane.setPreferredSize(new java.awt.Dimension(218, 164));
		contentPane.add(scrollPane);
		
        ListModel jList1Model =  new DefaultComboBoxModel(new String[] { "张三","李四","李四","李四","李四","李四","李四","李四","李四","李四","李四" });		
		JList list = new JList();
		list.setPreferredSize(new java.awt.Dimension(192, 173));
		list.setModel(jList1Model);
		scrollPane.setViewportView(list);
	}

}

package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class calculatorJf extends JFrame {

	private JPanel contentPane = contentPane = new JPanel(new GridLayout(4, 4, 3, 3));
	JTextArea textArea = new JTextArea();
	String str[] = {"7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"}; 
	/**
	 * @wbp.nonvisual location=157,387
	 */


	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatorJf frame = new calculatorJf();
					frame.setTitle("网格布局计算器");
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
	public calculatorJf() {
		setTitle("show");
		/*setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 409);*/
			
		getContentPane().setLayout(new BorderLayout());
		JButton btn[] = new JButton[str.length];
		for(int i = 0;i < str.length;i++){
			btn[i] = new JButton(str[i]);
			contentPane.add(btn[i]);
		}
		getContentPane().add(textArea, BorderLayout.NORTH);
		getContentPane().add(contentPane, BorderLayout.CENTER);
		setSize(386,329);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

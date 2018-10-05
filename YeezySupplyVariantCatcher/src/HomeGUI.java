import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import java.awt.Color;
import javax.swing.Box;

public class HomeGUI {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextArea textArea;
	private JTextField txtHttpsyeezysupplycom;
	String URL = "";
	String Size= null;
	private JLabel lblDoNotDistribute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeGUI window = new HomeGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws URISyntaxException 
	 * @throws IOException 
	 */
	public HomeGUI() throws IOException, URISyntaxException {
		initialize();

		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 51, 255));
		frame.setBackground(new Color(153, 51, 255));
		frame.setBounds(100, 100, 644, 615);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblChef = new JLabel("Chef");
		lblChef.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		lblChef.setBounds(6, 6, 92, 77);
		frame.getContentPane().add(lblChef);
		
		txtHttpsyeezysupplycom = new JTextField();
		txtHttpsyeezysupplycom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			URL = txtHttpsyeezysupplycom.getText();
	
			}
		});
		txtHttpsyeezysupplycom.setText("https://yeezysupply.com/");
		txtHttpsyeezysupplycom.setBounds(258, 13, 243, 26);
		frame.getContentPane().add(txtHttpsyeezysupplycom);
		txtHttpsyeezysupplycom.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Product URL");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(142, 6, 122, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSize.setBounds(142, 51, 122, 39);
		frame.getContentPane().add(lblSize);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Size = textField.getText();
			}
		});
		textField.setColumns(10);
		textField.setBounds(199, 57, 92, 26);
		frame.getContentPane().add(textField);
		
		lblNewLabel_1 = new JLabel("If no size is selected only links will be generated");
		lblNewLabel_1.setBounds(303, 63, 318, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnCook = new JButton("COOK");
		btnCook.setBackground(new Color(153, 51, 204));
		btnCook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Size = textField.getText();
				URL = txtHttpsyeezysupplycom.getText();
				HtmlAnalysis HA = new HtmlAnalysis(URL, Size, textArea);
				try {
					HA.createProducts();
				} catch (IOException | URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				
			}
		});
		btnCook.setBounds(16, 77, 117, 29);
		frame.getContentPane().add(btnCook);
		
		textArea = new JTextArea();
		textArea.setBackground(new Color(153, 51, 255));
		textArea.setAutoscrolls(false);
		textArea.setEditable(false);
		textArea.setBounds(152, 102, 486, 485);
		frame.getContentPane().add(textArea);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(413, 303, 15, 96);
		frame.getContentPane().add(scrollBar);
		
		lblDoNotDistribute = new JLabel("DO NOT DISTRIBUTE");
		lblDoNotDistribute.setBounds(6, 240, 146, 64);
		frame.getContentPane().add(lblDoNotDistribute);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(0, 0, 1, 1);
		frame.getContentPane().add(horizontalBox);
	}
}

package SarPayLawKaBookStore;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class loginForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserName;
	private JPasswordField txtpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginForm frame = new loginForm();
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
	public loginForm() {
		setResizable(false);
		setBackground(new Color(255, 250, 250));
		setForeground(Color.white);
		setTitle("LOGIN FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 401, 415);
		contentPane = new JPanel();
		contentPane.setBackground(Color.white);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextPane txtpncopyrightDeveloped = new JTextPane();
		txtpncopyrightDeveloped.setBackground(new Color(216, 191, 216));
		txtpncopyrightDeveloped.setForeground(new Color(0, 0, 0));
		txtpncopyrightDeveloped.setText("             ©CopyRight 2019 Developed By Nay Htet Kyaw");
		txtpncopyrightDeveloped.setBounds(0, 370, 401, 23);
		contentPane.add(txtpncopyrightDeveloped);

		txtUserName = new JTextField();
		txtUserName.setHorizontalAlignment(SwingConstants.CENTER);
		txtUserName.setBounds(93, 122, 214, 34);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);

		JTextPane txtpnUsername = new JTextPane();
		txtpnUsername.setForeground(new Color(65, 105, 225));
		txtpnUsername.setBackground(new Color(245, 255, 250));
		txtpnUsername.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnUsername.setText("UserName");
		txtpnUsername.setBounds(97, 106, 65, 16);
		contentPane.add(txtpnUsername);

		JLabel lblMadeInChina = new JLabel("Sar Pay Law Ka Book Store");
		lblMadeInChina.setForeground(new Color(255, 255, 255));
		lblMadeInChina.setFont(new Font("Cambria Math", Font.BOLD, 18));
		lblMadeInChina.setBounds(83, 35, 249, 46);
		contentPane.add(lblMadeInChina);

		txtpassword = new JPasswordField();
		txtpassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtpassword.setBounds(93, 182, 214, 34);
		contentPane.add(txtpassword);

		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = txtUserName.getText();
				String password = txtpassword.getText();

				if (username.equals("sarpaylawka") && password.equals("book")) {
					JOptionPane.showMessageDialog(null, "Login Successful");
					mainForm mf = new mainForm();
					mf.setVisible(true);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Login Failed");
				}
			}
		});
		btnLogin.setForeground(new Color(218, 112, 214));
		btnLogin.setBackground(new Color(240, 248, 255));
		btnLogin.setBounds(89, 236, 99, 23);
		contentPane.add(btnLogin); 

		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtUserName.setText(null);
				txtpassword.setText(null);
			}
		});
		btnCancel.setBackground(new Color(240, 248, 255));
		btnCancel.setForeground(new Color(218, 112, 214));
		btnCancel.setBounds(214, 236, 99, 23);
		contentPane.add(btnCancel);

		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setFont(new Font("SansSerif", Font.PLAIN, 13));
		txtpnPassword.setText("Password");
		txtpnPassword.setForeground(new Color(102, 0, 255));
		txtpnPassword.setBackground(new Color(245, 255, 250));
		txtpnPassword.setBounds(97, 167, 65, 16);
		contentPane.add(txtpnPassword);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setIcon(new ImageIcon("/Users/nayhtetkyaw/Downloads/vQvl2v2NKSXUMnSGGGcnshZt_400x400.png"));
		lblNewLabel.setBounds(0, 0, 401, 393);
		contentPane.add(lblNewLabel);
	}
}

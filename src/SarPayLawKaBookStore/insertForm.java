package SarPayLawKaBookStore;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Choice;
import java.awt.List;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import SarPayLawKaBookStore.insertForm;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;

public class insertForm extends JFrame {

	book bkArr[] = new book[100];
	int count = 0;

	protected static final List Price = null;
	private JPanel contentPane;
	private JTextField txtType;
	private JTextField txtTitle;
	private JTextField txtAuthor;
	private JTable table;
	private JTextField txtPriceSpinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					insertForm frame = new insertForm();
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
	public insertForm() {
		bkArr[0] = new book("Drama", "Angels and Demons", "Dan Brown", 8.99, 736, 30);
		count++;
		bkArr[1] = new book("Horror", "House of Leaves", "Mark.z Danielewski", 15.68, 705, 16);
		count++;
		bkArr[2] = new book("Drama", "Harry Potter and the Goblet of Fire", "J.K Rowling", 9.99, 734, 28);
		count++;
		bkArr[3] = new book("Romance", "Me Talk Pretty One Day", "Davic sedairs", 4.68, 272, 42);
		count++;
		bkArr[4] = new book("Short Story", "Star Girl", "Jerry Speinlli", 2.99, 186, 36);
		count++;
		bkArr[5] = new book("Historical", "Girl with a Peral Earring", "Tracy Chevalier", 4.24, 448, 42);
		count++;
		bkArr[6] = new book("Romance", "The Recuse", "Nicolas Sparks", 6.99, 352, 20);
		count++;
		bkArr[7] = new book("Historical", "Fever 1793", "Laurie Halse Andreson", 6.39, 252, 32);
		count++;
		bkArr[8] = new book("Romance", "The Duck and I", "Julia Quinn", 3.99, 384, 30);
		count++;
		bkArr[9] = new book("Historical", "Esperazen Rising", "Pam Munoz Ryan", 3.99, 304, 10);
		count++;
		bkArr[10] = new book("Short Story", "Destory Me", "Teherah Mafi", 2.68, 109, 24);
		count++;
		bkArr[11] = new book("Short Story", "Winter's Passage", "Julie Kagawa", 2.00, 59, 14);
		count++;
		bkArr[12] = new book("Horror", "Isle of Winds", "James Fahy", 1.78, 265, 29);
		count++;
		bkArr[13] = new book("Horror", "The Shinning", "Stephan King", 11.89, 659, 40);
		count++;
		bkArr[14] = new book("Romance", "Twilight", "Stephenie Meyer", 13.09, 501, 50);
		count++;
		bkArr[15] = new book("Romance", "Along for the Ride", "Sarah Dessen", 8.99, 383, 46);
		count++;
		bkArr[16] = new book("Short Story", "The Illustrated Man", "Ray BradBury", 11.49, 318, 89);
		count++;
		bkArr[17] = new book("Horror", "IT", "Stephen King ", 9.99, 1116, 78);
		count++;
		bkArr[18] = new book("Horror", "Dracula", "Bram Stoker", 8.89, 488, 44);
		count++;
		bkArr[19] = new book("Romance", "The Space Between Us", "Jessica Mertinez", 7.89, 400, 109);
		count++;
		bkArr[20] = new book("Romance", "The Best Of Me", "Nicolas Sparks", 7.96, 292, 189);
		count++;

		setResizable(false);
		setTitle("INSERT FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 869, 493);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblBookType = new JLabel("Book Type");
		lblBookType.setForeground(Color.WHITE);
		lblBookType.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBookType.setBounds(57, 71, 96, 14);
		contentPane.add(lblBookType);

		JLabel lblNewLabel_1 = new JLabel("INSERT FORM OF SAR PAY LAW KA BOOK STORE");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Albertus Extra Bold", Font.BOLD, 16));
		lblNewLabel_1.setBounds(57, 19, 410, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblMemberAddress = new JLabel("Book Title\n");
		lblMemberAddress.setForeground(new Color(255, 255, 255));
		lblMemberAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMemberAddress.setBounds(57, 113, 121, 14);
		contentPane.add(lblMemberAddress);

		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setForeground(Color.WHITE);
		lblAuthor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAuthor.setBounds(57, 158, 121, 14);
		contentPane.add(lblAuthor);

		JLabel lblPrice = new JLabel("Price");
		lblPrice.setForeground(Color.WHITE);
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrice.setBounds(57, 206, 96, 14);
		contentPane.add(lblPrice);

		JLabel lblTP = new JLabel("Total Pages");
		lblTP.setForeground(Color.WHITE);
		lblTP.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTP.setBounds(57, 252, 140, 14);
		contentPane.add(lblTP);

		JLabel lblQuan = new JLabel("Quantity");
		lblQuan.setForeground(Color.WHITE);
		lblQuan.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblQuan.setBounds(57, 304, 96, 14);
		contentPane.add(lblQuan);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setBounds(373, 70, 490, 375);
		contentPane.add(scrollPane);

		txtType = new JTextField();
		txtType.setHorizontalAlignment(SwingConstants.CENTER);
		txtType.setBounds(205, 70, 140, 20);
		contentPane.add(txtType);
		txtType.setColumns(10);

		txtTitle = new JTextField();
		txtTitle.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitle.setColumns(10);
		txtTitle.setBounds(205, 112, 140, 20);
		contentPane.add(txtTitle);

		txtAuthor = new JTextField();
		txtAuthor.setHorizontalAlignment(SwingConstants.CENTER);
		txtAuthor.setColumns(10);
		txtAuthor.setBounds(205, 157, 140, 20);
		contentPane.add(txtAuthor);

		JSpinner TPspinner = new JSpinner();
		TPspinner.setBounds(205, 247, 134, 26);
		contentPane.add(TPspinner);

		JSpinner QuanSpinner = new JSpinner();
		QuanSpinner.setBounds(205, 299, 134, 26);
		contentPane.add(QuanSpinner);

		ButtonGroup bg = new ButtonGroup();

		// insert button
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Type, Title, Author, Price = null, TotalPages = null, Quantity = null;

				Type = txtType.getText();
				Title = txtTitle.getText();
				Author = txtAuthor.getText();
				Price = txtPriceSpinner.getText();
				// String Price1=PriceSpinner.getValue().toString();
				String TotalPages1 = TPspinner.getValue().toString();
				String Quantity1 = QuanSpinner.getValue().toString();

//				JOptionPane.showMessageDialog(null, name+"\n"+address+"\n"+phone+"\n"+gender);

				JOptionPane.showMessageDialog(null, "Insert Successful");
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				String data[] = new String[] { Type, Title, Author, Price, TotalPages1, Quantity1 };
				model.addRow(data);

			}
		});
		btnInsert.setBackground(new Color(255, 255, 255));
		btnInsert.setForeground(new Color(0, 0, 0));
		btnInsert.setBounds(57, 422, 89, 23);
		contentPane.add(btnInsert);

		// Refresh Button
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtType.setText(null);
				txtTitle.setText(null);
				txtAuthor.setText(null);
				txtPriceSpinner.setText(null);
				TPspinner.setValue(0);
				QuanSpinner.setValue(0);
				// PriceSpinner.setValue(0.0);
				// TPspinner.setValue(0);
				// QuanSpinner.setValue(0);

			}
		});
		btnRefresh.setBackground(new Color(255, 255, 255));
		btnRefresh.setForeground(new Color(0, 0, 0));
		btnRefresh.setBounds(158, 422, 89, 23);
		contentPane.add(btnRefresh);

		JButton btnLogOut = new JButton("Back");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mainForm mf = new mainForm();
				mf.setVisible(true);
				dispose();
			}
		});
		btnLogOut.setBackground(new Color(255, 255, 255));
		btnLogOut.setForeground(new Color(0, 0, 0));
		btnLogOut.setBounds(259, 422, 89, 23);
		contentPane.add(btnLogOut);

		// Table of Array
		table = new JTable();
		table.setForeground(new Color(0, 0, 0));
		table.setBackground(new Color(255, 255, 255));
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Type", "Title", "Author", "Price", "TotalPages", "Quantity" }));

		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for (int i = 0; i < count; i++) {
			String data[] = new String[] { bkArr[i].getType(), bkArr[i].getTitle(), bkArr[i].getAuthor(),
					String.valueOf(bkArr[i].getPrice()), String.valueOf(bkArr[i].getTotalPages()),
					String.valueOf(bkArr[i].getQuantity()), };
			model.addRow(data);
		}
		scrollPane.setViewportView(table);

		txtPriceSpinner = new JTextField();
		txtPriceSpinner.setHorizontalAlignment(SwingConstants.CENTER);
		txtPriceSpinner.setColumns(10);
		txtPriceSpinner.setBounds(205, 201, 140, 20);
		contentPane.add(txtPriceSpinner);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(
				"/Users/nayhtetkyaw/Downloads/papers.co-my94-aurora-purple-night-sky-beautiful-6-wallpaper.jpg"));
		lblNewLabel.setBounds(0, 0, 869, 471);
		contentPane.add(lblNewLabel);
	}
}

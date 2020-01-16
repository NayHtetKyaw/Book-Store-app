package SarPayLawKaBookStore;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.Book;
import java.awt.event.ActionEvent;

public class mainForm extends JFrame {

	private JPanel contentPane;
	private JTable table;
	book bkArr[] = new book[100];
	int count = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainForm frame = new mainForm();
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
	public mainForm() {
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

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 866, 491);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(255, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 52, 860, 363);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setForeground(new Color(0, 0, 0));
		table.setBackground(new Color(255, 255, 255));
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "BookType", "BookTitle", "Author", "Price", "TotalPages", "Quantity" }));

//		System.out.println(count);
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for (int i = 0; i < count; i++) {
			String data[] = new String[] { bkArr[i].getType(), bkArr[i].getTitle(), bkArr[i].getAuthor(),
					String.valueOf(bkArr[i].getPrice()), String.valueOf(bkArr[i].getTotalPages()),
					String.valueOf(bkArr[i].getQuantity()), };
			model.addRow(data);
		}

		scrollPane.setViewportView(table);

		JLabel lblNewLabel = new JLabel("MAIN FORM OF SAR PAY LAW KA BOOK STORE\n");
		lblNewLabel.setFont(new Font("Segoe UI Emoji", Font.BOLD, 18));
		lblNewLabel.setBackground(new Color(255, 255, 240));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(204, 11, 454, 24);
		contentPane.add(lblNewLabel);

		JButton btnSort = new JButton("Goto Sort Form");
		btnSort.setForeground(new Color(0, 0, 0));
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sortForm f = new sortForm();
				f.setVisible(true);
				dispose();

			}
		});
		btnSort.setBackground(new Color(255, 255, 240));
		btnSort.setBounds(10, 426, 119, 23);
		contentPane.add(btnSort);

		JButton btnSearch = new JButton("Goto Search Form");
		btnSearch.setForeground(new Color(0, 0, 0));
		btnSearch.setBackground(new Color(255, 255, 240));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				searchForm f = new searchForm();
				f.setVisible(true);
				dispose();
			}
		});
		btnSearch.setBounds(149, 427, 159, 23);
		contentPane.add(btnSearch);

		JButton btnUpdate = new JButton("Goto Update Form");
		btnUpdate.setForeground(new Color(0, 0, 0));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateForm f = new updateForm();
				f.setVisible(true);
				dispose();
			}
		});
		btnUpdate.setBackground(new Color(255, 255, 240));
		btnUpdate.setBounds(545, 426, 159, 23);
		contentPane.add(btnUpdate);

		JButton btnLogout = new JButton("Logout");
		btnLogout.setForeground(new Color(0, 0, 0));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loginForm f = new loginForm();
				f.setVisible(true);
				dispose();
			}
		});
		btnLogout.setBackground(new Color(255, 255, 240));
		btnLogout.setBounds(736, 427, 114, 23);
		contentPane.add(btnLogout);

		JButton buttonInsert = new JButton("Goto Insert Form");
		buttonInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertForm IF = new insertForm();
				IF.setVisible(true);
				dispose();
			}
		});
		buttonInsert.setForeground(new Color(0, 0, 0));
		buttonInsert.setBackground(new Color(255, 255, 240));
		buttonInsert.setBounds(346, 427, 159, 23);
		contentPane.add(buttonInsert);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(
				"/Users/nayhtetkyaw/Downloads/papers.co-my94-aurora-purple-night-sky-beautiful-6-wallpaper.jpg"));
		lblNewLabel_1.setBounds(0, 0, 866, 469);
		contentPane.add(lblNewLabel_1);

//		JLabel lblBookTitle = new JLabel("New label");
//		lblBookTitle.setIcon(new ImageIcon("/Users/nayhtetkyaw/Downloads/download (2).jpeg"));
//		lblBookTitle.setBounds(0, 0, 860, 471);
//		contentPane.add(lblBookTitle);
	}
}

package SarPayLawKaBookStore;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultBoundedRangeModel;
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
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class searchForm extends JFrame {

	private JPanel contentPane;
	private JTable table;
	book bkArr[] = new book[100];
	int count = 0;
	protected Object Title;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchForm frame = new searchForm();
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
	public searchForm() {
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
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 52, 850, 363);
		contentPane.add(scrollPane);

		table = new JTable();
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

		JLabel lblNewLabel = new JLabel("SEARCH FORM OF SAR PAY LAW KA BOOK STORE\n");
		lblNewLabel.setFont(new Font("Segoe UI Emoji", Font.BOLD, 18));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(196, 11, 530, 24);
		contentPane.add(lblNewLabel);

		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 240));
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "Search By Type", "Search By Title", "Search By Author", "Search By Price",
						"Search by Type and Author", "Search by Type and TotalPages", "Search by Author and Price" }));
		comboBox.setBounds(215, 426, 207, 22);
		contentPane.add(comboBox);

		JButton btnRefresh1 = new JButton("Refresh\r\n");
		btnRefresh1.setForeground(new Color(0, 0, 0));
		btnRefresh1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearTable();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				for (int i = 0; i < count; i++) {
					String data[] = new String[] { bkArr[i].getType(), bkArr[i].getTitle(), bkArr[i].getAuthor(),
							String.valueOf(bkArr[i].getPrice()), String.valueOf(bkArr[i].getTotalPages()),
							String.valueOf(bkArr[i].getQuantity()), };
					model.addRow(data);
				}
			}
		});
		btnRefresh1.setBackground(new Color(255, 255, 240));
		btnRefresh1.setBounds(48, 426, 119, 23);
		contentPane.add(btnRefresh1);

		JButton btnSearch1 = new JButton("Search\r\n");
		btnSearch1.setForeground(new Color(0, 0, 0));
		btnSearch1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBox.getSelectedIndex() == 0) {
					String Type = JOptionPane.showInputDialog("Enter Type");
					clearTable();
					searchByType(bkArr, Type);

				} else if (comboBox.getSelectedIndex() == 1) {
					String Title = JOptionPane.showInputDialog("Enter Title");
					clearTable();
					searchByTitle(bkArr, Title);
				} else if (comboBox.getSelectedIndex() == 2) {
					String Author = JOptionPane.showInputDialog("Author");
					clearTable();
					searchByAuthor(bkArr, Author);
				} else if (comboBox.getSelectedIndex() == 3) {
					Double Price = Double.parseDouble(JOptionPane.showInputDialog("Enter Price"));
					clearTable();
					searchByPrice(bkArr, Price);
				} else if (comboBox.getSelectedIndex() == 4) {
					String type = JOptionPane.showInputDialog("Enter Type");
					String author = JOptionPane.showInputDialog("Enter Author");

					clearTable();
					searchByTypeAuthor(bkArr, type, author);
				} else if (comboBox.getSelectedIndex() == 5) {
					String type = JOptionPane.showInputDialog("Enter Type");
					int totalpages = Integer.parseInt(JOptionPane.showInputDialog("Enter totalpages"));

					clearTable();
					searchByTypeandTotalPages(bkArr, type, totalpages);
				} else {
					String author = JOptionPane.showInputDialog("Enter Author");
					double price = Double.parseDouble(JOptionPane.showInputDialog("Enter Price"));

					clearTable();
					searchByAuthorandPrice(bkArr, author, price);
				}
			}

		});
		btnSearch1.setBackground(new Color(255, 255, 240));
		btnSearch1.setBounds(496, 426, 119, 23);
		contentPane.add(btnSearch1);

		JButton Back2 = new JButton("Back");
		Back2.setForeground(new Color(0, 0, 0));
		Back2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mainForm f = new mainForm();
				f.setVisible(true);
				dispose();
			}
		});
		Back2.setBackground(new Color(255, 255, 240));
		Back2.setBounds(683, 426, 114, 23);
		contentPane.add(Back2);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(
				"/Users/nayhtetkyaw/Downloads/papers.co-my94-aurora-purple-night-sky-beautiful-6-wallpaper.jpg"));
		lblNewLabel_1.setBounds(0, 0, 866, 469);
		contentPane.add(lblNewLabel_1);

	}

	// search of Type
	void searchByType(book[] bkArr, String Type) {
		int found = -1;
		for (int i = 0; i < count; i++) {
			if (Type.equals(bkArr[i].getType())) {
				found = i;

				DefaultTableModel model = (DefaultTableModel) table.getModel();
				{
					String data[] = new String[] { bkArr[i].getType(), bkArr[i].getTitle(), bkArr[i].getAuthor(),
							String.valueOf(bkArr[i].getPrice()), String.valueOf(bkArr[i].getTotalPages()),
							String.valueOf(bkArr[i].getQuantity()), };
					model.addRow(data);
				}
			}
		}
		if (found == -1) {
			JOptionPane.showMessageDialog(null, "There is no Result");
		}
	}
	// end of Type

	// search of title
	void searchByTitle(book[] bkArr, String Title) {
		int found = -1;
		for (int i = 0; i < count; i++) {
			if (Title.equals(bkArr[i].getTitle())) {
				found = i;

				DefaultTableModel model = (DefaultTableModel) table.getModel();
				{
					String data[] = new String[] { bkArr[i].getType(), bkArr[i].getTitle(), bkArr[i].getAuthor(),
							String.valueOf(bkArr[i].getPrice()), String.valueOf(bkArr[i].getTotalPages()),
							String.valueOf(bkArr[i].getQuantity()), };
					model.addRow(data);
				}
			}
		}
		if (found == -1) {
			JOptionPane.showMessageDialog(null, "There is no Result");
		}
	}
	// end of Title

	// search of Author
	void searchByAuthor(book[] bkArr, String Author) {
		int found = -1;
		for (int i = 0; i < count; i++) {
			if (Author.equals(bkArr[i].getAuthor())) {
				found = i;

				DefaultTableModel model = (DefaultTableModel) table.getModel();
				{
					String data[] = new String[] { bkArr[i].getType(), bkArr[i].getTitle(), bkArr[i].getAuthor(),
							String.valueOf(bkArr[i].getPrice()), String.valueOf(bkArr[i].getTotalPages()),
							String.valueOf(bkArr[i].getQuantity()), };
					model.addRow(data);
				}
			}
		}
		if (found == -1) {
			JOptionPane.showMessageDialog(null, "There is no Result");
		}
	}
	// end of Author

	// search of Price
	void searchByPrice(book[] bkArr, double price) {
		int found = -1;
		for (int i = 0; i < count; i++) {
			if (price == (bkArr[i].getPrice())) {
				found = i;

				DefaultTableModel model = (DefaultTableModel) table.getModel();
				{
					String data[] = new String[] { bkArr[i].getType(), bkArr[i].getTitle(), bkArr[i].getAuthor(),
							String.valueOf(bkArr[i].getPrice()), String.valueOf(bkArr[i].getTotalPages()),
							String.valueOf(bkArr[i].getQuantity()), };
					model.addRow(data);
				}
			}
		}
		if (found == -1) {
			JOptionPane.showMessageDialog(null, "There is no Result");
		}
	}
	// end of price

	// search of Type and Author
	void searchByTypeAuthor(book[] bkArr, String type, String author) {
		int found = -1;
		for (int i = 0; i < count; i++) {
			if (type.equals(bkArr[i].getType()) && author.equals(bkArr[i].getAuthor())) {
				found = i;

				DefaultTableModel model = (DefaultTableModel) table.getModel();
				{
					String data[] = new String[] { bkArr[i].getType(), bkArr[i].getTitle(), bkArr[i].getAuthor(),
							String.valueOf(bkArr[i].getPrice()), String.valueOf(bkArr[i].getTotalPages()),
							String.valueOf(bkArr[i].getQuantity()), };
					model.addRow(data);
				}
			}
		}
		if (found == -1) {
			JOptionPane.showMessageDialog(null, "There is no Result");
		}
	}
	// search of Type and Author

	// search of Type and TotalPages
	void searchByTypeandTotalPages(book[] bkArr, String type, int totalpages) {
		int found = -1;
		for (int i = 0; i < count; i++) {
			if (type.equals(bkArr[i].getType()) && totalpages == (bkArr[i].getTotalPages())) {
				found = i;

				DefaultTableModel model = (DefaultTableModel) table.getModel();
				{
					String data[] = new String[] { bkArr[i].getType(), bkArr[i].getTitle(), bkArr[i].getAuthor(),
							String.valueOf(bkArr[i].getPrice()), String.valueOf(bkArr[i].getTotalPages()),
							String.valueOf(bkArr[i].getQuantity()), };
					model.addRow(data);
				}
			}
		}
		if (found == -1) {
			JOptionPane.showMessageDialog(null, "There is no Result");
		}
	}

	// end of type and totalpages

	// search by author and price

	void searchByAuthorandPrice(book[] bkArr, String author, double price) {
		int found = -1;
		for (int i = 0; i < count; i++) {
			if (author.equals(bkArr[i].getType()) && price == (bkArr[i].getPrice())) {
				found = i;

				DefaultTableModel model = (DefaultTableModel) table.getModel();
				{
					String data[] = new String[] { bkArr[i].getType(), bkArr[i].getTitle(), bkArr[i].getAuthor(),
							String.valueOf(bkArr[i].getPrice()), String.valueOf(bkArr[i].getTotalPages()),
							String.valueOf(bkArr[i].getQuantity()), };
					model.addRow(data);
				}
			}
		}
		if (found == -1) {
			JOptionPane.showMessageDialog(null, "There is no Result");
		}
	}
	// end of search author and price

	void clearTable() {
		DefaultTableModel dm = (DefaultTableModel) table.getModel();
		dm.getDataVector().removeAllElements();
		dm.fireTableDataChanged();

	}
}

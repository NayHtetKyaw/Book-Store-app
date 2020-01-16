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
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class sortForm extends JFrame {

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
					sortForm frame = new sortForm();
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
	public sortForm() {
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
		scrollPane.setBounds(0, 52, 850, 340);
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

		JLabel lblNewLabel = new JLabel("SORT FORM OF SAR PAY LAW KA BOOK STORE\n");
		lblNewLabel.setFont(new Font("Segoe UI Emoji", Font.BOLD, 18));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(219, 16, 455, 24);
		contentPane.add(lblNewLabel);

		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setBackground(new Color(255, 255, 240));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Sort By Type", "Sort By Title", "Sort By Author",
				"Sort By Price", "Sort By Total Pages", "Sort By Quantity" }));
		comboBox.setBounds(204, 403, 210, 22);
		contentPane.add(comboBox);

		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setForeground(new Color(0, 0, 0));
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// sortForm sf = new sortForm();
				// sf.setVisible(true);
				// dispose();
			}
		});
		btnRefresh.setBackground(new Color(255, 255, 240));
		btnRefresh.setBounds(23, 403, 119, 23);
		contentPane.add(btnRefresh);

		JButton btnSort = new JButton("Sort");
		btnSort.setForeground(new Color(0, 0, 0));
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBox.getSelectedIndex() == 0) {
					clearTable();
					sortByType(bkArr);
				} else if (comboBox.getSelectedIndex() == 1) {
					clearTable();
					sortByTitle(bkArr);
				} else if (comboBox.getSelectedIndex() == 2) {
					clearTable();
					sortByAuthor(bkArr);
				} else if (comboBox.getSelectedIndex() == 3) {
					clearTable();
					sortByPrice(bkArr);
				} else if (comboBox.getSelectedIndex() == 4) {
					clearTable();
					sortByTotalPages(bkArr);
				} else {
					clearTable();
					sortByQuantity(bkArr);
				}
			}
		});

		btnSort.setBackground(new Color(255, 255, 240));
		btnSort.setBounds(482, 403, 137, 23);
		contentPane.add(btnSort);

		JButton btnBack = new JButton("Back");
		btnBack.setForeground(new Color(0, 0, 0));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mainForm f = new mainForm();
				f.setVisible(true);
				dispose();
			}
		});
		btnBack.setBackground(new Color(255, 255, 240));
		btnBack.setBounds(681, 403, 114, 23);
		contentPane.add(btnBack);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(
				"/Users/nayhtetkyaw/Downloads/papers.co-my94-aurora-purple-night-sky-beautiful-6-wallpaper.jpg"));
		lblNewLabel_1.setBounds(0, 0, 866, 469);
		contentPane.add(lblNewLabel_1);
	}
	// end of constructor

	// sort by type
	void sortByType(book[] bkArr) {

		for (int i = 0; i < count; i++) {
			for (int j = 1; j < count - i; j++) {
				if (bkArr[j - 1].getType().compareTo(bkArr[j].getType()) > 0) {
					book temp = bkArr[j - 1];
					bkArr[j - 1] = bkArr[j];
					bkArr[j] = temp;

				}
			}
		}
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for (int i = 0; i < count; i++) {
			String data[] = new String[] { bkArr[i].getType(), bkArr[i].getTitle(), bkArr[i].getAuthor(),
					String.valueOf(bkArr[i].getPrice()), String.valueOf(bkArr[i].getTotalPages()),
					String.valueOf(bkArr[i].getQuantity()), };
			model.addRow(data);
		}

	}
	// end of sort type

	void clearTable() {
		DefaultTableModel dm = (DefaultTableModel) table.getModel();
		dm.getDataVector().removeAllElements();
		dm.fireTableDataChanged();
	}

	// sort by Title
	void sortByTitle(book[] bkArr) {
		for (int i = 0; i < count; i++) {
			for (int j = 1; j < count - i; j++) {
				if (bkArr[j - 1].getTitle().compareTo(bkArr[j].getTitle()) > 0) {
					book temp = bkArr[j - 1];
					bkArr[j - 1] = bkArr[j];
					bkArr[j] = temp;

				}
			}
		}
		DefaultTableModel Model = (DefaultTableModel) table.getModel();
		for (int i = 0; i < count; i++) {
			String data[] = new String[] { bkArr[i].getType(), bkArr[i].getTitle(), bkArr[i].getAuthor(),
					String.valueOf(bkArr[i].getPrice()), String.valueOf(bkArr[i].getTotalPages()),
					String.valueOf(bkArr[i].getQuantity()), };
			Model.addRow(data);
		}
	}
	// end of sort Title

	// sort by Author
	void sortByAuthor(book[] bkArr) {
		for (int i = 0; i < count; i++) {
			for (int j = 1; j < count - i; j++) {
				if (bkArr[j - 1].getAuthor().compareTo(bkArr[j].getAuthor()) > 0) {
					book temp = bkArr[j - 1];
					bkArr[j - 1] = bkArr[j];
					bkArr[j] = temp;

				}
			}
		}
		DefaultTableModel Model = (DefaultTableModel) table.getModel();
		for (int i = 0; i < count; i++) {
			String data[] = new String[] { bkArr[i].getType(), bkArr[i].getTitle(), bkArr[i].getAuthor(),
					String.valueOf(bkArr[i].getPrice()), String.valueOf(bkArr[i].getTotalPages()),
					String.valueOf(bkArr[i].getQuantity()), };
			Model.addRow(data);
		}
	}
	// end of sort Author

	// sort by Price
	void sortByPrice(book[] bkArr) {
		for (int i = 0; i < count; i++) {
			for (int j = 1; j < count - i; j++) {
				if (bkArr[j - 1].getPrice() > (bkArr[j].getPrice())) {
					book temp = bkArr[j - 1];
					bkArr[j - 1] = bkArr[j];
					bkArr[j] = temp;

				}
			}
		}
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for (int i = 0; i < count; i++) {
			String data[] = new String[] { bkArr[i].getType(), bkArr[i].getTitle(), bkArr[i].getAuthor(),
					String.valueOf(bkArr[i].getPrice()), String.valueOf(bkArr[i].getTotalPages()),
					String.valueOf(bkArr[i].getQuantity()), };
			model.addRow(data);
		}
	} // end of sort Price

	// sort by TotalPages

	void sortByTotalPages(book[] bkArr) {
		for (int i = 0; i < count; i++) {
			for (int j = 1; j < count - i; j++) {
				if (bkArr[j - 1].getTotalPages() > (bkArr[j].getTotalPages())) {
					book temp = bkArr[j - 1];
					bkArr[j - 1] = bkArr[j];
					bkArr[j] = temp;

				}
			}
		}
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for (int i = 0; i < count; i++) {
			String data[] = new String[] { bkArr[i].getType(), bkArr[i].getTitle(), bkArr[i].getAuthor(),
					String.valueOf(bkArr[i].getPrice()), String.valueOf(bkArr[i].getTotalPages()),
					String.valueOf(bkArr[i].getQuantity()), };
			model.addRow(data);
		}
	}
	// end of sort by TotalPages

	// sort of quantity
	void sortByQuantity(book[] bkArr) {
		for (int i = 0; i < count; i++) {
			for (int j = 1; j < count - i; j++) {
				if (bkArr[j - 1].getQuantity() > (bkArr[j].getQuantity())) {
					book temp = bkArr[j - 1];
					bkArr[j - 1] = bkArr[j];
					bkArr[j] = temp;

				}
			}
		}
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for (int i = 0; i < count; i++) {
			String data[] = new String[] { bkArr[i].getType(), bkArr[i].getTitle(), bkArr[i].getAuthor(),
					String.valueOf(bkArr[i].getPrice()), String.valueOf(bkArr[i].getTotalPages()),
					String.valueOf(bkArr[i].getQuantity()), };
			model.addRow(data);
		}

	}
	// end of quantity

}// end of class

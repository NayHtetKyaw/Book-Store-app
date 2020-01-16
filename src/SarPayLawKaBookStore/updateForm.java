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
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class updateForm extends JFrame {

	private JPanel contentPane;
	private JTable table;
	book bkArr[] = new book[100];
	int count = 0;
	private JTextField txtType;
	private JTextField txtAuthor;
	private JTextField txtTotalp;
	private JTextField txtTitle;
	private JTextField txtpri;
	private JTextField txtQuan;
	int updateRow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updateForm frame = new updateForm();
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
	public updateForm() {
		setBackground(new Color(255, 255, 255));
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
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 52, 850, 284);
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

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent marlon) {
				int i = table.getSelectedRow();
				updateRow = i;

				txtType.setText(model.getValueAt(i, 0).toString());
				txtTitle.setText(model.getValueAt(i, 1).toString());
				txtAuthor.setText(model.getValueAt(i, 2).toString());
				txtTotalp.setText(model.getValueAt(i, 3).toString());
				txtpri.setText(model.getValueAt(i, 4).toString());
				txtQuan.setText(model.getValueAt(i, 5).toString());

			}
		});
		scrollPane.setViewportView(table);

		JLabel lblNewLabel = new JLabel("UPDATE FORM OF SAR PAY LAW KA BOOK STORE\n");
		lblNewLabel.setFont(new Font("Segoe UI Emoji", Font.BOLD, 18));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(206, 16, 477, 24);
		contentPane.add(lblNewLabel);

		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setForeground(new Color(0, 0, 0));
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				updateForm f = new updateForm();
				f.setVisible(true);
				dispose();

			}
		});
		btnRefresh.setBackground(new Color(255, 255, 240));
		btnRefresh.setBounds(39, 425, 119, 23);
		contentPane.add(btnRefresh);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setForeground(new Color(0, 0, 0));
		btnUpdate.setBackground(new Color(255, 255, 240));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int TotalPages;
				int Quantity;
				clearTable();
				String Type, Title, Author;
				double Price;

				Type = txtType.getText();
				Title = txtTitle.getText();
				Author = txtAuthor.getText();
				Price = Double.parseDouble(txtpri.getText());
				// TotalPages=Integer.parseInt(txtTotalp.getText());
				// Quantity=Integer.parseInt(txtQuan.getText());

				bkArr[updateRow].setType(Type);
				bkArr[updateRow].setTitle(Title);
				bkArr[updateRow].setAuthor(Author);
				bkArr[updateRow].setPrice(Price);
				// bkArr[updateRow].setTotalPages(TotalPages);
				// bkArr[updateRow].setQuantity(Quantity);

				DefaultTableModel Model = (DefaultTableModel) table.getModel();
				for (int i = 0; i < count; i++) {
					String data[] = new String[] { bkArr[i].getType(), bkArr[i].getTitle(), bkArr[i].getAuthor(),
							String.valueOf(bkArr[i].getPrice()), String.valueOf(bkArr[i].getTotalPages()),
							String.valueOf(bkArr[i].getQuantity()), };
					Model.addRow(data);
				}
			}
		});
		btnUpdate.setBounds(364, 425, 159, 23);
		contentPane.add(btnUpdate);

		JButton btnBack2 = new JButton("Back");
		btnBack2.setForeground(new Color(0, 0, 0));
		btnBack2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mainForm f = new mainForm();
				f.setVisible(true);
				dispose();
			}
		});
		btnBack2.setBackground(new Color(255, 255, 240));
		btnBack2.setBounds(696, 425, 114, 23);
		contentPane.add(btnBack2);

		JTextPane txtpnType = new JTextPane();
		txtpnType.setBackground(new Color(250, 235, 215));
		txtpnType.setForeground(new Color(0, 0, 0));
		txtpnType.setText("Type");
		txtpnType.setBounds(18, 348, 54, 16);
		contentPane.add(txtpnType);

		JTextPane txtpnTitle = new JTextPane();
		txtpnTitle.setBackground(new Color(255, 255, 224));
		txtpnTitle.setForeground(new Color(0, 0, 0));
		txtpnTitle.setText("Title");
		txtpnTitle.setBounds(18, 393, 54, 16);
		contentPane.add(txtpnTitle);

		JTextPane txtpnAuthor = new JTextPane();
		txtpnAuthor.setBackground(new Color(255, 255, 224));
		txtpnAuthor.setForeground(new Color(0, 0, 0));
		txtpnAuthor.setText("Author");
		txtpnAuthor.setBounds(289, 348, 64, 16);
		contentPane.add(txtpnAuthor);

		JTextPane txtpnPrice = new JTextPane();
		txtpnPrice.setBackground(new Color(255, 255, 224));
		txtpnPrice.setForeground(new Color(0, 0, 0));
		txtpnPrice.setText("Price");
		txtpnPrice.setBounds(289, 393, 64, 16);
		contentPane.add(txtpnPrice);

		JTextPane txtQuantity = new JTextPane();
		txtQuantity.setBackground(new Color(255, 255, 224));
		txtQuantity.setForeground(new Color(0, 0, 0));
		txtQuantity.setText("Quantity");
		txtQuantity.setBounds(589, 393, 69, 16);
		contentPane.add(txtQuantity);

		JTextPane txtTotalP = new JTextPane();
		txtTotalP.setBackground(new Color(255, 255, 224));
		txtTotalP.setForeground(new Color(0, 0, 0));
		txtTotalP.setText("TotalPages");
		txtTotalP.setBounds(589, 348, 69, 16);
		contentPane.add(txtTotalP);

		txtType = new JTextField();
		txtType.setBounds(84, 342, 130, 26);
		contentPane.add(txtType);
		txtType.setColumns(10);

		txtAuthor = new JTextField();
		txtAuthor.setColumns(10);
		txtAuthor.setBounds(393, 342, 130, 26);
		contentPane.add(txtAuthor);

		txtTotalp = new JTextField();
		txtTotalp.setColumns(10);
		txtTotalp.setBounds(680, 342, 130, 26);
		contentPane.add(txtTotalp);

		txtTitle = new JTextField();
		txtTitle.setColumns(10);
		txtTitle.setBounds(84, 387, 130, 26);
		contentPane.add(txtTitle);

		txtpri = new JTextField();
		txtpri.setColumns(10);
		txtpri.setBounds(393, 393, 130, 26);
		contentPane.add(txtpri);

		txtQuan = new JTextField();
		txtQuan.setColumns(10);
		txtQuan.setBounds(680, 386, 130, 26);
		contentPane.add(txtQuan);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(
				"/Users/nayhtetkyaw/Downloads/papers.co-my94-aurora-purple-night-sky-beautiful-6-wallpaper.jpg"));
		lblNewLabel_1.setBounds(0, 0, 866, 469);
		contentPane.add(lblNewLabel_1);
	}

	void clearTable() {
		DefaultTableModel dm = (DefaultTableModel) table.getModel();
		dm.getDataVector().removeAllElements();
		dm.fireTableDataChanged();
	}
}

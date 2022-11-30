package Soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GeometicCalculator {

	private JFrame frame;
	private JTextField txtKenar;
	private JTextField txtKisaKenar;
	private JTextField txtUzunKenar;
	private JTextField txtYariCap;
	private JLabel lblNewLabel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeometicCalculator window = new GeometicCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GeometicCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 731, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblKareHesaplama = new JLabel("KareHesaplama :");
		lblKareHesaplama.setBounds(54, 134, 109, 13);
		frame.getContentPane().add(lblKareHesaplama);
		
		JLabel lblDikdortgenHesaplama = new JLabel("DikdortgenHesaplama :");
		lblDikdortgenHesaplama.setBounds(54, 199, 124, 24);
		frame.getContentPane().add(lblDikdortgenHesaplama);
		
		txtKenar = new JTextField();
		txtKenar.setBounds(353, 131, 96, 19);
		frame.getContentPane().add(txtKenar);
		txtKenar.setColumns(10);
		
		JLabel lblKenar = new JLabel("Kenar");
		lblKenar.setBounds(381, 108, 45, 13);
		frame.getContentPane().add(lblKenar);
		
		txtKisaKenar = new JTextField();
		txtKisaKenar.setBounds(353, 202, 96, 19);
		frame.getContentPane().add(txtKisaKenar);
		txtKisaKenar.setColumns(10);
		
		txtUzunKenar = new JTextField();
		txtUzunKenar.setBounds(499, 202, 96, 19);
		frame.getContentPane().add(txtUzunKenar);
		txtUzunKenar.setColumns(10);
		
		JLabel lblKisaKenar = new JLabel("KisaKenar");
		lblKisaKenar.setBounds(380, 160, 69, 19);
		frame.getContentPane().add(lblKisaKenar);
		
		JLabel lblUzunKenar = new JLabel("UzunKenar");
		lblUzunKenar.setBounds(523, 163, 61, 13);
		frame.getContentPane().add(lblUzunKenar);
		
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(303, 322, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_4 = new JLabel("Sonuc :");
		lblNewLabel_4.setBounds(65, 390, 45, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblDaireHesaplama = new JLabel("Daire Hesaplama :");
		lblDaireHesaplama.setBounds(54, 276, 109, 24);
		frame.getContentPane().add(lblDaireHesaplama);
		
		JLabel lblNewLabel_6 = new JLabel("YariCap");
		lblNewLabel_6.setBounds(381, 238, 45, 13);
		frame.getContentPane().add(lblNewLabel_6);
		
		txtYariCap = new JTextField();
		txtYariCap.setBounds(353, 273, 96, 19);
		frame.getContentPane().add(txtYariCap);
		txtYariCap.setColumns(10);
	}
}

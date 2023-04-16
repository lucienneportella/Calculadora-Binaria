
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraBinaria extends JFrame {

	private JPanel contentPane;
	private JTextField tfTelaResultado;

	MetodosCalculadora mc = new MetodosCalculadora();
	String valor1 = "";
	String valor2 = "";
	String sinal = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraBinaria frame = new CalculadoraBinaria();
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
	public CalculadoraBinaria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 229, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tfTelaResultado = new JTextField();
		tfTelaResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		tfTelaResultado.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		tfTelaResultado.setBounds(10, 11, 197, 106);
		contentPane.add(tfTelaResultado);
		tfTelaResultado.setColumns(10);

		JButton btnNewButton = new JButton("7");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(10, 128, 48, 40);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(56, 128, 48, 40);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("9");
		btnNewButton_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1_1.setEnabled(false);
		btnNewButton_1_1.setBounds(104, 128, 48, 40);
		contentPane.add(btnNewButton_1_1);

		JButton btnNewButton_1_1_1 = new JButton("4");
		btnNewButton_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1_1_1.setEnabled(false);
		btnNewButton_1_1_1.setBounds(10, 169, 48, 40);
		contentPane.add(btnNewButton_1_1_1);

		JButton btnNewButton_1_1_1_1 = new JButton("5");
		btnNewButton_1_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1_1_1_1.setEnabled(false);
		btnNewButton_1_1_1_1.setBounds(56, 169, 48, 40);
		contentPane.add(btnNewButton_1_1_1_1);

		JButton btnNewButton_1_1_1_1_1 = new JButton("6");
		btnNewButton_1_1_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1_1_1_1_1.setEnabled(false);
		btnNewButton_1_1_1_1_1.setBounds(104, 169, 48, 40);
		contentPane.add(btnNewButton_1_1_1_1_1);

		JButton btnNewButton_1_1_1_2 = new JButton("1");
		btnNewButton_1_1_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfTelaResultado.setText(tfTelaResultado.getText() + "1");
			}

		});
		btnNewButton_1_1_1_2.setBounds(10, 208, 48, 40);
		contentPane.add(btnNewButton_1_1_1_2);

		JButton btnNewButton_1_1_1_2_1 = new JButton("2");
		btnNewButton_1_1_1_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1_1_1_2_1.setEnabled(false);
		btnNewButton_1_1_1_2_1.setBounds(56, 208, 48, 40);
		contentPane.add(btnNewButton_1_1_1_2_1);

		JButton btnNewButton_1_1_1_2_1_1 = new JButton("3");
		btnNewButton_1_1_1_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1_1_1_2_1_1.setEnabled(false);
		btnNewButton_1_1_1_2_1_1.setBounds(104, 208, 48, 40);
		contentPane.add(btnNewButton_1_1_1_2_1_1);

		JButton btnNewButton_1_1_1_2_1_2 = new JButton("0");
		btnNewButton_1_1_1_2_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1_1_1_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfTelaResultado.setText(tfTelaResultado.getText() + "0");
			}
		});
		btnNewButton_1_1_1_2_1_2.setBounds(10, 243, 48, 40);
		contentPane.add(btnNewButton_1_1_1_2_1_2);

		JButton btnNewButton_1_1_1_2_1_2_1 = new JButton("+");
		btnNewButton_1_1_1_2_1_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1_1_1_2_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				valor1 = tfTelaResultado.getText();
				tfTelaResultado.setText("");
				sinal = "soma";

			}
		});
		btnNewButton_1_1_1_2_1_2_1.setBounds(104, 243, 48, 40);
		contentPane.add(btnNewButton_1_1_1_2_1_2_1);

		JButton btnNewButton_1_1_1_2_1_2_1_1 = new JButton("-");
		btnNewButton_1_1_1_2_1_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1_1_1_2_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				valor1 = tfTelaResultado.getText();
				tfTelaResultado.setText("");
				sinal = "subtracao";
			}
		});
		btnNewButton_1_1_1_2_1_2_1_1.setBounds(56, 243, 48, 40);
		contentPane.add(btnNewButton_1_1_1_2_1_2_1_1);

		JButton btnNewButton_2 = new JButton("=");
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = tfTelaResultado.getText();
				if (sinal == "soma") {
					tfTelaResultado.setText(mc.soma(valor1, valor2));

				} else if (sinal == "subtracao") {
					tfTelaResultado.setText(mc.subtração(valor1, valor2));
				}

			}

		});
		btnNewButton_2.setBounds(153, 208, 54, 75);
		contentPane.add(btnNewButton_2);

		JButton btnLimpar = new JButton("Ce");
		btnLimpar.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfTelaResultado.setText("");
			}
		});
		btnLimpar.setToolTipText("");
		btnLimpar.setBounds(153, 128, 54, 81);
		contentPane.add(btnLimpar);
	}
}

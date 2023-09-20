package Prop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Zodiacal {

	private JFrame frmSignosZodiacales;
	private JComboBox comboBoxMes;
	private JLabel lblDia;
	private JLabel lblSigno;
	private JButton btnCalcular;
	private JButton btnBorrar;
	private JTextField textDia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					Zodiacal window = new Zodiacal();
					window.frmSignosZodiacales.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Zodiacal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignosZodiacales = new JFrame();
		frmSignosZodiacales.getContentPane().setBackground(new Color(255, 255, 255));
		frmSignosZodiacales.setIconImage(Toolkit.getDefaultToolkit().getImage(Zodiacal.class.getResource("/Prop/signos1.0.jpg")));
		frmSignosZodiacales.setTitle("Signos Zodiacales");
		frmSignosZodiacales.setBounds(100, 100, 442, 377);
		frmSignosZodiacales.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignosZodiacales.getContentPane().setLayout(null);
		frmSignosZodiacales.setLocationRelativeTo(null);
		JLabel lblNewLabel = new JLabel("Dia :");
		lblNewLabel.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 14));
		lblNewLabel.setBounds(22, 26, 60, 20);
		frmSignosZodiacales.getContentPane().add(lblNewLabel);
		
		JLabel lblMes = new JLabel("Mes :");
		lblMes.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 14));
		lblMes.setBounds(22, 64, 60, 20);
		frmSignosZodiacales.getContentPane().add(lblMes);
		
		textDia = new JTextField();
		textDia.setBounds(77, 28, 86, 20);
		frmSignosZodiacales.getContentPane().add(textDia);
		textDia.setColumns(10);
		
		comboBoxMes = new JComboBox();
		comboBoxMes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre ", "Diciembre"}));
		comboBoxMes.setBounds(77, 65, 86, 22);
		frmSignosZodiacales.getContentPane().add(comboBoxMes);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int Dia=Integer.parseInt(textDia.getText());
					String Item;
					Item=comboBoxMes.getSelectedItem().toString();
					CalSigno(Dia,Item);
				}catch(Exception e1) {
					
				}
			}
		});
		btnCalcular.setBounds(10, 110, 89, 23);
		frmSignosZodiacales.getContentPane().add(btnCalcular);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDia.setText("");
				lblDia.setText("");
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/Blanco.jpg")));
				
			}
		});
		btnBorrar.setBounds(108, 110, 89, 23);
		frmSignosZodiacales.getContentPane().add(btnBorrar);
		
		lblDia = new JLabel("Dia:");
		lblDia.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblDia.setBounds(20, 148, 117, 20);
		frmSignosZodiacales.getContentPane().add(lblDia);
		
		lblSigno = new JLabel("Signo:");
		lblSigno.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblSigno.setBounds(22, 179, 262, 147);
		frmSignosZodiacales.getContentPane().add(lblSigno);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/signos2.0.jpg")));
		lblNewLabel_1.setBounds(205, 31, 211, 137);
		frmSignosZodiacales.getContentPane().add(lblNewLabel_1);
	}
	public void CalSigno(int Dia, String Item ) {
	
		switch(Item) {
		case "Enero":
			if(Dia>=1 && Dia<=19) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/Enero 19.0.jpg")));
			}if(Dia>=20 && Dia<=31) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Acuario.jpg")));
			}if(Dia>=32) {
				lblDia.setText("Dia No existente");
			}
			break;
		case "Febrero":
			if(Dia>=1 && Dia<=18) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Acuario.jpg")));
			}if(Dia>=19 && Dia<=28) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Piscis.jpg")));
			}if(Dia>=29) {
				lblDia.setText("Dia No existente");
			}
			break;
		case "Marzo":
			if(Dia>=1 && Dia<=20) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Piscis.jpg")));
			}if(Dia>=20 && Dia<=30) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Aries.jpg")));
			}if(Dia>=31) {
				lblDia.setText("Dia No existente");
			}
			break;
		case "Abril":
			if(Dia>=1 && Dia<=19) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Aries.jpg")));
			}if(Dia>=20 && Dia<=31) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Tauro.jpg")));
			}if(Dia>=32) {
				lblDia.setText("Dia No existente");
			}
			break;
		case "Mayo":
			if(Dia>=1 && Dia<=20) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Tauro.jpg")));
			}if(Dia>=21 && Dia<=31) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Geminis.jpg")));
			}if(Dia>=32) {
				lblDia.setText("Dia No existente");
			}
			break;
		case "Junio":
			if(Dia>=1 && Dia<=20) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Geminis.jpg")));
			}if(Dia>=21 && Dia<=30) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Cancer.jpg")));
			}if(Dia>=31) {
				lblDia.setText("Dia No existente");
			}
			break;
		case "Julio":
			if(Dia>=1 && Dia<=22) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Cancer.jpg")));
			}if(Dia>=23 && Dia<=31) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Leo.jpg")));
			}if(Dia>=32) {
				lblDia.setText("Dia No existente");
			}
			break;
		case "Agosto":
			if(Dia>=1 && Dia<=22) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Leo.jpg")));
			}if(Dia>=23 && Dia<=31) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Virgo.jpg")));
			}if(Dia>=32) {
				lblDia.setText("Dia No existente");
			}
			break;
		case "Septiembre":
			if(Dia>=1 && Dia<=22) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Virgo.jpg")));
			}if(Dia>=23 && Dia<=30) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Libra.jpg")));
			}if(Dia>=31) {
				lblDia.setText("Dia No existente");
			}
			break;
		case "Octubre":
			if(Dia>=1 && Dia<=22) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Libra.jpg")));
			}if(Dia>=23 && Dia<=31) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Escorpio.jpg")));
			}if(Dia>=32) {
				lblDia.setText("Dia No existente");
			}
			break;
		case "Noviembre":
			if(Dia>=1 && Dia<=21) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Escorpio.jpg")));
			}if(Dia>=22 && Dia<=30) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Sagitario.jpg")));
			}if(Dia>=31) {
				lblDia.setText("Dia No existente");
			}
			break;
		case "Diciembre":
			if(Dia>=1 && Dia<=21) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Sagitario.jpg")));
			}if(Dia>=22 && Dia<=30) {
				lblDia.setText("Dia: "+Dia);
				lblSigno.setIcon(new ImageIcon(Zodiacal.class.getResource("/Prop/1Capricornio.jpg")));
			}if(Dia>=31) {
				lblDia.setText("Dia No existente");
			}
			break;
		}
	}
}

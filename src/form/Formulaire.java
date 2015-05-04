package form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import datas.Constantes;

public class Formulaire extends JFrame {
	private JPanel conteneur = new JPanel();

	private JLabel label1 = new JLabel(Constantes.angleAlpha);
	private JLabel label2 = new JLabel(Constantes.brasLB);
	private JLabel label3 = new JLabel(Constantes.masseMB);
	private JLabel label4 = new JLabel(Constantes.angleForceTraction);
	private JLabel label5 = new JLabel(Constantes.mc);
	private JLabel label6 = new JLabel(Constantes.mp);
	private JLabel label7 = new JLabel(Constantes.baseLR);

	private JTextField jtf1 = new JTextField("Hauteur de la butée");
	private JTextField jtf2 = new JTextField("Longueur du bras");
	private JTextField jtf3 = new JTextField("Masse du bras");
	private JTextField jtf4 = new JTextField("Angle de la force de traction");
	private JTextField jtf5 = new JTextField("Masse du contrepoids");
	private JTextField jtf6 = new JTextField("Masse du projectile");
	private JTextField jtf7 = new JTextField("Longueur de la base");

	public Formulaire() {

		this.setTitle("Catapulte");
		this.setSize(500, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		conteneur.setBackground(Color.white);
		conteneur.setLayout(new BorderLayout());
		JPanel top = new JPanel();

		jtf1.setPreferredSize(new Dimension(250, 30));
		label1.setPreferredSize(new Dimension(200, 30));
		top.add(label1);
		top.add(jtf1);

		jtf2.setPreferredSize(new Dimension(250, 30));
		label2.setPreferredSize(new Dimension(200, 30));
		top.add(label2);
		top.add(jtf2);

		jtf3.setPreferredSize(new Dimension(250, 30));
		label3.setPreferredSize(new Dimension(200, 30));
		top.add(label3);
		top.add(jtf3);

		jtf4.setPreferredSize(new Dimension(250, 30));
		label4.setPreferredSize(new Dimension(200, 30));
		top.add(label4);
		top.add(jtf4);

		jtf5.setPreferredSize(new Dimension(250, 30));
		label5.setPreferredSize(new Dimension(200, 30));
		top.add(label5);
		top.add(jtf5);

		jtf6.setPreferredSize(new Dimension(250, 30));
		label6.setPreferredSize(new Dimension(200, 30));
		top.add(label6);
		top.add(jtf6);

		jtf7.setPreferredSize(new Dimension(250, 30));
		label7.setPreferredSize(new Dimension(200, 30));
		top.add(label7);
		top.add(jtf7);

		conteneur.add(top, BorderLayout.CENTER);
		this.setContentPane(conteneur);
		this.setVisible(true);

	}

}

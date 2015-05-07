package form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
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

	private JTextField jtf1 = new JTextField("Hauteur de la but�e");
	private JTextField jtf2 = new JTextField("Longueur du bras");
	private JTextField jtf3 = new JTextField("Masse du bras");
	private JTextField jtf4 = new JTextField("Angle de la force de traction");
	private JTextField jtf5 = new JTextField("Masse du contrepoids");
	private JTextField jtf6 = new JTextField("Masse du projectile");
	private JTextField jtf7 = new JTextField("Longueur de la base");

	private JButton valider = new JButton ("Valider");

	public Formulaire() {

		this.setTitle("Catapulte");
		this.setSize(500, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		conteneur.setBackground(Color.white);
		conteneur.setLayout(new BorderLayout());
		JPanel top = new JPanel();

		jtf1.setPreferredSize(new Dimension(250, 30));
		clickEvent(jtf1);
		label1.setPreferredSize(new Dimension(200, 30));
		top.add(label1);
		top.add(jtf1);

		jtf2.setPreferredSize(new Dimension(250, 30));
		clickEvent(jtf2);
		label2.setPreferredSize(new Dimension(200, 30));
		top.add(label2);
		top.add(jtf2);

		jtf3.setPreferredSize(new Dimension(250, 30));
		clickEvent(jtf3);
		label3.setPreferredSize(new Dimension(200, 30));
		top.add(label3);
		top.add(jtf3);

		jtf4.setPreferredSize(new Dimension(250, 30));
		clickEvent(jtf4);
		label4.setPreferredSize(new Dimension(200, 30));
		top.add(label4);
		top.add(jtf4);

		jtf5.setPreferredSize(new Dimension(250, 30));
		clickEvent(jtf5);
		label5.setPreferredSize(new Dimension(200, 30));
		top.add(label5);
		top.add(jtf5);

		jtf6.setPreferredSize(new Dimension(250, 30));
		clickEvent(jtf6);
		label6.setPreferredSize(new Dimension(200, 30));
		top.add(label6);
		top.add(jtf6);

		jtf7.setPreferredSize(new Dimension(250, 30));
		clickEvent(jtf7);
		label7.setPreferredSize(new Dimension(200, 30));
		top.add(label7);
		top.add(jtf7);

		valider.addActionListener(new BoutonListener());

		JPanel down = new JPanel();
		down.add(valider);

		conteneur.add(top, BorderLayout.CENTER);
		conteneur.add(down, BorderLayout.SOUTH);
		this.setContentPane(conteneur);
		this.setVisible(true);

	}

	public class BoutonListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			Siege siege = new Siege();
			siege.setAngleAlpha(Double.valueOf(jtf1.getText()));
			siege.setAngleForceTraction(Double.valueOf(jtf4.getText()));
			siege.setBaseLR(Double.valueOf(jtf7.getText()));
			siege.setBrasLM(Double.valueOf(jtf2.getText()));
			siege.setMasseMB(Double.valueOf(jtf3.getText()));
			siege.setMc(Double.valueOf(jtf5.getText()));
			siege.setMp(Double.valueOf(jtf6.getText()));
			System.out.println(siege.toString());
		}
	}

	/**
	 * R�d�finition du style formulaire
	 * @param jtf
	 */
	public void clickEvent(JTextField jtf) {
	
		jtf.getFont().deriveFont(Font.ITALIC);
		jtf.setForeground(Color.gray);
		jtf.addMouseListener(new MouseListener() {       
		    public void mouseClicked(MouseEvent e) {
		        JTextField texteField = ((JTextField)e.getSource());
		        texteField.setText("");
		        texteField.getFont().deriveFont(Font.PLAIN);
		        texteField.setForeground(Color.black);
		        texteField.removeMouseListener(this);
		    }

			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}
		});
	}


	public String getJtf1() {
		return jtf1.getText();
	}


	public void setJtf1(JTextField jtf1) {
		this.jtf1 = jtf1;
	}


	public String getJtf2() {
		return jtf2.getText();
	}


	public void setJtf2(JTextField jtf2) {
		this.jtf2 = jtf2;
	}


	public String getJtf3() {
		return jtf3.getText();
	}


	public void setJtf3(JTextField jtf3) {
		this.jtf3 = jtf3;
	}


	public String getJtf4() {
		return jtf4.getText();
	}


	public void setJtf4(JTextField jtf4) {
		this.jtf4 = jtf4;
	}


	public String getJtf5() {
		return jtf5.getText();
	}


	public void setJtf5(JTextField jtf5) {
		this.jtf5 = jtf5;
	}


	public String getJtf6() {
		return jtf6.getText();
	}


	public void setJtf6(JTextField jtf6) {
		this.jtf6 = jtf6;
	}


	public String getJtf7() {
		return jtf7.getText();
	}


	public void setJtf7(JTextField jtf7) {
		this.jtf7 = jtf7;
	}
	
	
	
}

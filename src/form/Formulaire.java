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
import formules.Viabilite;

public class Formulaire extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel conteneur = new JPanel();

	private JLabel label1 = new JLabel(Constantes.angleAlpha);
	private JLabel label2 = new JLabel(Constantes.brasLB);
	private JLabel label3 = new JLabel(Constantes.masseMB);
	private JLabel label4 = new JLabel(Constantes.angleForceTraction);
	private JLabel label5 = new JLabel(Constantes.mc);
	private JLabel label6 = new JLabel(Constantes.mp);
	private JLabel label7 = new JLabel(Constantes.baseLR);
	
	private JTextField jtfAngleAlphaHauteurButee = new JTextField("Angle (alpha) hauteur de la butee");
	private JTextField jtfLongueurBrasLB = new JTextField("Longueur du bras");
	private JTextField jtfMasseBrasMB = new JTextField("Masse du bras");
	private JTextField jtfAngleBetaForceTraction = new JTextField("Angle (beta) de la force de traction");
	private JTextField jtfMasseContrepoidsMC = new JTextField("Masse du contrepoids");
	private JTextField jtfMasseProjectileMP = new JTextField("Masse du projectile");
	private JTextField jtfLongueurBaseLR = new JTextField("Longueur de la base");

	private JButton valider = new JButton ("Valider");

	public Formulaire() {

		this.setTitle("Catapulte");
		this.setSize(500, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		conteneur.setBackground(Color.white);
		conteneur.setLayout(new BorderLayout());
		JPanel top = new JPanel();

		jtfAngleAlphaHauteurButee.setPreferredSize(new Dimension(250, 30));
		clickEvent(jtfAngleAlphaHauteurButee);
		label1.setPreferredSize(new Dimension(200, 30));
		top.add(label1);
		top.add(jtfAngleAlphaHauteurButee);

		jtfLongueurBrasLB.setPreferredSize(new Dimension(250, 30));
		clickEvent(jtfLongueurBrasLB);
		label2.setPreferredSize(new Dimension(200, 30));
		top.add(label2);
		top.add(jtfLongueurBrasLB);

		jtfMasseBrasMB.setPreferredSize(new Dimension(250, 30));
		clickEvent(jtfMasseBrasMB);
		label3.setPreferredSize(new Dimension(200, 30));
		top.add(label3);
		top.add(jtfMasseBrasMB);

		jtfAngleBetaForceTraction.setPreferredSize(new Dimension(250, 30));
		clickEvent(jtfAngleBetaForceTraction);
		label4.setPreferredSize(new Dimension(200, 30));
		top.add(label4);
		top.add(jtfAngleBetaForceTraction);

		jtfMasseContrepoidsMC.setPreferredSize(new Dimension(250, 30));
		clickEvent(jtfMasseContrepoidsMC);
		label5.setPreferredSize(new Dimension(200, 30));
		top.add(label5);
		top.add(jtfMasseContrepoidsMC);

		jtfMasseProjectileMP.setPreferredSize(new Dimension(250, 30));
		clickEvent(jtfMasseProjectileMP);
		label6.setPreferredSize(new Dimension(200, 30));
		top.add(label6);
		top.add(jtfMasseProjectileMP);

		jtfLongueurBaseLR.setPreferredSize(new Dimension(250, 30));
		clickEvent(jtfLongueurBaseLR);
		label7.setPreferredSize(new Dimension(200, 30));
		top.add(label7);
		top.add(jtfLongueurBaseLR);

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
			siege.setAngleAlpha(Double.valueOf(jtfAngleAlphaHauteurButee.getText()));
			siege.setAngleForceTraction(Double.valueOf(jtfAngleBetaForceTraction.getText()));
			siege.setBaseLR(Double.valueOf(jtfLongueurBaseLR.getText()));
			siege.setBrasLM(Double.valueOf(jtfLongueurBrasLB.getText()));
			siege.setMasseMB(Double.valueOf(jtfMasseBrasMB.getText()));
			siege.setMc(Double.valueOf(jtfMasseContrepoidsMC.getText()));
			siege.setMp(Double.valueOf(jtfMasseProjectileMP.getText()));
			System.out.println(siege.toString());
			System.out.println("La construction est-elle viable ?)");
		}
	}

	/**
	 * Redefinition du style formulaire
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
		return jtfAngleAlphaHauteurButee.getText();
	}


	public void setJtf1(JTextField jtf1) {
		this.jtfAngleAlphaHauteurButee = jtf1;
	}


	public String getJtf2() {
		return jtfLongueurBrasLB.getText();
	}


	public void setJtf2(JTextField jtf2) {
		this.jtfLongueurBrasLB = jtf2;
	}


	public String getJtf3() {
		return jtfMasseBrasMB.getText();
	}


	public void setJtf3(JTextField jtf3) {
		this.jtfMasseBrasMB = jtf3;
	}


	public String getJtf4() {
		return jtfAngleBetaForceTraction.getText();
	}


	public void setJtf4(JTextField jtf4) {
		this.jtfAngleBetaForceTraction = jtf4;
	}


	public String getJtf5() {
		return jtfMasseContrepoidsMC.getText();
	}


	public void setJtf5(JTextField jtf5) {
		this.jtfMasseContrepoidsMC = jtf5;
	}


	public String getJtf6() {
		return jtfMasseProjectileMP.getText();
	}


	public void setJtf6(JTextField jtf6) {
		this.jtfMasseProjectileMP = jtf6;
	}


	public String getJtf7() {
		return jtfLongueurBaseLR.getText();
	}


	public void setJtf7(JTextField jtf7) {
		this.jtfLongueurBaseLR = jtf7;
	}
	
	
	
}

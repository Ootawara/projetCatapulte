import javax.swing.SwingUtilities;

import form.Formulaire; 
 
public class Main {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            	new Formulaire();
            }
 
        });
    }
 
}
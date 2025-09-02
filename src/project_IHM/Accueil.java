package project_IHM;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Accueil {
    static JToggleButton accueil;
    static BackgroundPanel bp;

    public Accueil(JPanel CENTER1, JPanel CENTER2, JPanel CENTER3, JPanel CENTER4, JPanel CENTER5, JPanel CENTER6,
            JPanel CENTER7,JPanel CENTER8) {
        accueil = new JToggleButton("Accueil");

        ImageIcon accueilIcon = new ImageIcon("src\\project_IHM\\img\\accueil.jpg");
        Image accueilImage = accueilIcon.getImage();

        bp = new BackgroundPanel(accueilImage, CENTER1);

        accueil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ButtonManager.showButton(Accueil.accueil,Map.map,Divertissement.divertissement,Facture.facture,Service.service);

                PanelManager.showPanel(CENTER1, CENTER2, CENTER3, CENTER4, CENTER5, CENTER6, CENTER7,CENTER8);
            	CENTER1.add(bp); 

            }
        });

    }
}

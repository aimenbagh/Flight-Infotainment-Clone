package project_IHM;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hotesse {

    private JButton valider, disponibilite, profil;
    private JLabel date, heure;

    public Hotesse() {
        JFrame fen = new JFrame();
        fen.setSize(640, 480);
        fen.setTitle("Hotesse");
        
        JPanel panel = new JPanel(new BorderLayout());
        JPanel CENTER = new JPanel(new BorderLayout());
    //    JPanel CENTER = new JPanel(new BorderLayout());
     //   JPanel CENTER = new JPanel(new BorderLayout());
		Border contour = new LineBorder(Color.BLACK,2);
		CENTER.setBorder(contour);
        JPanel dateTimePanel = new JPanel(new GridLayout(1, 2));
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3,10,10));
        panel.setBorder(new EmptyBorder(5, 10, 5, 10));
        
        date = new JLabel("Date: " + new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        heure = new JLabel("Heure: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));

        DefaultTableModel demandes = new DefaultTableModel(100, 4);
        demandes.setColumnIdentifiers(new String[] { "Passager", "Siège","Clase","Demandes" });

        JTable demand = new JTable(demandes);
        JScrollPane demande = new JScrollPane(demand);
           
        demandes.setValueAt("John Doe", 0, 0);
        demandes.setValueAt("A12", 0, 1);
        demandes.setValueAt("Business", 0, 2);
        demandes.setValueAt("Bouteille d'eau /Soupe", 0, 3);
        demandes.setValueAt("Jane Smith", 1, 0);
        demandes.setValueAt("B15", 1, 1);
        demandes.setValueAt("Premium", 1, 2);
        demandes.setValueAt("Une couverture polaire", 1, 3);
        demandes.setValueAt("Alice Williams", 2, 0);
        demandes.setValueAt("C11", 2, 1);
        demandes.setValueAt("Economy", 2, 2);
        demandes.setValueAt("Bouteille d'eau", 2, 3);
        
        valider = new JButton("Valider");
        disponibilite = new JButton("Verifier Disponibilite");
        profil = new JButton("Afficher Profil");

        valider.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(fen, "Validation de la demande...");
            }
        });

        disponibilite.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(fen, "Verification de la disponibilite...");
            }
        });

        profil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(fen, "Affichage du profil...");
            }
        });
    
        dateTimePanel.add(date);
        dateTimePanel.add(heure);
        
        CENTER.add(demande);
        
        buttonPanel.add(valider);
        buttonPanel.add(disponibilite);
        buttonPanel.add(profil);
        
        panel.add(dateTimePanel, BorderLayout.NORTH);
        panel.add(CENTER, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);
        
        fen.add(panel);

        fen.setVisible(true);

        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                heure.setText("Heure: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
            }
        });
        timer.start();
    }

    public static void main(String[] args) {

                new Hotesse();
        
    }
}

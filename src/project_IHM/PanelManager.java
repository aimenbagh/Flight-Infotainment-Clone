package project_IHM;


import javax.swing.JPanel;

public class PanelManager {
    // Méthode pour rendre visible le panel spécifié et rendre invisibles les autres
    public static void showPanel(JPanel panelToShow, JPanel... otherPanels) {
        panelToShow.removeAll();

        panelToShow.revalidate();
        panelToShow.setVisible(true);

        // Rendre invisibles les autres panels
        hideOtherPanels(panelToShow, otherPanels);
    }

    // Méthode pour rendre invisibles les autres panels sauf le panel spécifié
    private static void hideOtherPanels(JPanel panelToKeepVisible, JPanel... otherPanels) {
        for (JPanel panel : otherPanels) {
            if (panel != null && panel != panelToKeepVisible) {
                panel.setVisible(false);
            }
        }
    }
}

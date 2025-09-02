package project_IHM;

import javax.swing.JToggleButton;

public class ButtonManager {
    // Méthode pour rendre visible le panel spécifié et rendre invisibles les autres
    public static void showButton(JToggleButton ButtonpanelToShow, JToggleButton... otherButton) {

    	
    	ButtonpanelToShow.setSelected(true);

        // Rendre invisibles les autres panels
        hideOtherButton(ButtonpanelToShow, otherButton);
    }

    // Méthode pour rendre invisibles les autres panels sauf le panel spécifié
    private static void hideOtherButton(JToggleButton ButtonToKeepVisible, JToggleButton... otherButton) {
        for (JToggleButton Button : otherButton) {
            if (Button != null && Button != ButtonToKeepVisible) {
            	Button.setSelected(false);
            }
        }
    }
}

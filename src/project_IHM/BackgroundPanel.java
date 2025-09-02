package project_IHM;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class BackgroundPanel extends JPanel
{
    private Image background;
    private JPanel parent;
 
    public BackgroundPanel(Image background, JPanel parent)
    {
        this.background = background;
        this.parent = parent;
        setLayout( new BorderLayout() );
    }
 
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
 
        //g.drawImage(background, 0, 0, null); // image full size
        g.drawImage(background, 0, 0, getWidth(), getHeight(), null); // image scaled
    }
 
    @Override
    public Dimension getPreferredSize()
    {
        return new Dimension(parent.getWidth(), parent.getHeight());
    }
}

class ViewFacade {
// ... code removed ...
public void mousePressed(MouseEvent e) {
        selectedView.selectHandle(e.getX(), e.getY());
    }

    public void mouseDragged(MouseEvent e) {
        if (selectedView.moveSelected(e.getX(), e.getY()))
        {
            panel.repaint();
        }
    }

    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2)
        {
            if (selectedView == sectorView)
            {
                if (selectedView.switchRotationDirection(e.getX(), e.getY()))
                {
                    panel.repaint();
                }
            }
        }
    }
// ... code removed ...
}

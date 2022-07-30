package by.bsu.tp.shapes;

import java.awt.*;

public class Line extends Segment {
    public Line(Color borderColor, Point theCenter, Color fillColor, Point p) {
        super(borderColor, theCenter, fillColor, p);
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(getBorderColor());

        double dist = Math.hypot(getTheCenter().x - getP().x, getTheCenter().y - getP().y);
        if (dist == 0) return;
        double xProj = (getP().x - getTheCenter().x) / dist;
        double yProj = (getP().y - getTheCenter().y) / dist;
        double newDist = 10000;

        g2d.setStroke(getStroke());
        g2d.setColor(getBorderColor());
        g2d.drawLine(getTheCenter().x - (int) (newDist * xProj),
                getTheCenter().y - (int) (newDist * yProj),
                getTheCenter().x + (int) (newDist * xProj),
                getTheCenter().y + (int) (newDist * yProj));

    }
}

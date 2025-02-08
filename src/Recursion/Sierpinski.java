import java.awt.*;

public class Sierpinski {

    /*
            C
            /\
           /  \
     M_AC /____\ M_BC
         /\    /\
        /  \  /  \
       /____\/____\
      A    M_AB    B
     */
    public static void sierpinski(Graphics g, int n, Point A, Point B, Point C) {
        if (n > 0) {
            // figure out the midpoints
            Point M_AC = new Point((A.x + C.x)/2, (A.y + C.y)/2);
            Point M_AB = new Point((A.x + B.x)/2, (A.y + B.y)/2);
            Point M_BC = new Point((B.x + C.x)/2, (B.y + C.y)/2);

            // draw the middle triangle
            int[] xPoints = {M_AC.x, M_AB.x, M_BC.x};
            int[] yPoints = {M_AC.y, M_AB.y, M_BC.y};
            g.fillPolygon(xPoints, yPoints, 3);

            // recursively draw the sub triangles
            sierpinski(g, n - 1, A, M_AB, M_AC); // left sub triangle
            sierpinski(g, n - 1, M_AB, B, M_BC); // right sub triangle
            sierpinski(g, n - 1, M_AC, M_BC, C); // top sub triangle
        }
    }

    public static void main(String[] args) {
        int width = 800, height = 800;
        DrawingPanel panel = new DrawingPanel(width, height);
        Graphics g = panel.getGraphics();
        Point A = new Point(20, height - 20);
        Point B = new Point(width - 20, height - 20);
        Point C = new Point(width/2, 20);
        sierpinski(g, 20, A, B, C);
    }
}
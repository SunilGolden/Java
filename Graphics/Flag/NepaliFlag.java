import java.awt.*;
import javax.swing.*;

public class NepaliFlag extends JFrame {

	public NepaliFlag() {
		setTitle("Nepali Flag");
		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {

		// Flag border
		int[] x2 = {100-20, 350+50, 170+40, 350+40, 100-20};
		int[] y2 = {100-40, 300+20, 300+20, 500+20, 500+20};
		Polygon flagBorder = new Polygon(x2, y2, 5);
		g.setColor(new Color(0, 56, 147));
		g.fillPolygon(flagBorder);

		// Flag body
		int[] x1 = {100, 350, 170, 350, 100};
		int[] y1 = {100, 300, 300, 500, 500};
		Polygon flagBody = new Polygon(x1, y1, 5);
		g.setColor(new Color(220, 20, 60));
		g.fillPolygon(flagBody);

		// Moon
		g.setColor(Color.WHITE);
		g.fillOval(130, 195, 90, 90);
		g.setColor(new Color(220, 20, 60));
		g.fillOval(130, 175, 90, 90);
		g.setColor(Color.WHITE);
		g.fillOval(150, 220, 50, 50);

		// Sun
		int[] x4 = {150, 160, 170, 160, 190, 180, 170, 150, 140, 130, 140, 150, 140, 130, 140};
		int[] y4 = {350, 360, 370, 390, 400, 410, 420, 430, 420, 410, 400, 390, 380, 370, 360};
		Polygon sun = new Polygon(x4, y4, 15);
		g.setColor(Color.WHITE);
		//g.fillPolygon(sun);

		g.setColor(Color.WHITE);
		g.fillOval(130, 370, 90, 90);
	}

	public static void main(String[] args) {
		NepaliFlag nepaliflag = new NepaliFlag();
	}
}

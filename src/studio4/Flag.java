package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(255, 172, 28);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.4);
		
		StdDraw.setPenColor(106, 90, 205);
		StdDraw.filledEllipse(0.5, 0.5, 0.5, 0.4);
		
		StdDraw.setPenColor(Color.WHITE);
		double[] x = { 0.5, 0.25, 0.5, 0.75 };
		double[] y = { 0.5, 0.4, 0.6, 0.4 };
		StdDraw.filledPolygon(x, y);

	}
}
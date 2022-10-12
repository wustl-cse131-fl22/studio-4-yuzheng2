package studio4;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import support.cse131.DialogBoxes;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class NorwayMotherOfAllFlags {
	private static void mother() {
		StdDraw.clear();
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(3, 3, 3, 3);
		StdDraw.filledRectangle(3, 13, 3, 3);
		StdDraw.filledRectangle(16, 3, 6, 3);
		StdDraw.filledRectangle(16, 13, 6, 3);
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(11, 8, 11, 1);
		StdDraw.filledRectangle(8, 8, 1, 8);
	}

	public static void norway() {
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		mother();
	}

	public static void france() {
		
		// TODO
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(11, 8, 11, 8);
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(22 - 11.0/3, 8, 11.0/3, 8);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(11, 8, (double) 11/3, 8);

	}

	public static void indonesia() {
		
		// TODO
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(11, 8, 11, 8);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(11, 4, 11, 4);

	}

	public static void netherlands() {
		
		// TODO
		/* StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(11, 16 - 8/3.0, 11, 8/3.0);
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(11, 8, 11, 8/3.0);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(11, (double) 16/6, 11, 8/3.0); */
		
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(11, 16 - 8/3.0, 11, 8/3.0);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(11, 8, 11, 8/3.0);
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(11, (double) 16/6, 11, 8/3.0);
	}

	public static void poland() {
		
		// TODO
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(11, 8, 11, 8);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(11, 1, 11, 8);

	}

	public static void thailand() {
		
		// TODO
	}

	public static void finland() {
		
		// TODO
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			int canvasHeight = 512;
			int canvasWidth = 22 * canvasHeight / 16;
			StdDraw.setCanvasSize(canvasWidth, canvasHeight);
			Object[] options = { "Continue", "Exit" };
			while (true) {
				norway();
				if (DialogBoxes.askUser("Continue to Flag of France?", "Current: Norway", JOptionPane.QUESTION_MESSAGE,
						options)) {
					france();
					if (DialogBoxes.askUser("Continue to Flag of Indonesia?", "Current: France",
							JOptionPane.QUESTION_MESSAGE, options)) {
						indonesia();
						if (DialogBoxes.askUser("Continue to Flag of Netherlands?", "Current: Indonesia",
								JOptionPane.QUESTION_MESSAGE, options)) {
							netherlands();
							if (DialogBoxes.askUser("Continue to Flag of Poland?", "Current: Netherlands",
									JOptionPane.QUESTION_MESSAGE, options)) {
								poland();
								if (DialogBoxes.askUser("Continue to Flag of Thailand?", "Current: Poland",
										JOptionPane.QUESTION_MESSAGE, options)) {
									thailand();
									if (DialogBoxes.askUser("Continue to Flag of Finland?", "Current: Thailand",
											JOptionPane.QUESTION_MESSAGE, options)) {
										finland();
										if (DialogBoxes.askUser("Exit?", "Current: Finland")) {
											// pass
										} else {
											continue;
										}
									}
								}
							}
						}
					}
				}
				System.exit(0);
			}
		});
	}
}

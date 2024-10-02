package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
//		JFileChooser chooser = new JFileChooser("resources");
//		chooser.showOpenDialog(null);
		File f = new File("resources/ellipse_purple_outlined.txt");
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameter1 = in.nextDouble();
		double parameter2 = in.nextDouble();
		double parameter3 = in.nextDouble();
		double parameter4 = in.nextDouble();
		
		
		while(isFilled) {
			//double x = in.nextDouble();
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			StdDraw.filledRectangle(parameter1, parameter2, parameter3, parameter4);
		}
		while (!isFilled) {
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			StdDraw.rectangle(parameter1, parameter2, parameter3, parameter4);
		}
		
	}
}

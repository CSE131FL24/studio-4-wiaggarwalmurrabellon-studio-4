package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color washu = new Color(212,27,19);
		StdDraw.setPenColor(washu);
		StdDraw.filledRectangle(0.5, 0.5, 0.45, 0.25);
		
		Color brown = new Color(181,135,117);
		StdDraw.setPenColor(brown);
		StdDraw.filledCircle(.5, 0.45, 0.15);
		StdDraw.filledCircle(.41,.58, .045);
		StdDraw.filledCircle(.59,.58, .045);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(.45, .50 , .01 );
		StdDraw.filledCircle(.55, .50 , .01 );
		StdDraw.filledCircle(.5, 0.45, 0.025);
		StdDraw.arc(.5, .45, .1, 210, 330 );
		
	}
}
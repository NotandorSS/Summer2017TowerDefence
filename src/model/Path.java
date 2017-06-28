package model;

import java.awt.Rectangle;

public class Path {
	//Contains either:
		//a) a set of lines
		//b) a set of directions
	/*
	 * Set of lines: Tower placement can not be within x distance of any line
	 * 				 Enemies follow line till end, look perpendicular directions for next line
	 * Set of directions: Would need a list of rectangles for placement
	 * 					  Enemies could potentially stray off path if not lined up correctly
	 * Doing a 2d array would eliminate this problem.....
	 */
	
	public boolean intersects(Rectangle r){
		/*
		 * Look at lines or compare rectangles here
		 */
		return false;
	}
}

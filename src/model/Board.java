package model;

import java.awt.Rectangle;
import java.util.ArrayList;

import enums.TOWER;

public class Board {
	//board has arrayList? of towers, game starts with none.
	//board has levels, which have enemies.
	//board has path, where enemies travel and towers can't be placed
	ArrayList <Tower> towers = new ArrayList<Tower>();
	Path path = new Path();
	
	//TODO: constructor - parameter of path? path maybe an enum?
	
	/**
	 * Places tower on board
	 * 
	 * @param type
	 * @return true if tower is place, false if not
	 */
	public boolean placeTower(TOWER type, int x, int y){
		//TODO figure out how to add position as well?
		Rectangle tempBounds = new Rectangle(x, y, type.width, type.height);
		if (this.intersects(tempBounds)){
			return false;
		}
		Tower t = new Tower(type, x, y);
		towers.add(t);
		return true;
	}
	
	/**
	 * Determines if there's an intersection between r and everything else on the board
	 * @param r
	 * @return true if there's an intersection, false if not
	 */
	private boolean intersects(Rectangle r){
		for (Tower t: towers){
			if (r.intersects(t.bounds)){
				return true;
			}
		}
		//TODO: check path
		return path.intersects(r);
	}
}

package model;

import enums.TOWER;

public class Tower extends Construct{
	TOWER type;
	
	public Tower(TOWER type, int x, int y){
		this.type = type;
		this.bounds.x = x;
		this.bounds.y = y;
	}
}

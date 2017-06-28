package enums;

public enum TOWER {
	//Don't know for sure if we need this or not but figured I'd put it here
TYPE1(10, 10), TYPE2(10, 10), TYPE3(10, 10);
	public final int width;
	public final int height;
	
	private TOWER (int w, int h){
		width = w;
		height = h;
	}
}

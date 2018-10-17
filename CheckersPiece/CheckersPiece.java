package CheckersPiece;

public class CheckersPiece{
	private String color;
	private int xPos,yPos;
	private int[] xSpot = {1,3,5,7,0,2,4,6,1,3,5,7};
	
	enum Color {R,B}
	
	public void makePiece(String x, int y, int z){
		setColor(x);
		setPos(y,z);
	}

	public void setColor(String x){
		color = x;	
	}

	public String getColor(){
		return color;
	}
	
	public void setPos(int x, int y){
		xPos = x;
		yPos = y;	
	}
	
	public int getxPos(){
		return xPos;
	}
	
	public int getyPos(){
		return yPos;
	}
	
	public int getxSpot(int x){
		return xSpot[x];	
	}
	public void printPiece(){
		System.out.println(color + xPos + yPos);	
	}
	
}
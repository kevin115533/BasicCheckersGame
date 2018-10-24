package CheckersPiece;

public class CheckersPiece{
	private Color color;
	private int id;
	
	public CheckersPiece(Color x, int y){
		setColor(x);
		setId(y);
	}
	
	public void setId(int x){
		id = x;	
	}

	public void setColor(Color x){
		color = x;	
	}

	public Color getColor(){
		return color;
	}
	

	public void printPiece(){
		System.out.println(id);	
	}
	
}
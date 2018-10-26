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

	public void getColor(){
		System.out.print(color);
	}
	
	public int getId(){
		return id;	
	}

	public void printPieceId(){
		System.out.print(id);	
	}
	
}
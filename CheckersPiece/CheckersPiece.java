package CheckersPiece;

public class CheckersPiece{
	private Color color;
	private int id;
	private int row =0;
	private int column = 0;
	
	
	/*public CheckersPiece(Color x, int y){
		setColor(x);
		setId(y);
	}*/
	
	public CheckersPiece(Color x, int y, int a, int b){
		setColor(x);
		setId(y);
		setCoors(a,b);
	}
	
	public void setCoors(int x, int y){
		row = x;	
		column = y;
	}
	
	public void setId(int x){
		id = x;	
	}

	public void setColor(Color x){
		color = x;	
	}
	
	public int getRow(){
		return row;	
	}
	
	public int getColumn(){
		return column;	
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
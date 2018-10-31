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
		setRow(a);
		setColumn(b);
	}
	
	public void setId(int x){
		id = x;	
	}

	public void setColor(Color x){
		color = x;	
	}

	public void setRow(int x){
			row = x;
	}
	
	public void setColumn(int x){
			column = x;
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
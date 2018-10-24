package Board;
import CheckersPiece.*;
public class Board{
	
	private CheckersPiece[][] board = new CheckersPiece[8][8];
	private boolean validSpot = true;
	
	public Board(){
		for(int i = 0;i<8;i++){
				for(int j = 0;j<8;j++){
				setSpot(i,j,null);
				if(i == 0 | i == 2 | i == 4 | i == 6){
					if(j == 0 | j == 2 | j == 4 | j == 6){
					setValidSpot(false);}
				}
				if(i == 1 | i == 3 | i == 5 | i == 7){
					if(j == 1 | j == 3 | j == 5 | j == 7){
					setValidSpot(false);}
				}
				}
			}	
	}
	
	public void printBoard(){
		System.out.println("   A  B  C  D  E  F  G  H");
		System.out.println("   0  1  2  3  4  5  6  7");
		for(int i = 0; i<8;i++){
			System.out.print(i + "|");
			for(int j=0;j<8;j++){
				if(board[i][j] != null){
				System.out.print(board[i][j]);
				}
				if(board[i][j] == null){
				System.out.print("__|");	
				}
			}
			System.out.print("\n");
		}
		System.out.println("   A  B  C  D  E  F  G  H");
		System.out.println("   0  1  2  3  4  5  6  7");
	}
	
	public void setSpot(int x, int y,CheckersPiece z){
				board[y][x]=z;
			}
	
	public void setValidSpot(boolean x){
		validSpot = x;	
	}
	
	public boolean checkValid(){
		return validSpot;	
	}
	
	/*public Color getColor(){
		return CheckersPiece.getColor();	
	}*/
	
	/*public void makeMove(char z, int y, String a){
		int x = 0;
		switch (z){
			case 'a' | 'A':
				x = 0;
				break;
			case 'b' | 'B':
				x = 1;
				break;
			case 'c' | 'C':
				x = 2;
				break;
			case 'd' | 'D':
				x = 3;
				break;
			case 'e' | 'E':
				x = 4;
				break;
			case 'f' | 'F':
				x = 5;
				break;
			case 'g' | 'G':
				x = 6;
				break;
			case 'h' | 'H':
				x = 7;
				break;
		}
		board[x][y] = a;
		
	}*/
	
	
}
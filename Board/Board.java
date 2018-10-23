package Board;

public class Board{
	private String[][] board = new String[8][8];
	
	public void printBoard(){
		System.out.println("   A  B  C  D  E  F  G  H");
		for(int i = 0; i<8;i++){
			System.out.print(i + "|");
			for(int j=0;j<8;j++){
			System.out.print(board[i][j]+"|");	
			}
			System.out.print("\n");
		}
		System.out.println("   A  B  C  D  E  F  G  H");
	}
	
	public void setSpot(int x, int y,String z){
				board[y][x]=z;
			}
	
	public void makeMove(char z, int y, String a){
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
		
	}
	
	
}
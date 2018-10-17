package Board;

public class Board{
	private String[][] board = new String[8][8];
	
	public void printBoard(){
		System.out.println("  A  B  C  D  E  F  G  H");
		for(int i = 0; i<8;i++){
			System.out.print((8-i) + "|");
			for(int j=0;j<8;j++){
			System.out.print(board[i][j]+"|");	
			}
			System.out.print("\n");
		}
		System.out.println("  A  B  C  D  E  F  G  H");
	}
	
	public void setSpot(int x, int y,String z){
				board[y][x]=z;
			}
		
	
	
}
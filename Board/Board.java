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
		System.out.println("   A   B   C   D   E   F   G   H");
		//System.out.println("   0   1   2   3   4   5   6   7");
		for(int i = 0; i<8;i++){
			System.out.print(" |   |   |   |   |   |   |   |   |\n");
			System.out.print(i + "|");
			for(int j=0;j<8;j++){
				if(board[i][j] != null){
					if(board[i][j].getId()<10){
						System.out.print("_");
						board[i][j].getColor();	
						board[i][j].printPieceId();
						System.out.print("|");
					}
					if(board[i][j].getId()>9){
						board[i][j].getColor();	
						board[i][j].printPieceId();
						System.out.print("|");
					}
				}
				if(board[i][j] == null){
				System.out.print("___|");	
				}
			}
			System.out.print("\n");
			
		}
		System.out.println("   A   B   C   D   E   F   G   H");
		//System.out.println("   0   1   2   3   4   5   6   7");
	}
	
	public void setSpot(int y, int x,CheckersPiece z){
				board[x][y]=z;
			}
	

	public void setSpot(CheckersPiece z){
				int x = z.getRow();
				int y = z.getColumn();
				board[x][y]=z;
			}
	
	public void setSpotNull(CheckersPiece z){
				int x = z.getRow();
				int y = z.getColumn();
				board[x][y]=null;
	}
	
	public void setValidSpot(boolean x){
		validSpot = x;	
	}
	
	public boolean checkValid(){
		return validSpot;	
	}
	
	public int charConvert(char a){
		int x = 0;
		switch (a){
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
		return x;
	}
	
}
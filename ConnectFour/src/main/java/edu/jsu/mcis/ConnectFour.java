package edu.jsu.mcis;

public class ConnectFour {
    public enum Token { RED, BLACK, EMPTY }
    public enum Result { NONE, RED_WIN, BLACK_WIN, TIE }
    public static final int COLUMNS = 7;
    private final int ROWS = 6;
    private Token[][] board;
    private boolean redTurn;
    
    public ConnectFour() {
        board = new Token[ROWS][COLUMNS];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                board[i][j] = Token.EMPTY;
            }
        }
        redTurn = true;
    }
    
    public Token getTopOfColumn(int col) {
		board = new Token [0][0];
		for((int i = 0; i < 0; i++) {
			for(int j = 0; j < 0; j++) {
				grid[i][j] = " ";
		
        return Token.EMPTY;
    }
    
    public int getHeightOfColumn(int col) {
		if(Column1 [1][1] = " "; i ++)
		else (Column2 [1][2] = " "; i ++) 
		else (Column3 [1][3] = " "; i ++) 
		else (Column4 [1][4] = " "; i ++) 
		else (Column5 [1][5] = " "; i ++) 
		else (Column6 [1][6] = " "; i ++) 
		else (Column7 [1][1] = " "; i ++) 
		else (Column8 [1][8] = " "; i ++) 
		else (Column9 [1][9] = " "; i ++) 
		else (Column10 [1][2] = " "; i ++) 
		else (Column11 [1][2] = " "; i ++) 
		else (Column12 [1][2] = " "; i ++) 
		else (Column13 [1][2] = " "; i ++) 
		else (Column14[1][2] = " "; i ++) 
        return -1;
    }
    
    public boolean dropTokenInColumn(int col) {
		board = new Token[0][4];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				grid[i][j] = " ";
        return False;
    }
    
    public Result getResult() {
		if(getResult() != getResult.CONTINUE) {
				String winner = "Tied Game";
				if(result == getResult.Red_WINS) winner = "Red";
				else if(result == getResult.Black_WINS) winner = "Black";
				System.out.println("Game is over!");
				System.exit(0);
        return Result.TIE;
    }
    
    
    // Here are a couple of private methods to give you
    // an idea of a more clever way to determine winners.
    private boolean doesRedWinVerticallyInColumn(int col) {
        String columnString = makeStringFromColumn(col);
        return (columnString.indexOf("RRRR") >= 0);
		
    }
    
    private String makeStringFromColumn(int col) {
        String s = "";
        for(int row = 0; row < ROWS; row++) {
            if(board[row][col] == Token.RED) s += "R";
            else if(board[row][col] == Token.BLACK) s += "B";
            else s += " "; 
        }
        return s;
    }
}













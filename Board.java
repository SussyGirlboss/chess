public class Board  {

  // Turn 1 means it is currently white's turn
  // Turn 2 means it is currently black's turn
  private int turn = 1;

  private Piece[][] board = new Piece[8][8];

  // Constructor
  // Initialize a board with pieces at the proper start positions
  public Board() {
    for(int i = 0; i < 2; i++) {
      for(int j = 0; j < 8; j++) {
        board[i][j] = new Queen(2);
      }
    }

    for(int i = 6; i < 8; i++) {
      for(int j = 0; j < 8; j++) {
        board[i][j] = new Queen(1);
      }
    }
  }

  public String toString() {
    String display = "|-------------------------------|\n";
    for(int i = 0; i < 8; i++) {
      display += "| ";
      for(int k = 0; k < 8; k ++) {
        if(board[i][k] != null) {
          display += board[i][k].getUnicode() + " | ";
        } else {
          display += "  | ";
        }
      }
      display += "\n";
      display += "|";
      for(int j = 0; j < 31; j++) {
        display += "-";
      }
      display += "|\n";
    }
    return display;
  }

}
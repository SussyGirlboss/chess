public class Queen implements Piece {

  // team must be 1 or 2,
  // Team 1 is white, team 2 is black
  private int team;

  // Board in which the piece is playing on
  private Piece[][] board;

  public Queen(int team) {
    this.team = team;
  }

  public int getTeam() {
    return this.team;
  }

  public char getUnicode() {
    if(this.team == 1) 
      return '\u2655';
    else 
      return '\u265B';
  }

  // Checks if an attempted move is legal.
  // row represents current row piece resides,
  // col represents current column.
  public boolean isLegal(int row, int col) {
    if(this.team == 1) {
      // Must check board
      // Add unit tests, this can be finicky
      return true;
    }
    else {
      return true;
    }
  }



}

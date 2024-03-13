public class Queen implements Piece {

  // team must be 1 or 2,
  // Team 1 is white, team 2 is black
  private int team;

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

  public boolean isLegal() {
    return true;
  }



}

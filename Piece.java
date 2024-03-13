interface Piece {

  int getTeam();
  
  char getUnicode();

  boolean isLegal(int row, int col);

}

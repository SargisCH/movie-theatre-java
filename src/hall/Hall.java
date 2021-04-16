package hall;

public class Hall {
  int rowCount = 5;
  int seatCount = 5;
  private int rowNumberPositionX = 0;
  private int rowNumberPositionY = 2;
  private int lastSeatPosition = 4;
  private int busySeatX = 2; 
  private int busySeatY = 2; 
  public void draw (){
    String seatRow = "";
    SeatSquare seatSquare = new SeatSquare();
    boolean isBusy = false;
    for(int row = 0; row < rowCount; row++){
      for(int seatPart = 0; seatPart < 5; seatPart++){
        for(int seat = 0; seat < seatCount; seat++){
          isBusy = false;
          if(seat == rowNumberPositionX){
            if(seatPart == rowNumberPositionY){
              int rowNumber = row + 1;
              seatRow +=  rowNumber + " ";
            }else {
              seatRow += "  ";
            }
          }
          if(seat == busySeatY && row == busySeatX){
            isBusy = true;
          }
          seatRow += seatSquare.buildPart(seatPart, isBusy, seat + 1);
          if( seat == lastSeatPosition) seatRow += "\n";
          else seatRow += " ";
        }
      }
    }   
    System.out.println(seatRow);
  }
}

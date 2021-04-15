package seat;

public class Seat {
  private boolean busy = false;
 
  public boolean isBusy(){
    return busy;
  }
  public String draw (){
    // for(int seat = 0; seat < 5; seat++){
    //   String seatString = "";
    //   for(int row = 0; row < 5; row++){
    //     for (int col = 0; col < 11; col++ ){
    //         if(row == 0 || row == 4 || col == 0 || col == 10){
    //             seatString += "*";
    //         }else if(row ==2 && col == 5){
    //             seatString += "x";
    //         }else {
    //             seatString += " ";
    //         }
    //     }
    //     if(row < 4) seatString += "\n";
    //   }
    //   System.out.print(seatString);
    // }
    // System.out.println();
    String seatRow = "";
    for(int row = 0; row < 10; row++){
      for(int seatPart = 0; seatPart < 5; seatPart++){
        for(int seatCount = 0; seatCount < 10; seatCount++){
          if(seatPart == 0 || seatPart == 4){
            String line = buildSeatFirstLine();
            seatRow += seatCount == 9 ? line + "\n" : line + " ";
          }else {
            String line = buildSeatMiddleLine(row == 1 && seatCount == 3 && seatPart == 2 ? true : false);
            seatRow += seatCount == 9 ? line + "\n" : line + " ";
          }
        }
      }
    }
      
   
    System.out.println(seatRow);

  return "";  
  }

  public String buildSeatFirstLine(){
    String line = "";
    for(int border = 0; border < 11; border++){
      line += "*";
    }
    return line;
  }
  public String buildSeatMiddleLine(boolean busy){
    String line = "";
    for(int border = 0; border < 11; border++){
      if(border == 0 || border == 10) line += "*";
      else if(border == 5 && busy) line += "x";
      else line += " ";
    }
    return line;
  }
}

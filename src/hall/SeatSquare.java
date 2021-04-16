package hall;
public class SeatSquare {
  private int firstLine = 0;
  private int endLine = 4;
  private int middleLine = 2;
  private String RED_COLOR = "\033[0;31m";
  private String RESET_COLOR = "\033[0m";
  public String buildPart(int seatPart, boolean isBusy, int seat){
    if(seatPart == firstLine || seatPart == endLine) return buildSeatBorderLine();
    else if(seatPart == middleLine) return buildSeatMiddleLine(isBusy, seat);
    else return buildSeatNestedLine();

  }

  private String buildSeatBorderLine(){
    String line = "";
    for(int lineChar = 0; lineChar < 11; lineChar++){
      line += "*";
    }
    return line;
  }
  private String buildSeatNestedLine(){
    String line = "";
    for(int lineChar = 0; lineChar < 11; lineChar++){
      if(lineChar == 0 || lineChar == 10) line += "*";
      else line += " ";
    }
    return line;
  }
  private String buildSeatMiddleLine(boolean busy, int seat){
    String line = "";
    for(int lineChar = 0; lineChar < 11; lineChar++){
      if(lineChar == 0 || lineChar == 10) line += "*";
      else if(lineChar == 5){
        if(busy) line += RED_COLOR + seat + RESET_COLOR;
        else line += seat;
      }
      else line += " ";
    }
    return line;
  }
}

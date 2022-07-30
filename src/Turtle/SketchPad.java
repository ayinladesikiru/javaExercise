package Turtle;

public class Sketchpad {

private int[][] floor;

public Sketchpad(int floorRow, int floorColumn){
    floor = new int [floorRow] [floorColumn];
}

@Override
    public String toString() {
    String toBeReturned = "";


    for (var row : floor) {
        for (var column : row) {
            if (column == 0) toBeReturned += "  ";
            if (column == 1) toBeReturned += "* ";
        }
        toBeReturned += "  ";
    }
    return toBeReturned;
}

public int[][] getFloor(){
    return floor;
}

}

package Task3;

public class Room {
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    public Room(int numberOfDoors, int numberOfLamps, int numberOfWindows) {
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public int getNumberOfLamps() {
        return numberOfLamps;
    }
    public int getNumberOfWindows() {
        return numberOfWindows;
    }
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    public void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
    }
    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }
}

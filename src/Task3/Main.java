// Task 3
package Task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
      ArrayList<Room> rooms = new ArrayList<>(); // declare a local ArrayList for the rooms I want to add to my building
      Building building;
      Room conferenceRoom = new Room(3,10,2); // Initializes three rooms
      Room lunchRoom = new Room(4,8,8);
      Room openOffice = new Room(7,18,6);

      // Adds the rooms to my local ArrayList rooms
      rooms.add(conferenceRoom);
      rooms.add(lunchRoom);
      rooms.add(openOffice);

      building = new Building(rooms,4,5,false); // instantiate a new building
      System.out.println("Number of lamps in the building: "+countLampsInBuilding(building));
      System.out.println("Number of doors in the building: "+countDoorsInBuilding(building));
      System.out.println("Number of windows in the building: "+countWindowsInBuilding(building));

      // Just playing with the methods
      building.getRooms().get(0).setNumberOfDoors(9); // Just playing with the methods
      System.out.println("Number of doors in room number 1 has been changed to "+building.getRooms().get(0).getNumberOfDoors());
      System.out.println("Number of doors in the building in now: "+countDoorsInBuilding(building));

      if(isNormal(building)) {
        System.out.println("This is not an odd building!"); // I couldn't just write 'true'
      }
    }

    // Counting number of lamps in the building
    static int countLampsInBuilding(Building building) { // Counting number of lamps in the building
        int numberOfLamps = 0;
        for(Room room : building.getRooms()) {
            numberOfLamps += room.getNumberOfLamps();
        }
        return numberOfLamps;
    }

    // Counting number of doors
    static int countDoorsInBuilding(Building building) {
        int numberOfDoors = 0;
        for(Room room : building.getRooms()) {
            numberOfDoors += room.getNumberOfDoors();
        }
        return numberOfDoors;
    }

    // Counting number of windows
    static int countWindowsInBuilding(Building building) { // Counting number of windows
        int numberOfWindows = 0;
        for(Room room : building.getRooms()) {
            numberOfWindows += room.getNumberOfWindows();
        }
        return numberOfWindows;
    }

    // Checking if the numberOfFloors are bigger than the number of rooms in the building
    static boolean isNormal(Building building) {
        if(building.getNumberOfFloors()>building.getRooms().size()) {
            return true;
        } else {
            System.out.println("This is an odd building");
            return false;
        }
    }
}

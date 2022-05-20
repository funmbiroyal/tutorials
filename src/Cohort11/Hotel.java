package Cohort11;

public class Hotel {
    private String[] rooms;

    public Hotel(int numberOfRooms) {
        this.rooms = new String[numberOfRooms];
    }

    public String[] getRooms() {
        return rooms;
    }

    public String bookRoom(String name) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = name;
                return "Booked Successfully by " + name;
            }
        }
        return "All rooms are booked";
    }

    public String getRoomGuest(int roomNumber) {
        return rooms[roomNumber - 1];
    }

    public void checkout(int roomNumber) {
        rooms[roomNumber - 1] = null;
    }
}

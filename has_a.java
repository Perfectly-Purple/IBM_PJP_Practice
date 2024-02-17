class Room {
    private int rooms;

    Room(int numRooms) {
        rooms = numRooms;
    }

    int getRooms() {
        return rooms;
    }
}

class House{
    private String type;
    private Room rooms;

    House(String houseType, int numRooms) {
        type = houseType;
        rooms = new Room(numRooms);
    }
    
    void display(){
        System.out.println(type + " has "+ rooms.getRooms()+" room(s).");
    }
}

public class has_a {
    public static void main(String args[])
    {
        House house=new House("Villa",6);
        house.display();
    }
}

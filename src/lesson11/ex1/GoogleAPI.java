package lesson11.ex1;

public class GoogleAPI implements API {
    private Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] firstArray = new Room[rooms.length];

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() == price &&
                    rooms[i].getPerson() == persons &&
                    rooms[i].getCityName() == city &&
                    rooms[i].getHotelName() == hotel)

                firstArray[i] = rooms[i];
        }
        
        System.out.println("GoogleAPI  was called...");

        return deleteNull(firstArray);
    }

    @Override
    public Room[] getAll() {
        Room[] roomsGetAll = new Room[rooms.length];
        for (int i = 0; i < rooms.length; i++) {
            roomsGetAll[i] = rooms[i];
        }

            return roomsGetAll;
    }

    public Room[] deleteNull(Room[] firstArray) {

        int count = 0; // Счетчик не null ячеек
        for (Room el : firstArray) {
            if (el != null)
                count++;
        }

        Room[] arrayWithoutNull = new Room[count];
        int count1 = 0; // Счетчик результирующего массива без нал ячеек
        for (Room el : firstArray) {
            if (el != null) {
                arrayWithoutNull[count1] = el;
                count1++;
            }
        }

        return arrayWithoutNull;
    }
}

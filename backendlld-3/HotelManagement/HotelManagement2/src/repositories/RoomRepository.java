package repositories;

import models.Room;
import models.RoomType;

import java.util.List;

public interface RoomRepository {
    // add Room
    Room add(Room room);
    // get all rooms
    List<Room> getRooms();
    // get Rooms based on room Type
    List<Room> getRoomByRoomType(RoomType roomType);
    // save room to memory repositories
    Room save(Room room);
}

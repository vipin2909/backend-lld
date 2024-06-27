package repositories;

import models.Room;
import models.RoomType;

import java.util.List;

public interface RoomRepository {
    Room addRoom(Room room);
    List<Room> getRooms();
    List<Room> getRoomByRoomType(RoomType roomType);
    Room save(Room room);
}

package services;

import models.Room;
import models.RoomType;

import java.util.List;

public interface RoomService {
    List<Room> getRooms(String roomType);
}

package services;

import models.Room;
import models.RoomType;
import repositories.RoomRepository;

import java.util.List;

public class RoomServiceImpl implements RoomService {

    private RoomRepository roomRepository;
    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }
    @Override
    public List<Room> getRooms(String roomType) {
        if(roomType == null) {
            return roomRepository.getRooms();
        }
        else
            return roomRepository.getRoomByRoomType(RoomType.valueOf(roomType));
    }
}

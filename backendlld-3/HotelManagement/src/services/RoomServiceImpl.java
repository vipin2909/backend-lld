package services;

import exceptions.UnAuthorizedAccessException;
import exceptions.UserNotFoundException;
import models.Room;
import models.RoomType;
import models.User;
import models.UserType;
import repositories.RoomRepository;
import repositories.UserRepository;

import java.util.Optional;

public class RoomServiceImpl implements RoomService {


    private RoomRepository roomRepository;
    private UserRepository userRepository;

    public RoomServiceImpl(RoomRepository roomRepository, UserRepository userRepository) {
        this.roomRepository = roomRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Room addRoom(long userId, String roomName, double price, String roomType, String description) throws UserNotFoundException, UnAuthorizedAccessException {
        Optional<User> optionalUser = userRepository.findById(userId);
        if(optionalUser.isEmpty()) {
            throw new UserNotFoundException("User not found");
        }

        User user = optionalUser.get();
        if(!user.getUserType().equals(UserType.ADMIN)) {
            throw new UnAuthorizedAccessException("User is not an admin");
        }

        Room room = new Room();
        room.setName(roomName);
        room.setRoomType(RoomType.valueOf(roomName));
        room.setPrice(price);
        room.setDescription(description);
        roomRepository.addRoom(room);
        return room;
    }
}

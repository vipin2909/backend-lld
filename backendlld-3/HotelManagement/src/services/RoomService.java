package services;

import exceptions.UnAuthorizedAccessException;
import exceptions.UserNotFoundException;
import models.Room;

public interface RoomService {
    Room addRoom(long userId, String roomName, double price, String roomType, String description) throws UserNotFoundException, UnAuthorizedAccessException;
}

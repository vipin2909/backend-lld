package dtos;

import models.Room;

import java.util.List;

public class GetRoomResponseDto {
    private List<Room> rooms;
    private ResponseStatus responseStatus;

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}

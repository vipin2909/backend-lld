package controllers;

import dtos.GetRoomRequestDto;
import dtos.GetRoomResponseDto;
import dtos.ResponseStatus;
import models.Room;
import services.RoomService;

import java.util.List;

public class RoomController {

    private RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    public GetRoomResponseDto getRooms(GetRoomRequestDto requestDto) {
        GetRoomResponseDto responseDto = new GetRoomResponseDto();
        try {
            List<Room> rooms = roomService.getRooms(requestDto.getRoomType());
            responseDto.setRooms(rooms);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDto;
        }
        catch(Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }
}

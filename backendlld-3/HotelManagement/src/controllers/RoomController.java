package controllers;

import dtos.AdRoomRequestDto;
import dtos.AddRoomResponseDto;
import dtos.ResponseStatus;
import models.Room;
import services.RoomService;

public class RoomController {

    private RoomService roomService;

    public RoomController(RoomService roomService) {
        roomService = roomService;
    }

    public AddRoomResponseDto addRoom(AdRoomRequestDto requestDto) {
        AddRoomResponseDto responseDto = new AddRoomResponseDto();
        try {
            Room room = roomService.addRoom(requestDto.getUserId(), requestDto.getName(), requestDto.getPrice(), requestDto.getRoomType(), requestDto.getDescription());
            responseDto.setRoom(room);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDto;
        }

        catch(Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }
}

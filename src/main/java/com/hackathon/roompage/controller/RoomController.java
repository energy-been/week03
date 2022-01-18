package com.hackathon.roompage.controller;


import com.hackathon.roompage.domain.GetTitle;
import com.hackathon.roompage.domain.Room;
import com.hackathon.roompage.domain.RoomRepository;
import com.hackathon.roompage.domain.RoomRequestDto;
import com.hackathon.roompage.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class RoomController {
    private final RoomRepository roomRepository;
    private final RoomService roomService;


    @PostMapping("/api/rooms")
    public Room createRoom(@RequestBody RoomRequestDto roomRequestDto) {
        Room room = new Room(roomRequestDto);

        return roomRepository.save(room);
    }

    @GetMapping("/api/rooms")
    public List<Room> getRooms() {
        return roomRepository.findAll();
    }

    @GetMapping("/api/rooms/titles/{id}")
    public Room getOneRoom(@PathVariable String id){
        return roomRepository.findRoomById(Long.parseLong(id));
    }

    @DeleteMapping("/api/rooms/{id}")
    public Long deleteRoom(@PathVariable Long id) {
        roomRepository.deleteById(id);
        return id;
    }

    @PutMapping("/api/rooms/{id}")
    public Long updateRoom(@PathVariable Long id, @RequestBody RoomRequestDto roomRequestDto) {
        roomService.update(id, roomRequestDto);
        return id;
    }
}

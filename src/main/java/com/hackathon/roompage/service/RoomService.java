package com.hackathon.roompage.service;

import com.hackathon.roompage.domain.Room;
import com.hackathon.roompage.domain.RoomRepository;
import com.hackathon.roompage.domain.RoomRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class RoomService {
    private RoomRepository roomRepository;

    @Transactional
    public Long update(Long id, RoomRequestDto roomRequestDto) {
        Room room = roomRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("방이 존재하지 않습니다.")
        );
        room.update(roomRequestDto);
        return room.getId();
    }
}

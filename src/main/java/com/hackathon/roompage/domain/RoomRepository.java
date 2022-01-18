package com.hackathon.roompage.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {
    //List<GetTitle> findAllBy();
    Room findRoomById(Long id);
}
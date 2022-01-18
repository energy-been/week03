package com.hackathon.roompage.domain;


import com.hackathon.roompage.domain.RoomRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
@DynamicInsert
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String roomTitle;

    @Column(nullable = false)
    private java.sql.Date reStartDate;

    @Column(nullable = false)
    private java.sql.Date reEndDate;

    @Column(nullable = false)
    private String category;

    @ColumnDefault("1")
    private Integer curJoin;

    @Column(nullable = false)
    private Integer maxJoin;

    @Column(nullable = false)
    private java.sql.Date acStartDate;

    @Column(nullable = false)
    private java.sql.Date acEndDate;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String studyCount;

    @Column(nullable = false)
    private Integer studyTime;

    @Column(nullable = false)
    private String activeType;

    @Column(nullable = true)
    private String info;

    public Room(String roomTitle, java.sql.Date reStartDate, java.sql.Date reEndDate, String category, Integer curJoin, Integer maxJoin, java.sql.Date acStartDate, java.sql.Date acEndDate, String location, String studyCount, Integer studyTime, String activeType, String info) {
        this.roomTitle=roomTitle;
        this.reStartDate = reStartDate;
        this.reEndDate=reEndDate;
        this.category = category;
        this.curJoin=curJoin;
        this.maxJoin=maxJoin;
        this.acStartDate=acStartDate;
        this.acEndDate=acEndDate;
        this.location=location;
        this.studyCount=studyCount;
        this.studyTime=studyTime;
        this.activeType=activeType;
        this.info=info;
    }

    public Room(RoomRequestDto requestDto) {
        this.roomTitle = requestDto.getRoomTitle();
        this.reStartDate=requestDto.getReStartDate();
        this.reEndDate = requestDto.getReEndDate();
        this.category = requestDto.getCategory();
        this.curJoin = requestDto.getCurJoin();
        this.maxJoin = requestDto.getMaxJoin();
        this.acStartDate = requestDto.getAcStartDate();
        this.acEndDate = requestDto.getAcEndDate();
        this.location = requestDto.getLocation();
        this.studyCount= requestDto.getStudyCount();
        this.studyTime = requestDto.getStudyTime();
        this.activeType = requestDto.getActiveType();
        this.info = requestDto.getInfo();
    }

    public void update(RoomRequestDto roomRequestDto) {
        this.roomTitle=roomRequestDto.getRoomTitle();
        this.reStartDate = roomRequestDto.getReStartDate();
        this.reEndDate=roomRequestDto.getReEndDate();
        this.category = roomRequestDto.getCategory();
        this.curJoin = roomRequestDto.getCurJoin();
        this.maxJoin=roomRequestDto.getMaxJoin();
        this.acStartDate=roomRequestDto.getAcStartDate();
        this.acEndDate=roomRequestDto.getAcEndDate();
        this.location=roomRequestDto.getLocation();
        this.studyCount=roomRequestDto.getStudyCount();
        this.studyTime=roomRequestDto.getStudyTime();
        this.activeType=roomRequestDto.getActiveType();
        this.info=roomRequestDto.getInfo();
    }
}
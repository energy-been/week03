package com.hackathon.roompage.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Getter
@NoArgsConstructor
public class RoomRequestDto {
    private String roomTitle;
    private java.sql.Date reStartDate;
    private java.sql.Date reEndDate;
    private String category;
    private Integer curJoin;
    private Integer maxJoin;
    private java.sql.Date acStartDate;
    private java.sql.Date acEndDate;
    private String location;
    private String studyCount;
    private Integer studyTime;
    private String activeType;
    private String info;


    public RoomRequestDto(String roomTitle, java.sql.Date reStartDate, java.sql.Date reEndDate, String category, Integer curJoin, Integer maxJoin, java.sql.Date acStartDate, java.sql.Date acEndDate, String location, String studyCount, Integer studyTime, String activeType, String info) {
        this.roomTitle=roomTitle;
        this.reStartDate = reStartDate;
        this.reEndDate=reEndDate;
        this.category = category;
        this.curJoin = curJoin;
        this.maxJoin=maxJoin;
        this.acStartDate=acStartDate;
        this.acEndDate=acEndDate;
        this.location=location;
        this.studyCount=studyCount;
        this.studyTime=studyTime;
        this.activeType=activeType;
        this.info=info;
    }
}
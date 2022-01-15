package com.hackathon.roompage.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class MemoRequestDto {
    private String username;
    private String contents;
    private String notice;

}

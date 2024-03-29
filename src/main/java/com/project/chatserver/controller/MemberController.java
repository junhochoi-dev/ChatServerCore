package com.project.chatserver.controller;

import com.project.chatserver.data.request.MemberRequestDto;
import com.project.chatserver.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/member")
    public ResponseEntity<?> manageMember(@RequestBody MemberRequestDto requestDto){
        log.info("[MEMBER] ({}, {})", requestDto.getMemberId(), requestDto.getNickname());
        memberService.manageMember(requestDto);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}

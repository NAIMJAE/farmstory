package kr.co.farmstory.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class CommunityController {
    @GetMapping("/community/list")
    public String list(){
        log.info("/community/list - GET");
        return "/community/list";
    }
}
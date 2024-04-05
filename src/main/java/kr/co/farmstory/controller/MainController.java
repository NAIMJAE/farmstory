package kr.co.farmstory.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.info.BuildProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class MainController {

    private final BuildProperties buildProperties;

    // 메인화면
    @GetMapping(value = {"/", "/index"})
    public String index(Model model){
        // 상단 BuildProperties 주입
        String appVersion = buildProperties.getVersion();
        log.info(appVersion);

        model.addAttribute("appVersion",appVersion);
        return "/index";
    }


    // 준비중 페이지를 위한 메서드 추가
    @GetMapping("/notfound")
    public String notFound() {
        // "notfound.html" 템플릿으로 리다이렉트
        return "notfound";
    }

    // 팜스토리 소개
    @GetMapping("/introduction/hello")
    public String hello(){

        return "/introduction/hello";

    }
    // 찾아오는 길
    @GetMapping("/introduction/direction")
    public String direction(){

        return "/introduction/direction";
    }

}

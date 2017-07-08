package com.example.controller;

import com.example.model.ViewObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 17858 on 2017-07-08.
 */
@Controller
public class HomeController {

    @RequestMapping("/login")
    @ResponseBody
    public ResponseEntity<ViewObject> login(@RequestParam("username") String username,
                                            @RequestParam("password") String password) {
        ViewObject vo = new ViewObject();
        vo.set(ViewObject.ERROR,0);
        vo.set(ViewObject.MESSAGE,"login success!");
        return ResponseEntity.ok(vo);
    }
}

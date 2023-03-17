package cn.otakus.aiproject.controller;

import cn.otakus.aiproject.common.Result;
import cn.otakus.aiproject.entity.TestDTO;
import cn.otakus.aiproject.service.TestService;
import cn.otakus.aiproject.util.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author otakus
 * @date 2023/3/17
 * @since 1.0.0
 */
@RestController
public class TestController {

    @Autowired
    TestService testService;
    
    @GetMapping(value = "test")
    public Result testController(){
        return testService.test();
    }

    @PostMapping(value = "testUrl/{testUrl}")
    public Result testUrl(@PathVariable(value = "testUrl") String url) {
        return Result.getSuccess(HttpClient.post(url,"test"));
    }

    @PostMapping(value = "post/test")
    public Result testUrl(@RequestBody TestDTO testDTO) {
        return Result.getSuccess("getTest -> " + testDTO.toString());
    }


}
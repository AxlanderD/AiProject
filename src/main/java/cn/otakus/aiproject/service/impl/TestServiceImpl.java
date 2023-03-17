package cn.otakus.aiproject.service.impl;

import cn.otakus.aiproject.common.Result;
import cn.otakus.aiproject.service.TestService;
import cn.otakus.aiproject.util.HttpClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author otakus
 * @date 2023/3/17
 * @since 1.0.0
 */
@Slf4j
@Component
public class TestServiceImpl implements TestService {

    @Override
    public Result test() {
        log.info("test service start");
        return Result.getSuccess("测试成功");
    }

}
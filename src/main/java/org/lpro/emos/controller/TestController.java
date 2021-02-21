package org.lpro.emos.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.lpro.emos.pojo.ResultBody;
import org.lpro.emos.pojo.db.TbUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lwm
 * @date 2021-02-21 15:46
 * @description
 */

@RestController
@Api(tags = "服务器测试接口集")
public class TestController {

    @GetMapping("/pass-test")
    @ApiOperation("测试API")
    public ResultBody passTest(){
        return ResultBody.ok("服务器正常运行中……");
    }
}

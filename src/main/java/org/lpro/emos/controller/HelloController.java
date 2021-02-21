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
@Api(tags = "测试集")
public class HelloController {

    @GetMapping("/hello")
    @ApiOperation("最简单的测试方法")
    public ResultBody<TbUser> hello(){
        TbUser user = new TbUser();
        user.setId(6666);
        user.setName("jack");
        return ResultBody.ok(user);
    }
}

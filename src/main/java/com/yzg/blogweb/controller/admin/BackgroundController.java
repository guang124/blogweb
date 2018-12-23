package com.yzg.blogweb.controller.admin;

import com.yzg.blogweb.controller.BaseController;
import com.yzg.blogweb.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 后台主页控制器
 */
@Api("后台首页")
@RestController
@RequestMapping("/admin/")
public class BackgroundController extends BaseController {
    @ApiOperation("进入首页")
    @GetMapping(value = {"", "/index"})
    public String index(HttpServletRequest request) {
        return null;
    }

    /**
     * 后台登录操作
     *
     * @param user
     * @param request
     * @return
     */
    @PostMapping("/login")
    public String login(User user, HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 对用户账号进行验证,是否正确
        return null;
    }

    /**
     * 个人设置页面
     */
    @GetMapping(value = "/profile")
    public String profile() {
        return "admin/profile";
    }
}

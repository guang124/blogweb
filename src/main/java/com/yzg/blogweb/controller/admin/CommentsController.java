package com.yzg.blogweb.controller.admin;

import com.yzg.blogweb.controller.BaseController;
import com.yzg.blogweb.pojo.Comment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 留言控制器
 */
@Api("留言控制器")
@RestController
@RequestMapping("/admin/comments")
public class CommentsController extends BaseController {
    /**
     * 获取所有留言信息
     *
     * @return
     */
    @ApiOperation("获取所有留言信息")
    @GetMapping("/list")
    public List<Comment> listAllComment() {
        return null;
    }
    /**
     * 通过id获取一条留言信息
     *
     * @param id
     * @return
     */
    @ApiOperation("获取某一条留言信息")
    @ApiImplicitParam(name = "id", value = "留言ID", required = true, dataType = "Long")
    @GetMapping("/{id}")
    public Comment getCommentById(@PathVariable Long id) {
        return null;
    }

    /**
     * 增加一条留言信息数据
     *
     * @return
     */
    @ApiOperation("增加留言信息")
    @ApiImplicitParam(name = "name", value = "留言名称", required = true, dataType = "String")
    @PostMapping("")
    public String addComment() {
        return null;
    }

    /**
     * 更新/编辑一条数据
     *
     * @param id
     * @return
     */
    @ApiOperation("更新/编辑留言状态")
    @ApiImplicitParam(name = "id", value = "留言ID", required = true, dataType = "Long")
    @PutMapping("/{id}")
    public String updateComment(@PathVariable Long id) {
        return null;
    }

    /**
     * 根据ID删除留言信息
     *
     * @param id
     * @return
     */
    @ApiOperation("删除留言信息")
    @ApiImplicitParam(name = "id", value = "留言ID", required = true, dataType = "Long")
    @DeleteMapping("/{id}")
    public String deleteComment(@PathVariable Long id) {
        return null;
    }
}

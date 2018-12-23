package com.yzg.blogweb.controller.admin;

import com.yzg.blogweb.controller.BaseController;
import com.yzg.blogweb.dto.Article;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 文章信息控制器
 */
@Api("文章信息控制器")
@RestController
@RequestMapping("/admin/article")
public class ArticleController extends BaseController {
    /**
     * 获取所有文章信息
     *
     * @return
     */

    @ApiOperation("获取所有文章信息")
    @GetMapping("/list")
    public List<Article> listAllArticle() {
        return null;
    }

    /**
     * 通过id获取一条文章信息
     *
     * @param id
     * @return
     */
    @ApiOperation("获取某一条文章信息")
    @ApiImplicitParam(name = "id", value = "文章ID", required = true, dataType = "Long")
    @GetMapping("/{id}")
    public Article getArticleById(@PathVariable Long id) {
        return null;
    }

    /**
     * 增加一条文章信息数据
     *
     * @return
     */
    @ApiOperation("增加文章信息")
    @ApiImplicitParam(name = "name", value = "文章名称", required = true, dataType = "String")
    @PostMapping("")
    public String addArticle() {
        return null;
    }

    /**
     * 更新/编辑一条数据
     *
     * @param id
     * @return
     */
    @ApiOperation("更新/编辑文章信息")
    @ApiImplicitParam(name = "id", value = "文章ID", required = true, dataType = "Long")
    @PutMapping("/{id}")
    public String updateArticle(@PathVariable Long id) {
        return null;
    }

    /**
     * 根据ID删除文章信息
     *
     * @param id
     * @return
     */
    @ApiOperation("删除文章信息")
    @ApiImplicitParam(name = "id", value = "文章ID", required = true, dataType = "Long")
    @DeleteMapping("/{id}")
    public String deleteArticle(@PathVariable Long id) {
        return null;
    }
}

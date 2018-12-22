package com.yzg.blogweb.mapper;

import com.yzg.blogweb.pojo.ArticleCategoryExample;
import com.yzg.blogweb.pojo.ArticleCategoryKey;
import java.util.List;

public interface ArticleCategoryMapper {
    int deleteByPrimaryKey(ArticleCategoryKey key);

    int insert(ArticleCategoryKey record);

    int insertSelective(ArticleCategoryKey record);

    List<ArticleCategoryKey> selectByExample(ArticleCategoryExample example);
}
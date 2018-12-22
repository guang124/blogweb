package com.yzg.blogweb.mapper;

import com.yzg.blogweb.pojo.SysConfig;
import com.yzg.blogweb.pojo.SysConfigExample;
import com.yzg.blogweb.pojo.SysConfigKey;
import java.util.List;

public interface SysConfigMapper {
    int deleteByPrimaryKey(SysConfigKey key);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    List<SysConfig> selectByExample(SysConfigExample example);

    SysConfig selectByPrimaryKey(SysConfigKey key);

    int updateByPrimaryKeySelective(SysConfig record);

    int updateByPrimaryKey(SysConfig record);
}
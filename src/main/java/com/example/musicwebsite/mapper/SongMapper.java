package com.example.musicwebsite.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.musicwebsite.entity.Song;
import org.apache.ibatis.annotations.Mapper;

//Mapper 接口是 MyBatis-Plus 的核心组件之一，用于定义与数据库交互的方法。MyBatis-Plus 提供了 BaseMapper，它已经实现了许多常用的数据库操作（如增删改查）。
@Mapper
//Spring Boot 会自动扫描带有 @Mapper 注解的接口，并将其注册为 Bean
public interface SongMapper extends BaseMapper<Song> {
}

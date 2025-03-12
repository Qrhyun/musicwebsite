package com.example.musicwebsite.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.musicwebsite.entity.Song;
//Service 层是业务逻辑的核心，用于处理业务规则和调用数据访问层（Mapper）。通过将业务逻辑与数据访问分离，可以提高代码的可维护性和可测试性。
public interface SongService extends IService<Song> {
    //IService<Song>MyBatis-Plus 提供的通用服务接口,定义了基本的业务操作（如增删改查）
}

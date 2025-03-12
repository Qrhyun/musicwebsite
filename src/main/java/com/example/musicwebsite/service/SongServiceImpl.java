package com.example.musicwebsite.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.musicwebsite.entity.Song;
import com.example.musicwebsite.mapper.SongMapper;
import org.springframework.stereotype.Service;
import com.example.musicwebsite.service.SongService;
@Service
public class SongServiceImpl extends ServiceImpl<SongMapper, Song> implements SongService {
//实现了 IService 接口，提供了默认的业务逻辑实现。
}

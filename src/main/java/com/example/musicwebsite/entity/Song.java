package com.example.musicwebsite.entity;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

//实体类（Entity）是与数据库表直接对应的 Java 类，用于表示数据库中的数据结构。MyBatis-Plus 通过注解的方式将实体类与数据库表进行映射。实现解耦合
@Data
@TableName("song")
public class Song {
    //type = IdType.AUTO 表示主键由数据库自动生成（如 MySQL 的自增主键）
    @TableId(value = "id", type = IdType.AUTO)
    private Long id; // 主键ID
    private String title; // 歌曲标题
    private String artist; // 歌手
    private String album; // 所属专辑
    private Integer duration; // 歌曲时长（秒）
    private String filePath; // 歌曲文件路径
    private String coverPath; // 歌曲封面路径
    private String lyrics; // 歌词
    private String genre; // 音乐类型（如流行、摇滚等）
    private LocalDateTime createTime; // 创建时间
    private LocalDateTime updateTime; // 更新时间
}

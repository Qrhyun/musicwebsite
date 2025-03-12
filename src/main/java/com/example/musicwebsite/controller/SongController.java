package com.example.musicwebsite.controller;

import com.example.musicwebsite.entity.Song;
import com.example.musicwebsite.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/songs")
public class SongController {

    @Autowired
    private SongService songService;

    @GetMapping
    public List<Song> getAllSongs() {
        return songService.list();
    }

    @GetMapping("/{id}")
    public Song getSongById(@PathVariable Long id) {
        return songService.getById(id);
    }

    @PostMapping
    public Song createSong(@RequestBody Song song) {
        songService.save(song);
        return song;
    }

    @PutMapping("/{id}")
    public Song updateSong(@PathVariable Long id, @RequestBody Song song) {
        song.setId(id);
        songService.updateById(song);
        return song;
    }

    @DeleteMapping("/{id}")
    public void deleteSong(@PathVariable Long id) {
        songService.removeById(id);
    }
}
package com.stream.app.stream_backend.services;

import com.stream.app.stream_backend.entities.Video;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface VideoService {
    //save video
    Video save(Video video , MultipartFile file);


    //get video by id
    Video get(String videoId);

    //get video by title
    Video getByTitle(String title);

    //all video
    List<Video> getAll();
}

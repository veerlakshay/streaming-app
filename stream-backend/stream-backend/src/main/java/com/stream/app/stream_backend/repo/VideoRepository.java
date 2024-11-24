package com.stream.app.stream_backend.repo;

import com.stream.app.stream_backend.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VideoRepository extends JpaRepository<Video , String> {

    //we will automatically get the implementation
    Optional<Video> findByTitle(String title);


    //query methods
    //native queries

}

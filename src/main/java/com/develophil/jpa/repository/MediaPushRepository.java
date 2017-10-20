package com.develophil.jpa.repository;

import com.develophil.jpa.model.MediaPush;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hkpking on 2017. 6. 15..
 */
@Repository
public interface MediaPushRepository extends JpaRepository<MediaPush, Long> {

}
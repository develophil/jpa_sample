package com.develophil.jpa.repository;

import com.develophil.jpa.model.MediaLivePush;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hkpking on 2017. 6. 15..
 */
@Repository
public interface MediaPushOwnerRepository extends JpaRepository<MediaLivePush, Long> {

}
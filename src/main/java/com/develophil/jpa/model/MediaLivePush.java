package com.develophil.jpa.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by hkpking on 2017. 10. 19..
 */
@Getter
@Setter
@Entity
@Table(name = "media_push_owner")
public class MediaLivePush extends MediaPush {

	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long pushSeqno;

	@Column(name = "owner_nm")
	private String ownerName;

}

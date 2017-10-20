package com.develophil.jpa.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by hkpking on 2017. 6. 30..
 */
@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "media_push")
//@DiscriminatorColumn(name = "push_tp")
//@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class MediaPush {

	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long pushSeqno;

	@Column(name = "push_tp")
	@Enumerated(EnumType.STRING)
	private PushType pushType;

	@Enumerated(EnumType.STRING)
	private YN useYn;

	@Column(name = "member_nm")
	private String memberName;

	@Column(length = 50)
	private String creator;

	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createDt;

	@Column(length = 50)
	private String updater;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updateDt;


}

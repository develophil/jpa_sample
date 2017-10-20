package com.develophil.jpa.rest;

import com.develophil.jpa.model.MediaLivePush;
import com.develophil.jpa.model.MediaPush;
import com.develophil.jpa.repository.MediaPushOwnerRepository;
import com.develophil.jpa.repository.MediaPushRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/pushes")
public class MediaPushRestController {

	@Autowired MediaPushOwnerRepository mediaPushOwnerRepository;
	@Autowired MediaPushRepository mediaPushRepository;

	@RequestMapping(value={"","/"}, method = RequestMethod.GET)
	public Object getPushes() {

		log.debug("pushes");
		return mediaPushRepository.findAll();
	}

	@RequestMapping(value={"","/"}, method = RequestMethod.POST)
	public Object setPushes(@RequestBody MediaPush mediaPush) {

		log.debug("set pushes");
		return mediaPushRepository.save(mediaPush);
	}

	@RequestMapping(value="/{seqno}", method = RequestMethod.GET)
	public Object getPushesBySeqno(@PathVariable("seqno") Long seqno) {

		log.debug("pushes / {}", seqno);
		return mediaPushRepository.findOne(seqno);
	}

	@RequestMapping(value="/owners", method = RequestMethod.GET)
	public Object getOwnerPushes() {

		log.debug("owner pushes");
		return mediaPushOwnerRepository.findAll();
	}

	@RequestMapping(value="/owners", method = RequestMethod.POST)
	public Object setOwnerPushes(@RequestBody MediaLivePush push) {

		log.debug("set owner pushes");
		return mediaPushOwnerRepository.save(push);
	}

	@RequestMapping(value="/owners/{seqno}", method = RequestMethod.GET)
	public Object getOwnerPushesBySeqno(@PathVariable("seqno") Long seqno) {

		log.debug("owner pushes / {}", seqno);
		return mediaPushOwnerRepository.findOne(seqno);
	}

}

package com.buyzaar.myapp.util;

import org.springframework.stereotype.Component;

import com.buyzaar.myapp.entity.DatabaseSequence;
import com.buyzaar.myapp.repository.DatabaseSeqRepository;

@Component
public class SequenceGeneratorService {

	private DatabaseSeqRepository sequenceRepository;

	public SequenceGeneratorService(DatabaseSeqRepository sequenceRepository) {
		super();
		this.sequenceRepository = sequenceRepository;
	}

	public synchronized long generateSequence(String sequenceName) {
		DatabaseSequence sequence = sequenceRepository.findById(sequenceName).orElseGet(() -> {
			DatabaseSequence newSeq = new DatabaseSequence();
			newSeq.setId(sequenceName);
			newSeq.setSeq(0);
			return newSeq;
		});

		sequence.setSeq(sequence.getSeq() + 1);
		sequenceRepository.save(sequence);
		return sequence.getSeq();
	}
}
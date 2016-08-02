package org.rvacoderdojo.hackathon.repository;

import org.rvacoderdojo.hackathon.model.Challenge;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mpegram on 7/31/16.
 */
public interface ChallengeRepository extends CrudRepository<Challenge, Integer> {
}

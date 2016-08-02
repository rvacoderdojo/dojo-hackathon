package org.rvacoderdojo.hackathon.controller;

import org.rvacoderdojo.hackathon.model.Challenge;
import org.rvacoderdojo.hackathon.model.Hacker;
import org.rvacoderdojo.hackathon.model.Result;
import org.rvacoderdojo.hackathon.repository.ChallengeRepository;
import org.rvacoderdojo.hackathon.repository.HackerRepository;
import org.rvacoderdojo.hackathon.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mpegram on 7/31/16.
 */
@RestController
@RequestMapping("/results")
public class ResultsController {


    private final ResultRepository resultsRepo;
    private final HackerRepository hackerRepo;
    private final ChallengeRepository challengeRepo;

    @Autowired
    public ResultsController (final ResultRepository resultsRepo,
                              final HackerRepository hackerRepo,
                              final ChallengeRepository challengeRepo) {
        this.resultsRepo = resultsRepo;
        this.hackerRepo = hackerRepo;
        this.challengeRepo = challengeRepo;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<Result>> getResults() {
        Iterable<Challenge> challenges = challengeRepo.findAll();
        Iterable<Hacker> hackers = hackerRepo.findAll();
        Iterable<Result> results = resultsRepo.findAll();
        return new ResponseEntity<Iterable<Result>>(results, HttpStatus.OK);
    }
}

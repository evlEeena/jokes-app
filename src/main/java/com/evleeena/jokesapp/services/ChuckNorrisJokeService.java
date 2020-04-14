package com.evleeena.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ChuckNorrisJokeService implements JokeService {

    @Resource
    private ChuckNorrisQuotes chuckNorrisQuotes;

    @Override
    public String showJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}

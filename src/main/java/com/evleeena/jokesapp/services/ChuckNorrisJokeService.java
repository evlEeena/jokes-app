package com.evleeena.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeService implements JokeService {
    @Override
    public String showJoke() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}

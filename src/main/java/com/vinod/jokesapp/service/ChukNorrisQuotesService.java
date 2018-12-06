package com.vinod.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChukNorrisQuotesService implements JokesService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public ChukNorrisQuotesService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQuotes() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}

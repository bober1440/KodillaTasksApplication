package com.crud.tasks.service;

import com.crud.tasks.domain.TrelloBoardDto;
import com.crud.tasks.trello.client.TrelloClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrelloService {


    private final TrelloClient trelloClient;

    public TrelloService(TrelloClient trelloClient) {
        this.trelloClient = trelloClient;
    }

    public List<TrelloBoardDto> fetchTrelloBoards() {
        return trelloClient.getTrelloBoards();
    }
}

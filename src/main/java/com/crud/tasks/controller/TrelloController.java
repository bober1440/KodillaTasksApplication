package com.crud.tasks.controller;

import com.crud.tasks.domain.TrelloBoardDto;
import com.crud.tasks.trello.client.TrelloClient;
import com.crud.tasks.trello.service.TrelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("v1/trello")
@CrossOrigin("*")
public class TrelloController {

    private final TrelloService trelloService;

    public TrelloController(TrelloService trelloService) {
        this.trelloService = trelloService;
    }

    @GetMapping("/boards")
    public List<TrelloBoardDto> getTrelloBoards() {
        return trelloService.fetchTrelloBoards().stream()
                .filter(board -> board.getId() != null && board.getName() != null)
                .filter(board -> board.getName().contains("Kodilla"))
                .collect(Collectors.toList());
    }
}
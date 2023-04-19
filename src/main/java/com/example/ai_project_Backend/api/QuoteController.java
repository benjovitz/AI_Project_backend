package com.example.ai_project_Backend.api;

import com.example.ai_project_Backend.dto.QuoteResponse;
import com.example.ai_project_Backend.dto.TokenResonse;
import com.example.ai_project_Backend.service.QuoteService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/quotes/")
@CrossOrigin
public class QuoteController {

    QuoteService qs;

    public QuoteController(QuoteService qs){
        this.qs=qs;
    }

    @GetMapping("token")
    public TokenResonse getToken(){
        System.out.println("getting token");
        return qs.getToken();
    }
    @GetMapping
    public List<QuoteResponse> getQuotes(){
        return qs.getQuotes();
    }
}

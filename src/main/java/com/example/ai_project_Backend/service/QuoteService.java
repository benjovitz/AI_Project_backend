package com.example.ai_project_Backend.service;


import com.example.ai_project_Backend.dto.QuoteResponse;
import com.example.ai_project_Backend.dto.TokenResonse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuoteService {



    public QuoteService(){

    }
    public TokenResonse getToken(){
        WebClient client = WebClient.create();
        Mono<String> token = client.post()
                .uri("https://northeurope.api.cognitive.microsoft.com/sts/v1.0/issuetoken")
                .header("Content-Type","application/x-www-form-urlencoded")
                .header("Host","northeurope.api.cognitive.microsoft.com")
                .header("Ocp-Apim-Subscription-Key",System.getenv("SUB_KEY"))
                .retrieve()
                .bodyToMono(String.class);
        TokenResonse tokenDTO = TokenResonse.builder().token(token.block()).build();
        return tokenDTO;
    }
    public ArrayList<QuoteResponse> getQuotes(){
        ArrayList<QuoteResponse> quotes = new ArrayList<>();
        QuoteResponse q0 = new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'>* Did you know that a housefly's lifespan is only 24 hours? *</voice> </speak>");
        quotes.add(q0);

        QuoteResponse q1 = new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'>* Unfortunately, humans can't see the world in the same way that dogs or cats can.* </voice> </speak>");
        quotes.add(q1);

        QuoteResponse q2 = new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'>* The world's largest animal, the blue whale, is endangered due to human activities. *</voice> </speak>");
        quotes.add(q2);

        QuoteResponse q3 = new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'>* A snail can sleep for up to three years. *</voice> </speak>");
        quotes.add(q3);

        QuoteResponse q4 = new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'>* Humans are no match for a cheetah's speed, as they can run up to 75 mph. *</voice> </speak>");
        quotes.add(q4);

        QuoteResponse q5 = new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'>* The lifespan of a mayfly can be as short as a few minutes. *</voice> </speak>");
        quotes.add(q5);

        QuoteResponse q6 = new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'>*Elephants are intelligent and emotional creatures, but they are still poached for their tusks. *</voice> </speak>");
        quotes.add(q6);

        QuoteResponse q7 = new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'>* The lifespan of a house mouse is typically less than one year. *</voice> </speak>");
        quotes.add(q7);

        QuoteResponse q8 = new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'>* Unfortunately, humans have caused significant damage to coral reefs around the world. *</voice> </speak>");
        quotes.add(q8);
        QuoteResponse q9 = new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'> *Rising sea levels due to climate change threaten to displace millions of people living in coastal areas. *</voice> </speak>");
        quotes.add(q9);

        QuoteResponse q10 = new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'>* Climate change has led to more frequent and intense natural disasters like hurricanes, floods, and wildfires. *</voice> </speak>");
        quotes.add(q10);

        QuoteResponse q11 = new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'>* The Arctic sea ice is rapidly melting, threatening the survival of polar bears and other Arctic wildlife. *</voice> </speak>");
        quotes.add(q11);

        QuoteResponse q12 = new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'>* Climate change is causing coral reefs to bleach and die, impacting the biodiversity of marine ecosystems. *</voice> </speak>");
        quotes.add(q12);

        QuoteResponse q13 = new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'>* Climate change is causing more frequent and severe heatwaves, which can be deadly for vulnerable populations like the elderly and young children.* </voice> </speak>");
        quotes.add(q13);

        QuoteResponse q14 = new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'>* Climate change is exacerbating water scarcity in many parts of the world, putting pressure on already strained water resources. *</voice> </speak>");
        quotes.add(q14);

        QuoteResponse q15 = new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'>* Climate change is causing more frequent and severe droughts, which can lead to crop failures and food insecurity.* </voice> </speak>");
        quotes.add(q15);

        QuoteResponse q16 = new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'>* Climate change is causing more frequent and severe wildfires, which can devastate ecosystems and communities.* </voice> </speak>");
        quotes.add(q16);

        QuoteResponse q17 = new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'> *Climate change is causing more frequent and severe flooding, which can displace millions of people and cause significant economic damage. *</voice> </speak>");
        quotes.add(q17);

        QuoteResponse q18 = new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'> *Deez Nuts, gottem*</voice> </speak>");
        quotes.add(q18);

        QuoteResponse q19 = new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'> *My sprinkler goes like thisstststststststststststststststststststststststst and comes back like ttttttttttttttttttttttttttttttttttttttte*</voice> </speak>");
        quotes.add(q19);

        QuoteResponse q20 = new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'> *Don’t you just hate it when your cat wakes you up like this? Meow. Meow. Meow. Meow. Meow. Meow. Meow. Meow. Meow.*</voice> </speak>");
        quotes.add(q20);

        QuoteResponse q21= new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'>*I heard Joe wanted to talk to you........ Joe mama*</voice> </speak>");
        quotes.add(q21);

        QuoteResponse q22= new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'>* Obamna *</voice> </speak>");
        quotes.add(q22);

        QuoteResponse q23= new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'>* Theres only about 4500 tigers left in the wild *</voice> </speak>");
        quotes.add(q23);

        QuoteResponse q24= new QuoteResponse("<speak version='1.0' xml:lang='en-US'><voice xml:lang='en-US' xml:gender='Male' name='en-US-ChristopherNeural'>* Assuming an average human male can bench press around 100-150 kg, we could estimate that a silverback gorilla may be able to bench press up to 600-900 kg, based on their relative strength. However, it's important to keep in mind that this is only a rough estimate and should not be taken as a definitive answer. *</voice> </speak>");
        quotes.add(q24);
        return quotes;
    }
}

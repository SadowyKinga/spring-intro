package com.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import org.springframework.stereotype.Component;

@Component("randomMessageService")
public class RandomTextMessageService implements MessageService {
    List<String> list = new ArrayList<>(Arrays.asList(
            "Wiadomość nr 1",
            "Wiadomość nr 2",
            "Wiadomość nr 3",
            "Wiadomość nr 4",
            "Wiadomość nr 5",
            "Wiadomość nr 6",
            "Wiadomość nr 7",
            "Wiadomość nr 8",
            "Wiadomość nr 9",
            "Wiadomość nr 10"
    ));

    @Override
    public String getMessage() {
        return this.list.get(new Random().nextInt(10));
    }
}
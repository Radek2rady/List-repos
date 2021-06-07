package com.gfa.backendapi.services;

import com.gfa.backendapi.models.Sith;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class SithService {

    public StringBuilder reverseSith(Sith sith) {
        Random random = new Random();
        List<String> randomSentences = Arrays.asList("Arrgh.", "Uhmm.", "Err..err.err.");
        String text = sith.getText();
        List<String> words;
        StringBuilder textSith = new StringBuilder();
        List<String> content = Arrays.asList(text.split("\\."));
        for (int i = 0; i < content.size(); i++) {
            content.set(i, content.get(i).trim());
            words = Arrays.asList(content.get(i).split(" "));
            for (int k = 0; k < words.size() - 1; k += 2) {
                var tempWord2 = words.get(k).toLowerCase();
                var tempWord1 = words.get(k + 1).toLowerCase();
                if (k == 0) {
//                    var firstLetter = tempWord1.substring(0, 1).toUpperCase();
//                    var restTempWord1 = tempWord1.substring(1, tempWord1.length());
//                    tempWord1 = firstLetter + restTempWord1;
                    tempWord1 = tempWord1.substring(0, 1).toUpperCase() + tempWord1.substring(1);
                }
                textSith.append(tempWord1 + " ");
                textSith.append(tempWord2 + " ");
            }
            if (words.size() % 2 == 1) {
                var finalWord = words.get(words.size() - 1);
                textSith.append(finalWord + ". " + randomSentences.get(random.nextInt(3)));
            }
        }
        return textSith;
    }
}

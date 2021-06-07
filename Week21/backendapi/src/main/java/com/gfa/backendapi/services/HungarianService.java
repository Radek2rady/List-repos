package com.gfa.backendapi.services;

import com.gfa.backendapi.models.Hungarian;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class HungarianService {
    public String translate(Hungarian hungarian) {
        String text = hungarian.getText();
        StringBuilder newText = new StringBuilder();
        List<String> original = Arrays.asList("a", "á", "e", "é", "i", "í", "o", "ó",
                "A", "Á", "E", "É", "I", "Í", "O", "Ó");
//        List<String> replacement = Arrays.asList("va", "vá", "ve", "vé", "vi", "ví", "vo", "vó");
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < original.size(); j++) {
                if (text.substring(i, i + 1).equals(original.get(j))) {
                    newText.append(text.substring(i, i + 1) + "v" + text.substring(i, i + 1).toLowerCase());
                    i++;
                    break;
                }
            }
            newText.append(text.substring(i, i + 1));
        }
        return newText.toString();
    }

    public String replaceLanguage(Hungarian hungarian) {
        String lang = hungarian.getLang();
        lang = "teve";
        return lang;
    }
}

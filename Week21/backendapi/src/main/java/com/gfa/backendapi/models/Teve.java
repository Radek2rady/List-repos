package com.gfa.backendapi.models;

public class Teve {
    private String translated;
    private String lang;

    public Teve() {
    }

    public Teve(String translated, String lang) {
        this.translated = translated;
        this.lang = lang;
    }

    public String getTranslated() {
        return translated;
    }

    public void setTranslated(String translated) {
        this.translated = translated;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}

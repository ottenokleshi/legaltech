package com.legaltech.model;

import java.util.List;
import java.util.Map;

public class Article {
    public final String id;
    public final String title;
    public final Map<String, List<String>> highlighting;

    public Article(String id, String title, Map<String, List<String>> highlighting) {
        this.id = id;
        this.title = title;
        this.highlighting = highlighting;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
package com.akbarjimi.restservice;

public record Greeting(long id, String content) {
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long id() {
        return this.id;
    }

    public String content() {
        return this.content;
    }
}
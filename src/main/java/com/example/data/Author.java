package com.example.data;

public class Author extends Person {

    private String nickname;

    public Author() {
        super(0,"","");
    }

    public Author(int id, String name, String surname, String nickname) {
        super(id, name, surname);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }
}

package com.mysite.sbb;

public class Greeting {
    // 맴버 변수
    public long id;
    public String content;

    // 생성자
    // 2개 이상 만들수 있음
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Greeting(long id) {
        this.id = id;
        this.content = "기본 컨텐츠 내용";
    }

    public Greeting(String content) {
        this.id = -1;
        this.content = content;
    }
}

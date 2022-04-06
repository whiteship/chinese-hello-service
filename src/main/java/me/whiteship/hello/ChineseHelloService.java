package me.whiteship.hello;

import me.whiteship.chapter01.item01.HelloService;

public class ChineseHelloService implements HelloService {

    @Override
    public String hello() {
        return "Ni Hao";
    }
}

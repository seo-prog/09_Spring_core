package com.ohgiraffers.section02.common;


import org.springframework.stereotype.Component;

@Component // 피카츄
public class Pikachu implements Pokemon {


    @Override
    public void attack() {
        System.out.println("피카츄 백만 볼트 !!!!!~!~!!~!!~!~~!!");
    }
}

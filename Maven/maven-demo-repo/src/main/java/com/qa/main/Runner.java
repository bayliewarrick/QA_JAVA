package com.qa.main;

import org.apache.commons.lang3.RandomUtils;

public class Runner {

    public static void main(String[] args) {
        System.out.println("This should be printed no matter what!");
        System.out.println(String.format("This number should be printed if we build a fat-.jar!: %s", RandomUtils.nextInt()));
    }

}

package com.dianaqa.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {

    public static int getRandomInt(int startLimit, int endLimit){
        Random random = new Random();
        int delta = endLimit - startLimit;
        int deltaRandomInt = random.nextInt(delta);
        int randomNumber = deltaRandomInt + startLimit;
        return randomNumber;
    }

    public static int getRandomInt(int limit) {
        // Random random = new Random();
        return random.nextInt(limit);
    }

    //  utilizat p/u UUID
    public static String getRandomString() {
        return UUID.randomUUID().toString();
    }

    //  utilizat p/u EMAIL
    public static String getRandomEmail(String emailDomain) {
        return UUID.randomUUID().toString() + emailDomain;
    }

    public static String getRandomEmail(String prefix, String emailDomain) {
        return prefix + getRandomInt(999999999) + emailDomain;
    }
    }

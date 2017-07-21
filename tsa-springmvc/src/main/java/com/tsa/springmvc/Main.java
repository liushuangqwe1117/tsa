package com.tsa.springmvc;

import java.util.UUID;

/**
 * Created by LS on 2017-7-10.
 */
public class Main {
    public static void main(String[] args) {
        String uid = "666";
        System.out.println(uid.hashCode());
        System.out.println(uid.hashCode()%16);
        String uuid = UUID.randomUUID().toString().replace("-","");
        System.out.println(uuid.substring(0,16).hashCode());
        System.out.println(uuid.substring(16).hashCode());
//        1742074044933333274
    }
}

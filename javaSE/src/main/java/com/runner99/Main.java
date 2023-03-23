package com.runner99;

import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.List;

/**
 * @author weizhenqiang
 * @date 2023/3/21 10:04
 */
public class Main {
    public static void main(String[] args) {

        HttpClient client = HttpClient.newHttpClient();



        // 例1
        var list = List.of("Java", "Python", "C");
        var copy = List.copyOf(list);
        System.out.println(list == copy); // true

// 例2
        var list1 = new ArrayList<String>();
        var copy1 = List.copyOf(list1);
        System.out.println(list1 == copy1); // false
    }
}

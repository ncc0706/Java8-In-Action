package io.arukas.optional;

import java.util.List;
import java.util.Optional;

public class TestOptional1 {
    public static void main(String[] args) {
//        try {
//            String result = Optional.of("Hello").orElseThrow(() -> {
//                throw new RuntimeException("出现异常");
//            });
//            System.out.println(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        Optional<Object> empty = Optional.empty();
        System.out.println(empty);


        List<String> data = null;
        // 允许null的数据
        Optional<List<String>> data1 = Optional.ofNullable(data);
        System.out.println(data1);

        // 不允许null的数据
//        if (obj == null)
//            throw new NullPointerException();
//
        Optional.of(data);


    }
}

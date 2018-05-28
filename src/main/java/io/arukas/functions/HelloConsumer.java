package io.arukas.functions;

/**
 * 有且仅有一个抽象方法
 */
@FunctionalInterface
public interface HelloConsumer<T> {

    String accept(T t);

    // not allow
//    String accept2(String message);

    // 从Object继承的方法不计入函数式接口
    String toString();

    boolean equals(Object o);

    default String defaultMethod() {
        return "Hello Default Method In Java8";
    }

}

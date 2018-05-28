package io.arukas.functions;

/**
 * 有且仅有一个抽象方法
 */
@FunctionalInterface
public interface Hello {
    String say(String message);

    default String name(String name) {
        return name;
    }

}

package io.arukas.optional;

import io.arukas.exception.ErrorMessageException;

import java.util.Optional;

public class TestOptional3 {

    public static void main(String[] args) {

//        Optional.ofNullable(null).orElseThrow(ErrorMessageException::new);

        Optional.ofNullable(null).orElseThrow(() -> {
            return new ErrorMessageException("出现异常。。。");
        });
    }

}

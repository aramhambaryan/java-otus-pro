package ru.otus.pro;

import com.google.common.base.Strings;

public class HelloOtus {

    public void action() {
        System.out.println("testing if text is empty with guava library");
        System.out.println(Strings.isNullOrEmpty(""));
        System.out.println("test done");
    }
}

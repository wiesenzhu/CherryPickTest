package com.wiesen.cherrypicktest;

/**
 * @author zhubing
 * @date 2022/4/12 9:25
 */
public class TestController {

    public String hello() {
        return "hello";
    }

    public String hey() {
        return "hey";
    }

    public String hi() {
        String a = "modified this method";
        return a;
    }

    public String addAMethod() {
        return "addAMethod";
    }

    public String what() {
        return "what?";
    }

}

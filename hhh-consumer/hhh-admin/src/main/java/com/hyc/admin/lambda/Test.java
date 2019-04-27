package com.hyc.admin.lambda;

public class Test {

    public interface MyLove{
        String myLove();
    }


    public static void main(String[] args) {
        MyLove aa = String::new;
    }

}

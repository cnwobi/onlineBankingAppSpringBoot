package com.userfront.controller;

public class fibionacci {
    public static void main(String[] args) {
System.out.println(fibionacci(79

));
    }

    public static int fibionacci(int n){
        if(n <= 1){
            return n;
        }
        else return fibionacci(n-1) + fibionacci(n-2);

    }
}

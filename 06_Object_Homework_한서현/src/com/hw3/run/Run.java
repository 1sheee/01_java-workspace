package com.hw3.run;

import com.hw3.controller.Function;

public class Run {
    public static void main(String[] args) {
        Function function = new Function();

//        // 1. 랜덤 값: 24 7 20 11 40 30
        System.out.print("랜덤 값: ");
        function.printLottoNumbers();
//        System.out.print("랜덤 값 : ");
//        function.printLottoNumbers2();

        // 2. a문자 5개 출력: a a a a a
        System.out.print("\na문자 5개 출력 : ");
        function.outputChar(5, 'a');

        // 3. 랜덤 영문자 출력: a
        System.out.print("랜덤 영문자 출력 : ");
        System.out.println(function.alphabette());

        // 4. apple의 2번 4번 인덱스 사이의 값 출력: pl
        String str = "apple";
        int index1 = 2;
        int index2 = 4;
        System.out.println("apple의 2번 4번 인덱스 사이의 값 출력: " + function.mySubstring(str, index1, index2));

    
    }
}
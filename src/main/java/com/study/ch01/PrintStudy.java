package com.study.ch01;

import com.study.Main;

public class PrintStudy { //클래스 명(파스칼 표기법)은 파일명 이랑 일치
    public static void main(String[] args) { //단축기 main

        System.out.println("\u0061"); // 유니코드 사용법 = /u.... 예)/uAC00 = 가
        System.out.println("" + '전' + '주' + '환'); //앞에 "" 하므로써 뒤가 문자로 변환된것
        System.out.println("나이 : " + (10+20)); //문자열이 앞에 먼저 오면 뒤에도 문자가 된다 ,뒤에 정수로 바꿀 땐 괄호 하자
        //단축기 sout , 하나의 문자는 작은 따옴표, 하나 이상 문자는 큰 따옴표
        // 0000 0000 1비트당 8개 ,2비트 = 1바이트, 8비트=255
        // char자료형 -> 2바이트


    }

}

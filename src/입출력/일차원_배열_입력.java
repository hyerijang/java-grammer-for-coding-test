package 입출력;

import java.util.Arrays;
import java.util.Scanner;

public class 일차원_배열_입력 {


    public static void main(String[] args) throws Exception {
        //int 배열 입력
//        array_int();
        //str 배열 입력
        array_str();
    }

    /**
     * int 배열 입력
     */
    private static void array_int() {
        Scanner sc=new Scanner(System.in);
        //입력을 배열로
        //1. 배열 생성
        var array = new int[10];
        
        //방법 2개
        //2. 반복문 돌면서 집어넣기
        int i = 0;
        while(i < array.length) {
            array[i] = sc.nextInt(); // int 타입
            i++;
        }
        //2. 스트림 사용 mapToInt(Integer::parseInt)
        int[] array2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    /**
     * str 배열 입력
     */
    public static void array_str() throws Exception {
        Scanner sc=new Scanner(System.in);
        //입력을 배열로
        //1. 배열 생성
        var array = new String[10];
        //2. 반복문 돌면서 집어넣기
        int i = 0;
        while(i < array.length) {
            array[i] = sc.next(); // str을 공백 기준으로 잘라서 넣어준다,
            i++;
        }

    }

}

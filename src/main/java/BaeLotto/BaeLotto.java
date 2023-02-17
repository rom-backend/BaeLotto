package BaeLotto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class BaeLotto {

    public static void main(String[] args) {

        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //bufferedReader.readLine();
        int scanNum = 5;
        printOutBaeLotto(scanNum);
    }

    public static void printOutBaeLotto(int scanNum) {

        IntStream.range(0, scanNum).forEach( e -> {
            ArrayList<Integer> integers = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int nextNum = (int) (Math.random() * 45) + 1;
                if (duplicateCheckNum(integers,nextNum)) {
                    j = j - 1;
                    continue;
                }
                integers.add(j, nextNum); //랜덤수 배열에 넣기
            }

            Collections.sort(integers);

            String sLottoNumb = "";

            /****배열에서 꺼내서 문자열로 바꿔줌******/
            for (Object num : integers) {
                sLottoNumb += num + ",";
            }
            /****배열에서 꺼내서 문자열로 바꿔줌 끝******/

            sLottoNumb = sLottoNumb.substring(0, sLottoNumb.lastIndexOf(",")); //마지막 문자열 , 제거

            System.out.println(sLottoNumb);
        });
    }

    public static boolean duplicateCheckNum(ArrayList<Integer> integers, int nextNum) {
        return integers.stream().filter(privousNum -> privousNum == nextNum).count() > 0;
    }

}

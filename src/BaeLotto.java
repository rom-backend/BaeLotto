import java.util.ArrayList;
import java.util.Scanner;

public class BaeLotto {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int scanNum = scan.nextInt();
        /*****로또 입력 받은 수 만큼 반복*****/
        for(int i = 0; i < scanNum; i++) {

            ArrayList array = new ArrayList();

            for (int j = 0; j < 6; j++) {
                array.add(j, (int) (Math.random() * 45)+1); //랜덤수 배열에 넣기
            }

            String sLottoNumb = "";
            
            /****배열에서 꺼내서 문자열로 바꿔줌******/
            for (Object num : array) {
                sLottoNumb += num + ",";
            }
            /****배열에서 꺼내서 문자열로 바꿔줌 끝******/

            sLottoNumb = sLottoNumb.substring(0, sLottoNumb.lastIndexOf(",")); //마지막 문자열 , 제거

            System.out.println(sLottoNumb);

        }
        /******로또 입력 받은 수 만큼 반복 끝*****/
    }
}

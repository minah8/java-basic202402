package basic.constate;

import java.util.Scanner;

public class IfQuiz {

    public static void main(String[] args) {

        /*
        - 정수 3개를 입력 받습니다. (변수 하나씩 선언해서 따로따로 받으세요.)
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.

        # max, mid, min이라는 변수를 미리 선언하셔서
         판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
         마지막에 한번에 출력하시면 되겠습니다.
        */

        Scanner sc = new Scanner(System.in);

        int max, mid, min;

        System.out.print("정수 1: ");
        int x = sc.nextInt();
        System.out.print("정수 2: ");
        int y = sc.nextInt();
        System.out.print("정수 3: ");
        int z = sc.nextInt();

        /*
        max = x;
        if (max < y) max = y;
        if (max < z) max = z;

        min = x;
        if(min > y) min = y;
        if(min > z) min = z;

        mid = x + y + z - min - max;
        System.out.println("가장 큰 값: " + max + " 가장 작은 값: " + min + " 중간값: " + mid);
        */

        if(x > y && x > z) { // x가 max다!
            max = x;
            if(y > z) {
                mid = y; min = z;
            } else {
                mid = z; min = y;
            }
        } else if (y > x && y > z) { // y가 max다!
            max = y;
            if(x > z) {
                mid = x; min = z;
            } else {
                mid = z; min = x;
            }
        } else { // z가 max다!
            max = z;
            if (x > y) {
                mid = x;
                min = y;
            } else {
                mid = y;
                min = x;
            }
        }

        System.out.println("=============================");
        System.out.println("max = " + max);
        System.out.println("mid = " + mid);
        System.out.println("min = " + min);


        sc.close();


    }
}

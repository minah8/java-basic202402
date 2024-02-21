package basic.array;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifyQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
        System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));

        // 1. 수정 타겟의 이름을 입력받는다.
        // 2. 해당 이름이 있는지 탐색해본다.
        // 3. 탐색에 성공하면 해당 이름의 인덱스를 알아온다.
        // 4. 탐색에 실패하면 실패한 증거를 확보한다.
        // 5. 성공했을 시 수정을 원하는 새로운 이름을 입력받는다.
        // 6. 찾은 인덱스를 통해 새로운 이름으로 수정한다.
        // 7. 위 내용을 수정이 정확히 완료될때까지 반복한다.

        System.out.println("수정할 친구의 이름을 입력해주세요.");
        String target = sc.next();

        boolean flag = false;
        while (true) {
        for (int i = 0; i < kakao.length; i++) {
            if (target.equals(kakao[i])) {
                System.out.println("i = " + i);
                flag = true;

                System.out.println("수정할 이름을 입력해주세요.");
                String newName = sc.next();
                kakao[i] = newName;

                break;
            }
        }

        if (!flag) {
            System.out.println("확보 실패!");
            continue;
        } else {
            System.out.println("수정된 친구 목록: " + Arrays.toString(kakao));
        }
    }




    }

}

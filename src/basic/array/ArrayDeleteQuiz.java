package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
        System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));


        /*
         1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.

         2. 입력받은 이름이 없다면 없다고 얘기해 주세요.

         - 추가
         배열의 길이가 0이 될 때까지 삭제를 반복해 보세요.
         더 이상 지울 친구가 없다면 프로그램 종료.
         */

        while (true) {

            if(kakao.length == 0) {
                System.out.println("더 이상 삭제할 친구가 없네요.");
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("친구들 목록: " + Arrays.toString(kakao));
            System.out.println("삭제할 친구 이름");
            System.out.print(">> ");
            String delName = sc.next();

            /*
            boolean flag = false;

            for (int i = 0; i<kakao.length; i++) {

                if (delName.equals(kakao[i])) {

                    for(int j = i; j<kakao.length-1; j++) {
                        kakao[j] = kakao[j+1];
                    }

                    String[] temp = new String[kakao.length-1];

                    for (int k = 0; k<temp.length; k++) {
                        temp[k] = kakao[k];
                    }

                    kakao = temp;
                    temp = null;
                    flag = true;
                    break;

                    }
                }
                if (!flag) {
                    System.out.printf("%s은(는) 존재하지 않는 이름입니다.", delName);
                }

                if (kakao.length == 0) {
                    System.out.println("실행을 종료합니다.");
                    break;
                }

             */

            // 인덱스 탐색
            int index = -1;
            for (int i = 0; i < kakao.length; i++) {
                if (delName.equals(kakao[i])) {
                    index= i;
                    break;
                }
            }

            // 삭제 여부 확인
            if (index != -1) {
                System.out.println(kakao[index] + "의 이름을 삭제합니다.");

                // 삭제 알고리즘
                for (int i = index; i < kakao.length-1; i++) {
                    kakao[i] = kakao[i+1];
                }

                String[] temp = new String[kakao.length-1];

                for (int i = 0; i < temp.length; i++) {
                    temp[i] = kakao[i];
                }

                kakao = temp; temp = null;
                System.out.println("# 삭제 후 정보: " + Arrays.toString(kakao));

            } else {
                System.out.printf("해당이름(%s)은(는) 존재하지 않습니다.\n", delName);
            }


            }

            sc.close();
        }

    }



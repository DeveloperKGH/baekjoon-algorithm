/* 
A*B

문제

두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A×B를 출력한다.

예제 입력 1 
1 2

예제 출력 1 
2

예제 입력 2 
3 4

예제 출력 2 
12
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        calcToPrint(a, b);
    };

    public static void calcToPrint(int a, int b) {
        System.out.println(a * b);
    }

}

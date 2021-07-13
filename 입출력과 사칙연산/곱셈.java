/* 
곱셈

문제
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

입력
첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

출력
첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

예제 입력 1 
472
385

예제 출력 1 
2360
3776
1416
181720

*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int hundredDigit = b / 100;
        int tenDigit = (b % 100) / 10;
        int unitDigit = (b % 100) % 10;

        int unitsMultiplied = a * unitDigit;
        int tensMultiplied = a * tenDigit;
        int hundredsMultiplied = a * hundredDigit;

        System.out.println(unitsMultiplied);
        System.out.println(tensMultiplied);
        System.out.println(hundredsMultiplied);
        System.out.println((hundredsMultiplied * 100) + (tensMultiplied * 10) + unitsMultiplied);

    }

}

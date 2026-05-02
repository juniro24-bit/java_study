import java.util.Scanner;
import java.util.Random;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== 가위바위보 게임 ===");
        System.out.println("1: 가위, 2: 바위, 3: 보, 0: 종료");

        while (true) {
            System.out.print("선택하세요: ");
            // scanner.nextInt()는 사용자로부터 정수를 입력받는 메서드입니다.
            int userChoice = scanner.nextInt();

            // 1. 종료 조건 확인 (if문 사용)
            // 사용자가 0을 입력하면 break를 통해 while 반복문을 빠져나갑니다.
            if (userChoice == 0) {
                System.out.println("게임을 종료합니다.");
                break;
            }


            // [추가 힌트] 입력값 유효성 검사
            // 사용자가 1, 2, 3 외의 숫자를 입력했을 때 "잘못된 입력"임을 알리고 
            // continue를 사용해 다시 입력받게 하면 더 견고한 프로그램이 됩니다.
            if (userChoice < 1 || userChoice > 3) {
                System.out.println("1, 2, 3 중에서 선택해주세요 (0은 종료).");
                continue;
            }

            // 2. 컴퓨터의 선택 (1~3 랜덤 생성)
            // random.nextInt(3)은 0, 1, 2 중 하나를 생성하므로 +1을 해서 1, 2, 3으로 만듭니다.
            int computerChoice = random.nextInt(3) + 1;
            String userHand="";
            switch (userChoice) {
                case 1:
                    userHand = "가위";
                    break;
                case 2:
                    userHand = "바위";
                    break;
                case 3:
                    userHand = "보";
                    break;
            }
            switch (computerChoice) {
                case 1:
                    System.out.println("가위");
                    break;
                case 2:
                    System.out.println("바위");
                    break;
                case 3:
                    System.out.println("보");
                    break;
            }

            // 3. 사용자와 컴퓨터의 선택 출력
            /* 
             * [힌트] 숫자로만 출력하면 재미없으니 "가위", "바위", "보" 글자로 바꿔봅시다.
             * 
             * 변수 선언 예시: String userHand = "";
             * - if (userChoice == 1) { userHand = "가위"; } ...
             * - 또는 switch (userChoice) { case 1: userHand = "가위"; break; ... }
             * 
             * 컴퓨터의 선택(computerChoice)도 똑같이 변환해 보세요.
             */
            // 여기에 출력을 위한 변환 및 System.out.println 코드를 작성하세요.


            // 4. 승부 판정 로직 (if-else if-else 또는 switch문 사용)
            /*
             * [힌트] 경우의 수를 나누어 생각해보세요.
             * 1. 비기는 경우: userChoice == computerChoice
             * 2. 사용자가 이기는 경우 (논리 연산자 &&와 ||를 쓰면 한 번에 묶을 수 있어요):
             *    - (사용자 가위(1) AND 컴퓨터 보(3)) OR
             *    - (사용자 바위(2) AND 컴퓨터 가위(1)) OR
             *    - (사용자 보(3) AND 컴퓨터 바(2))
             * 3. 그 외의 모든 경우: "졌다" (else 처리)
             */
            // 여기에 판정 로직을 작성하고 결과를 출력하세요 (예: "이겼습니다!", "비겼습니다!")
            if(userChoice == computerChoice){
                System.out.println("비겼습니다!");
                break;
            }

            if(userChoice == )

            System.out.println("--------------------");
        }

        scanner.close();
    }
}

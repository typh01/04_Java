package loop.practice;

import java.util.Scanner;

/**
 * 기능 제공용 클래스
 */
public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	/* 1번
	 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
	 * 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	 */
	public void practice1(){
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i=1 ; i<=num; i++) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	
	
	/* 2번
	 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
	 * 단, 입력한 수는 1보다 크거나 같아야 합니다
	 */
	public void practice2(){
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i=num ; i>0; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
	}
	
	
	
	/* 3번
	 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
	 */
	public void practice3(){
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++){
			System.out.print(i + " ");
			sum += i;
			if(i==num) {
				System.out.println("=" + sum);
				break;
			}
			System.out.print("+ ");
		}
		
	}
	
	
	
	/* 4번
	 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	 * 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	 */
	public void practice4(){
		System.out.print("첫 번째 숫자 : ");
		int start = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int end = sc.nextInt();
		
		if(start < 1 || end < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else if(start > end) {
			int temp = end;
			end = start;
			start = temp;
		}
		for(int i=start; i<=end; i++) {
			System.out.print(i + " ");
		}
		
	}
	
	
	/* 5번
	 * 사용자로부터 입력 받은 숫자의 단을 출력하세요.
	 */
	public void practice5(){
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("=====" + num + "단 =====");
		for(int i=1; i<=9 ; i++) {
			System.out.printf("%d * %d = %d \n", num, i, num*i);
		}
	}
	
	
	/* 6번
	 * 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
	 * 단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요
	 */
	public void practice6(){
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num>1 && num<10) {
			for(int i=num; i<=9; i++) {
				System.out.println("=====" + i + "단 =====");
				for(int l=1; l<=9; l++) {
					System.out.printf("%d * %d = %d \n", i, l, i*l);
				}
			}
			
		} else {
			System.out.println("2 ~ 9 사이 숫자만 입력해주세요.");
		}
	}
	
	/* 7번
	 * 입력 받은 정수에따라 피라미드 모양 * 출력 1
	 */
	public void practice7(){
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/* 8번
	 * 입력 받은 정수에따라 피라미드 모양 * 출력 2
	 */
	public void practice8(){
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=num; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	/* 9번
	 * 입력 받은 정수에따라 피라미드 모양 * 출력 3
	 */
	public void practice9(){
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=num; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	/* 10번
	 * 입력 받은 정수에따라 피라미드 모양 * 출력 4
	 */
	public void practice10(){
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<=num; i++) {
			for(int j=num; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/* 11번
	 * 입력 받은 정수에따라 피라미드 모양 * 출력 5
	 */
	public void practice11(){
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		for(int row=1; row<=input; row++) {
			//앞쪽 공백 추가 방법 1
			for(int blank=1 ; blank <= input-row ; blank++) {
				System.out.print(" ");
			}
			for(int col=1; col<=2*row-1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//강사님 풀이
	public void practice11_2(){
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		for(int row=1; row<=input; row++) {
			for(int col=1; col <= 2 * input - 1; col++) {
				
				//앞쪽 공백 추가 방법 2
// 				if(col <= input - row) {
//              뒤쪽 깎기           앞쪽 깎기 
				if(input - row >= col || input + row <= col) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				
			}
			System.out.println(); // 줄바꿈
		}
	}
	
	
	/* 12번
	 * 입력 받은 정수에따라 사각형 모양 * 출력
	 */
	public void practice12() {
    System.out.print("숫자 : ");
    int input = sc.nextInt();

    for(int row=1; row<=input ; row++) {
    	
    	for(int col=1; col<=input ; col++) {
    		// 첫번째/마지막 행/열만 * 출력
    		if(row == 1 || row == input || col == 1 || col == input) {
    			System.out.print("*");    			
    		}else {
    			System.out.print(" ");
    		}
    	}
    	System.out.println(); // 줄바꿈
    }
	}
	
	
	/* 13번
	 * 1부터 사용자에게 입력 받은 수까지 중에서
	 * 	1) 2와 3의 배수를 모두 출력하고
	 * 	2) 2와 3의 공배수의 개수를 출력하세요.
	 */
	public void practice13(){
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int count = 0;
		
		for(int i=1; i<=num; i++) {
			if(i%2==0 || i%3==0) {
				System.out.print(i + " ");
				if(i%6 == 0) {
					count++;
				}
			} 
		}
		System.out.print("\ncount : " + count);
	}
	
	
	/* 14번
	 * 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
	 * 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요
	 */
	public void practice14(){
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		boolean result = true;
		
		if(num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		for(int i=2; i<num ; i++) {
			if(num%i == 0) {
				result = false;
				break;
			}
		}
		
		System.out.println(num + (result ? "은 소수입니다." : "은 소수가 아닙니다."));
		
	}
	
	
	
	/* 15번
	 * 위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우
	 * “잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
	 */
	public void practice15(){
		boolean now = true;
		 while (now) {
       System.out.print("숫자 : ");
       int num = sc.nextInt();

       if (num < 2) {
           System.out.println("잘못 입력하셨습니다.");
           continue;
       }
       

    boolean result = true;
		
		for(int i=2; i<num ; i++) {
			if(num%i == 0) {
				result = false;
				break;
			}
		}
		
		System.out.println(num + (result ? "은 소수입니다." : "은 소수가 아닙니다."));
		now = false;
		}
	}
	
	
	
	/* 16번
	 * 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
	 * 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
	 */
	public void practice16() {
    System.out.print("숫자 : ");
    int num = sc.nextInt();

    if (num < 2) {
        System.out.println("잘못 입력하셨습니다.");
        return; 
    }

    int count = 0; // 소수의 개수를 세기 위한 변수

    // 2부터 입력 받은 수까지 1개씩 접근하는 for 문
    for (int i = 2; i <= num; i++) { 
        boolean result = true;  
        // true 인 경우 : 소수 O
        // false 인 경우 : 소수 X

        // + 제곱근을 이용하면 훨씬 더 적은 연산으로 계산 가능
        // 1과 자기자신(num)을 뺀 정수를 한개씩 접근
        for (int x= 2; x < i; x++) { 
        	
            if (i % x == 0) { // 1, 자기자신 빼고 나누어 떨어지는 수 존재
                result = false;
                break; 
            }
        }

        if (result) { // 소수라고 판별된 경우 수행
    				System.out.print(i + " ");
            count++;
        }
    }

    System.out.printf("\n2부터 %d 까지 소수의 개수는 %d개 입니다.", num, count);
	}
}



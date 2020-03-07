import java.util.Scanner;

//while循环的使用
//do...while循环语句：
//不管循环条件，先循环一次再判断

public class T200307 {
	public static void main(String[] args) {
		//找到100——200中第一个三的倍数
		int i = 100;
		while(i <= 200) {
			if(i%3 == 0) {
				System.out.println(i);
				break;
			}
			i++;
		}
		//找到100——200中所有3的倍数
		i = 100;
		while(i <= 200) {
			if(i%3 != 0) {
				i++;
				continue;//回到while
			}
			System.out.print(i + " ");
			i++;
		}
		//或
		System.out.print("\n");

		i = 100;
		while(i <= 200) {
			if(i%3 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
	}

	public static void main3(String[] args) {
		//计算 1! + 2! + 3! + 4! + 5! + n!
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int j = 1;
		int sum = 0;
		while(j <= n) {
			int i = 1;
			int ret = 1;
			while(i <= j) {
				ret *= i;
				i++;
			}
			sum += ret;
			j++;
		}
		System.out.print(sum);
	}

	public static void main2(String[] args) {
		//while(表达式):表达式为布尔表达式
		//若打印结果不需换行，则将println换为print
		
		//1——100奇数的和
		int i = 1;
		int sum = 0;
		while( i <= 100) {
			sum = sum + i;
			i += 2;
		}
		System.out.print(sum + " ");//2500

		//1——100偶数的和
	    i = 2;
	    sum = 0;
	    while(i <= 100) {
	    	sum += i;
	    	i += 2;
	    }
		System.out.print(sum);//2550
	}

	public static void main1(String[] args) {
		//计算1--100的和
		int i = 1;
		int sum = 0;
		while(i <= 100) {
		    sum += i;
			i++;
		}
		System.out.print(sum);//5050
	}
}
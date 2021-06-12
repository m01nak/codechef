	import java.util.Scanner;
	
	class HS08TEST {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			float withdraw_amount = scanner.nextFloat();
			float account_balance = scanner.nextFloat();
			scanner.close();
			
			withdraw(withdraw_amount, account_balance);
		}
		
		private static void withdraw(float withdraw_amount, float account_balance) {
			if(withdraw_amount % 5 != 0  ||  account_balance-withdraw_amount-0.5 < 0) {
				System.out.println(account_balance);
			} else {
				System.out.printf("%.2f",account_balance-withdraw_amount-0.5);
			}
		}
	}

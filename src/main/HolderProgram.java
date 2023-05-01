package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Holder;

public class HolderProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Holder holder;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initiaDeposit = sc.nextDouble();
			holder = new Holder(number, name, initiaDeposit);
		} else {
			holder = new Holder(number, name);
		}

		System.out.println();

		System.out.println("Account data: ");
		System.out.println(holder);
		System.out.println();

		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		holder.deposit(deposit);
		System.out.println("Updated account data:");
		System.out.println(holder);
		System.out.println();

		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		holder.withdraw(withdraw);
		System.out.println("Updated account data:");
		System.out.println(holder);

		sc.close();

	}

}

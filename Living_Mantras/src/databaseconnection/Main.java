package databaseconnection;
import java.util.*;
import java.sql.*;

public class Main {
	static admin a=new admin();
	static user u=new user();

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int option;
		System.out.println("1. Admin");
		System.out.println("2. user");
		System.out.println("Enter option");
		option=sc.nextInt();
		switch(option)
		{
		case 1:
			a.task();
			break;
		case 2:
			u.task();
			break;
			
	}

}
}

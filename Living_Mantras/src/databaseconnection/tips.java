package databaseconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class tips {



	public void healthy() {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int option;
		System.out.println("1. exercise");
		System.out.println("2. food");
		System.out.println("3. jokes");
			System.out.println("4. feedback");
			System.out.println("5. signout");
		System.out.println("Enter option");
	
		int n=6;
		do
		{
			option=sc.nextInt();
		switch(option)
		{
		
		
		
		case 1:
		
			try {
				Connection conn;
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","oracle","db");
				Statement st=conn.createStatement();
				
				ResultSet rs=st.executeQuery("SELECT * from exercise");
				System.out.println("exercise_tips");
				System.out.println("----------------------------------------------------------------");
				while(rs.next())
				{
					System.out.print(rs.getString(1) + "\t");
					
				    System.out.println();
				}
			
				conn.close();
			}
			catch(Exception e)
			{
				System.err.println("Got an exceptional");
			}
			break;
		case 2:
			
			try {
				Connection conn;
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","oracle","db");
				Statement st=conn.createStatement();
				
				ResultSet rs=st.executeQuery("SELECT * from food");
				System.out.println("food_tips");
				System.out.println("----------------------------------------------------------------");
				while(rs.next())
				{
					System.out.print(rs.getString(1) + "\t");
					
				    System.out.println();
				}
			
				conn.close();
			}
			catch(Exception e)
			{
				System.err.println("Got an exceptional");
			}
			break;
			
		case 3:
			
			try {
				Connection conn;
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","oracle","db");
				Statement st=conn.createStatement();
		
				ResultSet rs=st.executeQuery("SELECT * from jokes");
				System.out.println("comedy_jokes");
				System.out.println("----------------------------------------------------------------");
				while(rs.next())
				{
					System.out.print(rs.getString(1) + "\t");
					
				    System.out.println();
				}
			
				conn.close();
			}
			catch(Exception e)
			{
				System.err.println("Got an exceptional");
			}
		break;
		case 4:
			
			try {
				Connection conn;
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","oracle","db");
				Statement st=conn.createStatement();
				
				PreparedStatement ps=conn.prepareStatement("insert into feedback values(?,?)");
				System.out.println("database connectivity is successfull");
				System.out.println("enter name");
				String name=sc.next();
				
				System.out.println("enter Feedback or Suggestion");
				String FEEDBACK_OR_SUGG=sc.next();
				
				ps.setString(1,name);
				
				ps.setString(2,FEEDBACK_OR_SUGG);
				
				ps.executeUpdate();
				ResultSet rs=st.executeQuery("SELECT * from feedback");
				System.out.println("name"+"\t"+"FEEDBACK_OR_SUGG");
				System.out.println("-----------------------------------------------------------------");
				while(rs.next())
				{
					System.out.print(rs.getString(1) + "\t\t");
					System.out.print(rs.getString(2) + "\t");
					
					System.out.println();
										
				}
			
				conn.close();
			}
			catch(Exception e)
			{
				System.err.println("Got an exceptional");
			}

			break;
		}
		System.out.println("\n");
		
		System.out.println("Do u want to continue or exit");
		System.out.println("type\n 1.continue");
		System.out.println("2.exit");
		int op = sc.nextInt();
		if(op==1)
		{
			n=6;
			System.out.println("1. exercise");
			System.out.println("2. food");
			System.out.println("3. jokes");
				System.out.println("4. feedback");
				System.out.println("5. signout");
			System.out.println("Enter option");
		
		}
		else
		{
			n=2;
		}
		
		
		}
		
		while(n==6);
		
	
		}
			
			
		}
		
		
	



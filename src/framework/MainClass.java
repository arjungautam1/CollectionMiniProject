package framework;
import java.util.Scanner;

public class MainClass {
public static void main(String[] args) throws Exception {
	while(true)
	{
		System.out.println("\n");
		System.out.println("1.Insert Data into database."+"\n"+"2.Using Array List "+"\n"+"3.Using HashSet"+"\n"+"4.Using HashMap");
		
		System.out.println("\n"+"Enter your choice :");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			RandomIdentifier obj=new RandomIdentifier();
			obj.insert();
			break;
		case 2:
			UsingArrayList arr=new UsingArrayList();
			arr.array();
			break;
		case 3:
			UsingHashSet hash=new UsingHashSet();
			hash.hashset();
			break;
		case 4:
			UsingHashMap hashm=new UsingHashMap();
			hashm.hashmap();
			break;
			
		default:
			System.out.println("Invalid Input");
			break;
		}
		
		
	}
}
}

package mainpackage;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Users u1 = new Admins("Gogo","Stefi","p21023");
		System.out.println(u1.name);*/
		
		Scanner console = new Scanner(System.in);
		int response1, response2;
		String password, username, name;
		
		do {
			System.out.println("Welcome!");
			System.out.println("Press number 1 if you are a Customer");
			System.out.println("Press number 2 if you are a ContentAdmin");
			System.out.println("Press number 3 if you are an Admin");
			System.out.println("Press number 4 if you want to exit the program");
			response1 = console.nextInt();
			console.nextLine();
			switch(response1) {
			case 1:
				
				System.out.println("Enter Name :");
				name = console.nextLine();
				System.out.println("Enter Username :");
				username = console.nextLine();
				System.out.println("Enter Password :");
				password = console.nextLine();
				
				
				Customers user = new Customers(name, username, password);
				user.login(user.username, user.password);
				
				System.out.println("What operation would you like to perform ?");
				System.out.println("Press number 1 if you want to see the Films");
				System.out.println("Press number 2 if you want to make a reservation");
				System.out.println("Press number 3 if you want to see your reservation");
				System.out.println("Press number 4 if you want to log out");
				response2 = console.nextInt();
				console.nextLine();
				switch(response2) {
				case 1:
					for(String movies : user.showAvailableFilms()) {
					System.out.println(movies);
					}
				case 2:	
				}
				
			case 2:
				
				System.out.println("Enter Name :");
				name = console.nextLine();
				System.out.println("Enter Username :");
				username = console.nextLine();
				System.out.println("Enter Password :");
				password = console.nextLine();
			
			
				ContentAdmins user1 = new ContentAdmins(name, username, password);
				user1.login(user1.username, user1.password);
				
				System.out.println("What operation would you like to perform ?");
				System.out.println("Press number 1 if you want to insert film");
				System.out.println("Press number 2 if you want to");
				System.out.println("Press number 3 if you want to");
				System.out.println("Press number 4 if you want to log out");
				
				response2 = console.nextInt();
				console.nextLine();
				switch(response2) {
				case 1:
					System.out.println("Insert Film Id :");
					int filmId = console.nextInt();
					console.nextLine();
					System.out.println("Insert Film Name :");
					String filmName = console.nextLine();
					System.out.println("Insert Film Category :");
					String filmCategory = console.nextLine();
					System.out.println("Insert Film Description :");
					String filmDescription = console.nextLine();
					user1.insertFilm(filmId, filmName, filmCategory, filmDescription);
					Films film1 = new Films(filmId, filmName, filmCategory, filmDescription);
					System.out.println(film1.getFilmTitle());
				}
				
			case 4:
				break;
			}
			
		}while(response1 !=4);
		

		console.close();
	}

}

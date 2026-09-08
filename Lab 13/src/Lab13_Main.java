/*Sean Kerr
 * CPSC-06
 * Prof. Hogan
 * August 6th, 2026
 */
public class Lab13_Main {

	public static void main(String[] args) {
		Restaurant rest1 = new Restaurant();
		Restaurant rest2 = new Restaurant();
		Restaurant rest3 = new Restaurant();
		
		rest1.setName("Domino's Pizza");
		rest1.setLocation("W. Main St, Merced");
		rest1.setPhoneNumber("(209) 233-9382");
		rest1.setRating(3.5);
		
		rest2.setName("Wingstop");
		rest2.setLocation("Yosemite Ave, Merced");
		rest2.setPhoneNumber("(209) 383-9464");
		rest2.setRating(2.9);
		
		rest3.setName("Pretty Good Burger");
		rest3.setLocation("W Main St, Merced");
		rest3.setPhoneNumber("(209) 626-5088");
		rest3.setRating(4.5);
		
		System.out.println("Restrauant 1 Details:");
		System.out.println("Name: " + rest1.getName());
		System.out.println("Location: " + rest1.getLocation());
		System.out.println("Phone Number: " + rest1.getPhoneNumber());
		System.out.println("Rating: " + rest1.getRating());
		System.out.println();
		
		System.out.println("Restrauant 2 Details:");
		System.out.println("Name: " + rest2.getName());
		System.out.println("Location: " + rest2.getLocation());
		System.out.println("Phone Number: " + rest2.getPhoneNumber());
		System.out.println("Rating: " + rest2.getRating());
		System.out.println();
		
		System.out.println("Restrauant 3 Details:");
		System.out.println("Name: " + rest3.getName());
		System.out.println("Location: " + rest3.getLocation());
		System.out.println("Phone Number: " + rest3.getPhoneNumber());
		System.out.println("Rating: " + rest3.getRating());
		System.out.println();
		System.out.print("It pushed");
		
	}

}

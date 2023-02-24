
public class PhoneBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBook phBook=new PhoneBook("Friends",10);
		
		Contact contact=new Contact("Sarthak","3445664565","sarthak@hdkh");
		phBook.add(contact);
		
		phBook.add("Pratik","234344232","pratikrpawar@");
		phBook.display();
		Contact searchContact=phBook.search("Pratik");
		System.out.println(searchContact.getName());
		
		
		
		phBook.changeMobileNumber("Sarthak", "3455656454");
		phBook.display();
		
		String str="abc";
		String str2=str.concat("Pratik");
		System.out.println(str2);
		
		byte[] char1=str.getBytes();
		System.out.println(char1[1]);
		
		
		String email="pratikspawar321@gmail.com";
		System.out.println(str.matches(".[ac]c$"));
		System.out.println(str2.matches(".[abc][chfg]....ik$"));
		System.out.println(email.matches("[a-z]+(@gmail).com$"));
		
		
		System.out.println(str2.substring(3));
		System.out.println(str.toCharArray());




		
		
		

	}

}

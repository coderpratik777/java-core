
public class PhoneBook {
	
	private String name;
	private Contact[] contacts;
	private int index;
	
	public PhoneBook()
	{
//		this.name="My PhoneBook";
//		this.contacts=new Contact[1000];  Avoid using the duplicate code
		this("My PhoneBook",1000);
	}
	public PhoneBook(String name, int noOfEntries) {
		super();
		this.name = name;
		this.contacts = new Contact[noOfEntries];
	}
	
	public void add(String name,String mobileNumber,String emailAddress)
	{
		Contact c=new Contact(name,mobileNumber,emailAddress);
		add(c);
		
	}
	public void add(Contact contact)
	{
		contacts[index++]=contact;
	}
	
	public Contact search(String name)
	{
//		Contact contact;
//		for(int i=0;i<index;i++)
//		{
//		   contact=contacts[i];
//		   if(contact.getName()==name)
//		   {
//			   return contact;
//		   }
//			   
//		}
//		return null;
		for(int i=0;i<index;i++)
			if(contacts[i].getName()==name)
				return contacts[i];
		return null;
	}
	
	public void changeMobileNumber(String name,String newMobileNumber)
	{
		Contact contact=search(name);
		contact.setEmailAddress(newMobileNumber);
	}
	
	
	
	public void display()
	{
		System.out.println("Details of "+name+" PhoneBook");
		for(int i=0;i<index;i++)
		{
			Contact contact=contacts[i];
			System.out.println(contact.getName()+" "+contact.getMobileNumber()+" "+contact.getEmailAddress());
			
		}
	}

}

package homeWork;



public class UserManager {
	
     public void Add(User user ) {
		
		System.out.println( "User Added");
		
		
	}
	
	public void addMultiple(User[]users) {
		for (User user : users) {
			Add(user);
		}
	

   }

	public void add(Logger logger) {
		
			System.out.println( "User Added");
			
			logger.log();
		}
		
	}


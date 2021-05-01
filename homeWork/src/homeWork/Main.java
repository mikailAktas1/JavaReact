package homeWork;


public class Main {

	public static void main(String[] args) {
		
		
		Student student1 = new Student();
		student1.setName("mikail");
		student1.setLastName("Aktaş");
		student1.setId(13);
		student1.setEmail("123456@gmail.com");
		
		Instructor instructor1= new Instructor();
		instructor1.setId(1);
		instructor1.setName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setPassword("123456");
		
		
	
      Student[] students= new Student[]{student1};
		
		for(Student student: students) {
			System.out.println("ögrencinin adı:"+student.getName());
			System.out.println("ögrencinin soyadı:"+student.getLastName());
			System.out.println("ögrencinin mail adresi:"+student.getEmail());
			
		}
		
		
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.Add(new InstructorLogger());
		
		StudentManager studentManager = new StudentManager();
		studentManager.Add(new studentLogger());
		
		UserManager userManager = new UserManager();
		userManager.add(new userLogger());
		

	}

}

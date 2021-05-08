
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course course1=new Course();
		course1.id=1;
		course1.name="C# + Angular";
		course1.instructor="Engin Demiroğ";
		
		Course course2=new Course();
		course2.id=2;
		course2.name="Java + React";
		course2.instructor="Engin Demiroğ";
		
        Course[] courses = {course1, course2};
		
		for (Course course3 : courses) {
			System.out.println("Kurs: " + course3.name + " >> Eğitmen: " + course3.instructor);
		}
		
        CourseManager courseManager = new CourseManager();
		
		courseManager.add(course1);
		courseManager.delete(course2);

		Student student1 = new Student(1,"Ayşe","Tunalı","aysetunalı@hotmail.com","12345");
		Student student2 = new Student(2,"Ahmet","Uysal","ahmetuysal@hotmail.com","12345");
		
		Student [] students = {student1,student2};
		for (Student student3 : students) {
			
			System.out.println("Öğrenci: " + student3.firstName + " " +  student3.lastName);
			
		}
		
        Instructor instructor = new Instructor(1,"Engin","Demiroğ");
		
		System.out.println("Egitmen : " + instructor.firstName + " " + instructor.lastName );
		
		
		
		
		
		
		
	}

}

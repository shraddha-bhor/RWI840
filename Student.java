
    public class Student extends Person{
	
	

        int rollno;
        String course;
        
        public Student(int id, String name, int rollno, String course) {
            super(id, name);
            this.rollno = rollno;
            this.course = course;
        }
        
    public static void main(String[] args) {
            
            Student s1 = new Student (15,"Shradha", 100,"Java");
            System.out.println(s1.id);
            System.out.println(s1.name);
            System.out.println(s1.rollno);
            System.out.println(s1.course);
        }
        
    
    }




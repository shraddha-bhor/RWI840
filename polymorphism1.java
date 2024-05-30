public class polymorphism1 {
    

        int EmpId;
        String EmpNm;
        float salary;
        String position;
        
        public void printInfo(int EmpId) {
                 System.out.println(EmpId);
        }
        public void printInfo(String EmpNm) {
            System.out.println(EmpNm);
             
        }
   public void printInfo(float salary,String position) {
       System.out.println(salary);
             System.out.println(position);
        }
   
        public static void main(String[] args) {
           
            polymorphism1 ma = new polymorphism1();
            ma.printInfo(10);
            ma.printInfo("Sandeep");
            ma.printInfo(17400, "Manager");
       }
   }



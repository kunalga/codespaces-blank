public class contype {
    public static void main(String[] args) {
        // 
        student s1 = new student();
                s1.name ="kunal";
                s1.Passwords ="abc";
                s1.roll =59;
                s1.mask[0] =75;
                s1.mask[1] =80;
                s1.mask[2] =90;
                student s2 = new student(s1);
                s2.mask[2] =23;
                s2.Passwords = "kunal";
                System.out.println(s1.Passwords);  
                for(int i=0;i<s1.mask.length;i++){
                    System.out.println(s2.mask[i]);
                }



        
            }
        }
        //type of Constructor 
        class student {
            String name;
            String Passwords ;
            int roll;
            int mask[];
            //copy Constructor 
            public student(student s1) {
                mask = new int[3];
                this.name = s1.name;
                this.roll = s1.roll;
                this.mask = s1.mask;
            }
            student() {
                mask = new int[3];
                //why is empty 
            }
    

    /*
    //Non Parameter Constructor
     student() {
        System.out.println("Hello world !");
     }
     //Parameter Constructor 
      student(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a+b);

    }

     */

    
}
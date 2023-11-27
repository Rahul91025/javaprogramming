 //package inheritance;
class student{
    int age;
    void sleep(){
        age = 20;
        System.out.println("HUMAN NEEDS GOOD AND HEALTHY SLEEP!!!");
        System.out.println(age);
    }
}
     class student1 extends student{

    }
    public class code1{
        public static void main(String[] args){
            student1 st = new student1();
            st.sleep();

        }
    }

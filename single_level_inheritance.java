class Human{
    int age;
    void sleep(){
        age =20;
        System.out.println("Human needs good sleep!!!");
        System.out.println(age);
    }

}
class student extends Human {

}

public class single_level_inheritance {
    public static void main(String [] args){

    
    student s1 = new student();
    s1.sleep();
    
}
}


class demo1{
    void disp(){
        System.out.println("Disp. written in demo1 class");
    }
     void rahul(){
System.out.println("Hii,Rahul!!!");
    }
}
class demo2 extends demo1{

}
class demo3 extends demo2{

}

public class multilevel_inheritance {
    public static void main(String []args){
        demo3 st1 = new demo3();
        st1.disp();
        demo2 st2 = new demo2();
        st2.disp();
        st2.rahul();

    }
    
}

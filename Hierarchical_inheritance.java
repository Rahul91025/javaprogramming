class animal{
    void sleep(){
        System.out.println("Animal need sleep");
        System.out.println("Animal is lovingly");
    }
}
class tiger extends animal{

}
class monkey extends  animal{

}
class deer extends animal{

}
public class Hierarchical_inheritance {
    public static void main(String[] args){
        tiger st1= new tiger();
        st1.sleep();
        monkey st2 = new monkey();
        st2.sleep();
        deer st3 = new deer();
        st3.sleep();
    }
    
}

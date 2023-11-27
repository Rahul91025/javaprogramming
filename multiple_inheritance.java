import javax.swing.plaf.synth.SynthStyleFactory;

class parent1{
    void mobile(){
        System.out.println("Donot use mobile much ");
    }
}
class parent2{
    void sleep(){
        System.out.println("Do not sleep much");
    }
}
class child  extends parent1{  //parnet2 cannot be refrence

}
public class multiple_inheritance {
    public static void main(String[] args){
        child st1 = new child();
        //st1.sleep(); // b/c it is not refering parent2
        st1.mobile();
    }
    
}

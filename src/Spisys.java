/**
 * Created by paul on 8/11/16.
 */
public class Spisys extends Sub_class {

    int num = 50;

    //display method of sub class
    public void display() {
        System.out.println("This is the display method of Spisys");
    }

    public void my_method(){

        //Instantiating subclass
        Spisys sub = new Spisys();

        Sub_class sub_origin = new Sub_class();
        sub_origin.my_method();

        //Invoking the display() method of sub class
        sub.display();

        //Invoking the display() method of superclass
        super.display();

        //printing the value of variable num of subclass
        System.out.println("value of the variable named num in Spisys class:"+ sub.num);

        //printing the value of variable num of superclass
        System.out.println("value of the variable named num in super class:"+ super.num);
    }

    public static void main(String args[]){
        Spisys obj = new Spisys();
        obj.my_method();

        int a = 14;
        int b = 18;

                if(a != 18){
                    System.out.println("a");
                } else {
                    System.out.println("b");
                }

    }
}

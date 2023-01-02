package classComponents;

public class InstanceStatic2
{
    int num=10;// this is instance variable
    static int num2=20;// this is static variable

    public static void main(String[] args) {
        System.out.println("instance and static variable demo ");
        // create objevt of the calss
        // we can call the instance variable with hwlp of refernece and we need create object of the class
        // instance varibale get the memori in heap memory area

        InstanceStatic2 ref=new InstanceStatic2();
        System.out.println("instance varible num = "+ ref.num);
        // static varibale we can create with the help of static varoble
        // we get memory in class or method area only once at class loading
        //we can access with the help of class name
        // it is comman for all
        System.out.println("--------------------------");
        System.out.println("value of static variable is num2 = "+num2);
    }
}

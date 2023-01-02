package classComponents;

public class Blocks8

{
    // in java there are two types of block 1> static 2> instance
    {
        // this is instance block having no name as well as no modifiers
        // when object is create then automatically number of object create instace bloack also number of time execute
        // conting the object or loghing purpose we can use blocks
        System.out.println("this instane block");
    }
    static {
        System.out.println("this static block ");
        // we can create static block with help of static keyword always execcute loading the call in the memory
        // it is very faster
        // static block not waiting for main method execution before call only once get memory
    }
    public static void main(String[] args)
    {
        Blocks8 ref=new Blocks8();
        Blocks8 ref1=new Blocks8();
    }
}

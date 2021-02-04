package helloworld;

public class HelloWorldAdvanced
{
    //Declaring New String Variables in the public class
    private String x;
    
    HelloWorldAdvanced(String ThirdOne)
    {
       x = ThirdOne;
       
    }
    
    //Declaring New Strings in a Sub Class
    private static class Jambo
    {
        private static String Niaje;
        
        Jambo(String FourthOne)
        {
           Niaje = FourthOne;
           
        }
    }
    
    //Global Variable... Variable declared in the class
    //It will be printed as is, then it will be assigned to a variable and printed thereafter.
    public static String HelloWorld5 = "Hello World 5";
    
    
    
    
    
    /*
        Declaring Methods
    */
    
    //Method with Void
    public static void HelloWorld7()
    {
        String CalledString = "Hello World 7";
        System.out.println(CalledString);
    }
    
    //Method without void
    public static String HelloWorld8()
    {
        String AnotherOne = "Hello World 8";
        System.out.println(AnotherOne);
        
        return AnotherOne;
    }
    
    
    
    
    
    
    //Static Variables.
    //Declaring and Initializing. It is static because main is static.
    static String HelloWorld11 = "Hello World 11";
    
    //Declaring without initializing. Initialize in main
    static String HelloWorld12;
    
    
    
    
    
    
    
    /*
        Instance variables. These are variables declared in the public class.
        -->They always have a default value... 
            integers = 0, double = 0.0, boolean = false, String = null, char = //space
        -->They cannot be initialized within the class
        -->Are not accessible outside a method
    */
    //When declared without static, initialize in a method then Call the Method in main.
    String HelloWorld13;
    
    public void Instance1()
    {
        HelloWorld13 = "Hello World 13";
        System.out.println(HelloWorld13);
    }
    
    //Declare and initialize without static, then call the method in main.
    String HelloWorld14 = "Hello World 14";
    
    public void Instance2()
    {
        System.out.println(HelloWorld14);
        
    }
    
    
    
    
    
    
    public static void main(String args[])
    {
        //Printing from Main
        System.out.println("Hello World 1");
        
        //Printing from Variable declared in main. 
        String newString = "Hello World 2";//This a Class datatype
        System.out.println(newString);
        
        
        
        String a, b, c, d;//This is a primitive datatype
        
        
        
        
        //Instantiating the Variable declared in the public class. Uses keyword "NEW"
        HelloWorldAdvanced VipiBro = new HelloWorldAdvanced("Hello World 3");
        System.out.println(VipiBro.x);
        
        //Instantiating the Variable declared in the public sub class
        Jambo VipiBro2 = new Jambo("Hello World 4");
        System.out.println(VipiBro2.Niaje);
        
        //Printing Global Variable
        System.out.println(HelloWorldAdvanced.HelloWorld5);
        
        //Assigning New Variable the value of the Global variable
        String HelloWorld6 = HelloWorldAdvanced.HelloWorld5;
        System.out.println(HelloWorld6);
        
        
        
        
        
        //Method Calling
        HelloWorld7();
        
        //Also Method Calling
        HelloWorld8();
        
        
        
        
        
        /*
        This is where things get confusing
        */
        
        //Get an inherited declared variable from a different public class and instantiate it here
        InheritedHello Bonjour = new InheritedHello ("Hello World 9");
        System.out.println(Bonjour.GreetHello);
        
        /*
            Using get and set to print Hello. More secure Print statement. Encapsualtion
        */
        
        //Declare new object
        InheritedHello NewBonjour = new InheritedHello("");
        //Instantiate the object properties
        NewBonjour.setPrivateHello("Hello World 10");
        //Print the object property
        System.out.println(NewBonjour.getPrivateHello());
        
        
        
        
        
        
        
        
        //Static variables declared in the class
        System.out.println(HelloWorld11);
        
        HelloWorld12 = "Hello World 12";
        System.out.println(HelloWorld12);
        
        
        
        
        
        
        
        
        //Instance Variables
        //Create a new object reference. (Object reference was already created at Hello World 3
        VipiBro.Instance1();
        
        VipiBro.Instance2();
        
    }
}

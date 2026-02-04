public class Main { 
     public static void main(String[] args) {

        // A1: Create a Dog with no constructors defined
        Dog dog1 = new Dog();

        // A2: Print the object directly
        System.out.println("Printing dog1 directly:");
        System.out.println(dog1);   
/* Q1: The output that is shown when inputing the code is 
Printing dog1 directly: Dog@7344699f, 
and why I think it does this is because 
it has no custom instructions or variables, 
so it just comes up with a random
sequence of numbers.*/
        Dog d1 = new Dog();

        System.out.println("\nDefaults for d1 fields (before any assignment):");
        System.out.println("name = " + d1.getName());
        System.out.println("age = " + d1.getAge());
        System.out.println("breed = " + d1.getBreed()); 
/*name = null
age = 0
breed = null
Q2: For age: Age is Primitive(int) 
which always defaults to 0 
While Name and Breed: Are Reference types(String) 
which always defaults to null */ 
        Dog d2 = new Dog();
        System.out.println("\nd2 after default constructor:");
        System.out.println("name = " + d2.getName() + ", age = " + d2.getAge() + ", breed = " + d2.getBreed());

        Dog d3 = new Dog("Rex", 4, "Collie");
        System.out.println("\nd3 after parameterized constructor:");
        System.out.println("name = " + d3.getName() + ", age = " + d3.getAge() + ", breed = " + d3.getBreed()); 
/*
d2 after default constructor:
name = Unknown, age = 0, breed = Mixed

d3 after parameterized constructor:
name = Rex, age = 4, breed = Collie

Experiment: When taking out the constructor, is makes the Dog undefined. 
Q3: Constructors change what happens because it adds specific 
variables and information that you put in instead of just letting 
the code come up with null or 0 for int and String. 
*/ 
        System.out.println("\nPrinting objects after overriding toString():");
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
/*Printing dog1 directly:
Dog{name ='Unknown', age = 0, breed ='Mixed'}
Defaults for d1 fields (before any assignment):
name = Unknown
age = 0
breed = Mixed
Printing objects after overriding toString():
d2 = Dog{name='Unknown', age=0, breed='Mixed'}
d3 = Dog{name='Rex', age=4, breed='Collie'}
Q4: The difference between Checkpoint A to D is that A 
only gave the name Dog and a bunch of random numbers and symbols
while D changed that to where d1 now compied of d2 and now is the same
as d2. I see Overriding is important because it changes d2 and d3
to how Dog looks like to make sure everything looks the same while
keeping d2 and d3 as the same as the beginning.  
*/ 
    System.out.println("\nMutating via setters after making fields private:");
    d3.setAge(6);
    d3.setName("Maxwell");
    d3.setBreed("Border Collie");
    
    System.out.println("d3 age via getter = " + d3.getAge());
    System.out.println("d3 now = " + d3); 
/*Q5: Private fields are better than Public fields because 
it helps keep the private fields from beign changed or modified in
anyway. By using getters and setters, it helps keep control
of the data that is being accessed or modified, improving stability. 
Example: In the setAge(int age) method, the class can 
prevent invalid values by only allowing non-negative ages. 
For example, the setter checks if (age >= 0) before assigning 
the value, ensuring that a dog can never have a negative age. 
*/
    // Create a Course using the no-arg constructor
    Course c1 = new Course();

    // Print c1 using toString()
    System.out.println(c1);

    // Print default field values using getters
    System.out.println("courseName = " + c1.getCourseName());
    System.out.println("credits = " + c1.getCredits());
    System.out.println("required = " + c1.isRequired());

    // Create another Course with default values
    Course c2 = new Course(); 
    // Print c2
    System.out.println(c2);

    // Create a Course using the parameterized constructor
    Course c3 = new Course("Computer Science I", 4, true); 
    // Print c3 
    System.out.println(c3);

    // Compare c2 and c3
    System.out.println("c2 = " + c2);
    System.out.println("c3 = " + c3);

    // Update c3 using setters  
    c3.setCredits(5);
    c3.setCourseName("Advanced Computer Science");
    c3.setRequired(false);

    // Print updated c3
    System.out.println("Updated c3 = " + c3);
    }
} 
/* Full Output 
Printing dog1 directly:
Dog{name = 'Unknown', age = 0, breed ='Mixed'}

Defaults for d1 fields (before any assignment):
name = Unknown
age = 0
breed = Mixed

d2 after default constructor:
name = Unknown, age = 0, breed = Mixed

d3 after parameterized constructor:
name = Rex, age = 4, breed = Collie

Printing objects after overriding toString():
d2 = Dog{name = 'Unknown', age = 0, breed ='Mixed'}
d3 = Dog{name = 'Rex', age = 4, breed ='Collie'}

Mutating via setters after making fields private:
d3 age via getter = 6
d3 now = Dog{name = 'Maxwell', age = 6, breed ='Border Collie'}
Course{name= 'Unknown Course', credits=0, required=false}
courseName = Unknown Course
credits = 0
required = false
Course{name= 'Unknown Course', credits=0, required=false}
Course{name= 'Computer Science I', credits=4, required=true}
c2 = Course{name= 'Unknown Course', credits=0, required=false}
c3 = Course{name= 'Computer Science I', credits=4, required=true}
Updated c3 = Course{name= 'Advanced Computer Science', credits=5, required=false}*/ 

/* Reflection 
Q1: List your class’s three fields and their default values before you set anything. 
The 3 fields that I put into my java code Course are 
String courseName, int credits, and boolean required
courseName: The Name of the Course 
credits: Amount of credit given 
required: If the course is required or not 
Q2: Why add @Override to toString()? 
Overriding is important because it replaces the way the code is written
depending on what the main code, so depending on the name we use
it created the same effect for the whole code. 
So like with Dog java, it changes d2 and d3 from what
the code says and changes it into how d1 was written 
while still keeping the code you wrote when typing the code
into codespace. 
Q3: Why is encapsulation (private fields + getters/setters) preferred over public fields? 
Private fields are important because it helps make sure 
that the code cannot be changed or modified in anyway, and 
setters are important because it gives specific changes 
you want to make in your code without altering the private
fields. 
*/

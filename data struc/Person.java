public abstract class Person {
   
   protected String lastName;
   protected String firstName;

   //constructors
   public Person(String n1, String n2)
   {
      this.firstName = n1;
      this.lastName = n2;
   }
   
   //getters and setters
    public void setLastName(String lname) {
        this.lastName = lname;
    }  
    public void setFirstName(String fname) {
        this.firstName = fname;
    }
     public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    
    public abstract String displayInfo();
 
    
}
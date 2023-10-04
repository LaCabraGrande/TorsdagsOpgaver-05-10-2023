package Task1;

public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private static int idNumber = 1;
    private int id;

    Customer (String firstName, String lastName, String username ) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.username = username;
       this.id = idNumber++;
    }

    public String toString() {
        return "Navn: "+this.firstName+" "+this.lastName+"\nUsername: "+this.username+"\nId:"+this.id+"\n";
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getUsername() {
        return username;
    }
    public int getId() {
        return id;
    }

}

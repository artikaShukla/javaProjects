package designpatterns.Creational;

public class BuilderPatterns {

    private final String  firstName;
    private final String lastName;
    private final int age;
    private final String phone;
    private final String address;

//    private BuilderPatterns(UserBuilder builder){
//        this.firstName = builder.firstname;
//    }

    private BuilderPatterns(UserBuilder builder) {
        this.firstName = builder.firstname;
        this.lastName = builder.lastname;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
    }

public static class UserBuilder {

    private String firstname;
    private String lastname;
    private int age;
    private String phone;
    private String address;

    UserBuilder(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    UserBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public  BuilderPatterns build(){
        BuilderPatterns builderPatterns= new BuilderPatterns(this);
        validateUserObject(builderPatterns);
        return  builderPatterns;
    }

    private void validateUserObject(BuilderPatterns user) {

    }
}

    public static void main(String[] args) {
        BuilderPatterns user1 = new UserBuilder("Lokesh", "Gupta")
                .age(30)
                .build();
        System.out.println(user1);

        BuilderPatterns user2 = new UserBuilder("Lokesh", "Gupta")
                .age(30)
                .address("Fake address 1234")
                .build();

        System.out.println(user2);
    }


}


//Above created user object does not have any setter method, so it’s state can not be changed once it has been built.
// This provides the desired immutability.
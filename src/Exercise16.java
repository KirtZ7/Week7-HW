public class Exercise16 {
    static String firstName;
    static String lastName;
    static int age;

    // Constructor
    public Exercise16(String s, String s1, int i) {
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setFirstName(String firstName) {
        Exercise16.firstName = firstName;
    }

    public void setLastName(String lastName) {
        Exercise16.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            Exercise16.age = 0;
        } else {
            Exercise16.age = age;
        }
    }

    // isTeen method
    public static boolean isTeen() {
        return age > 12 && age < 20;
    }

    // getFullName method
    public static String getFullName() {
        if (firstName == null && lastName == null) {
            return "";
        } else if (firstName == null) {
            return lastName;
        } else if (lastName == null) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }


    // printPerson method
    public static void main(String[] args) {
        System.out.println("Full name: " + Exercise16.getFullName());
        System.out.println("Teen: " + Exercise16.isTeen());
    }
}

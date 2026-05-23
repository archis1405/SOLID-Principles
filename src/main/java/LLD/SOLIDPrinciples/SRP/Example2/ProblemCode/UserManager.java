package LLD.SOLIDPrinciples.SRP.Example2.ProblemCode;

public class UserManager {

    public  void addUser(User user){
        if(user.getAge()<18){
            throw new IllegalArgumentException("user is not an adult");
        }
        System.out.println("User added");
    }

    public void deleteUser(User user){
        System.out.println("User deleted");
    }

    public void  updateUser(User user){
        if(user.getAge()<18){
            throw new IllegalArgumentException("user is not an adult");
        }
        System.out.println("User updated");
    }

    public void logUserActivity(User user){
        System.out.println("User activity logged");

        /*
            Let's say currently the activity is logged only when the user clicks on something , moving forward
            we want log activity on hover too then this function needs to change .

            Let's say currently at a small scale we are not having a S3 storage for the log file but later we will
            have a S3 bucket to store the log file  , for this the class needs to change too.

            But this class is only responsiple for performing the basic crud operations on the user , this logger must
            be in a different class as it violates the single responsibility principle
         */
    }
}

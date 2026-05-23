package LLD.SOLIDPrinciples.SRP.Example2.BetterCode;

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
}

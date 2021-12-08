import Repo.StudentRepo;
import Uni.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        StudentRepo repo = new StudentRepo();
        System.out.println(repo.getAll());
    }

}

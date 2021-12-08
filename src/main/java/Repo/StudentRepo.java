package Repo;

import Uni.ICrudRepository;
import Uni.IMemoryRepository;
import Uni.Student;
import java.sql.*;

import java.util.List;

public class StudentRepo implements ICrudRepository<Student> {
private List<Student> studentList;

    public StudentRepo() {
        //setting up the connection
        try (Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/Uni", "root", "Access0740188658")) {
                Statement statement = null;
                //getting all the values from Student
                String Query = "select * From Student";
                statement=con.createStatement();
                ResultSet resultSet= statement.executeQuery(Query);
                Student parsingStudent = new Student("","",0,0,null);
                while(resultSet.next()){
                    parsingStudent.setFirstname(resultSet.getString("FirstName"));
                    parsingStudent.setLastname(resultSet.getString("LastName"));
                    parsingStudent.setTotalCredits(resultSet.getInt("Credits"));
                    //adding all the students into the student list
                    this.studentList.add(parsingStudent);
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public Student create(Student obj) {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return this.studentList;
    }

    @Override
    public Student update(Student obj) {
        return null;
    }

    @Override
    public void delete(Student obj) {

    }
}

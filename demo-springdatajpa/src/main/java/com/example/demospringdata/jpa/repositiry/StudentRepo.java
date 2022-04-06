package com.example.demospringdata.jpa.repositiry;

import com.example.demospringdata.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
    public List<Student> findByFirstName(String firstName);
    public List<Student> findByFirstNameContaining(String name);
    public List<Student> findByGuardian_Name(String name);
    public Student findByFirstNameAndLastName(String firstname,String lastname);
public Student findStudentByStudentId(long id);
    public Student getByFirstNameAndLastName(String firstName,String lastName);

    //JPQL
 @Query("select s from Student s where s.emailId=?1")
    public Student findByEmailId(String emailId);
@Query("select firstName from Student  where emailId=?1")
 public String getStudentFirstNameByEmailId(String emailId);
//NativeQueriesWithModifyingAndTranscational
    @Modifying
    @Transactional
    @Query(
            value = "update tbl_student_table set first_name=?1 where email_address=?2",
            nativeQuery = true
    )
    public int updateStudentNameByEmailId(String firstName,String emailID);

}

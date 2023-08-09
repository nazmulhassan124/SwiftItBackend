package com.nazmul.swift.repository;

import com.nazmul.swift.dto.Employee;
import com.nazmul.swift.entity.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository  extends JpaRepository<EmployeeInfo , Long> {



    // For soft delete
    @Transactional
    @Modifying
    @Query(value = "update employee_info set active_status=? WHERE emp_id =? ", nativeQuery = true)
    void softDelete(Boolean status, Long id);


//    @Query(value = "SELECT*FROM employee_info t1 INNER JOIN  employee_details t2 ON t1.fK_emp_idetails_id=t2.id    WHERE  active_status='1' and emp_id =? ", nativeQuery = true)
//   Employee getEmpById(Long id);

//    @Query(value = "SELECT*FROM employee_info t1    and emp_id =? ", nativeQuery = true)
//    Optional<EmployeeInfo> getEmpForCheck (Long id);





    // gor get All employee
//    @Query(value = " SELECT   empinfo.emp_id,emp_name,age,gender , detail.position,salary,join_date,address  FROM employee_info empinfo, employee_details detail  WHERE empinfo.active_status='1'  "  , nativeQuery = true)
//    List<Object>  allemployee ();



// gor get All employee
//    @Query(value = "SELECT*FROM employee_info t1 INNER JOIN  employee_details t2 ON t1.fK_emp_idetails_id=t2.id   WHERE t1.active_status='1'" , nativeQuery = true)
//    List<Object> getEmployeesFullDetails();
}

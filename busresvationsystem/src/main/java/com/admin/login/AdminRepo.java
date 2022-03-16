package com.admin.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<AdminLogin,String> {

	AdminLogin findByAdminId(String userId);


}

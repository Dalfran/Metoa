package com.dalfran.Metoa.repository;

import com.dalfran.Metoa.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
}

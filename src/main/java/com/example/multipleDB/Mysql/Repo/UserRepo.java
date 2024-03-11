package com.example.multipleDB.Mysql.Repo;

import com.example.multipleDB.Mysql.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}

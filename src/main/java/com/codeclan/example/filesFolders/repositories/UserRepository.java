package com.codeclan.example.filesFolders.repositories;

import com.codeclan.example.filesFolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

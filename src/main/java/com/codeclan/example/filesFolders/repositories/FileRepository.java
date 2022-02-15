package com.codeclan.example.filesFolders.repositories;

import com.codeclan.example.filesFolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}

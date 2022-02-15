package com.codeclan.example.filesFolders.repositories;

import com.codeclan.example.filesFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}

package com.codeclan.example.filesFolders;

import com.codeclan.example.filesFolders.models.File;
import com.codeclan.example.filesFolders.models.Folder;
import com.codeclan.example.filesFolders.models.User;
import com.codeclan.example.filesFolders.repositories.FileRepository;
import com.codeclan.example.filesFolders.repositories.FolderRepository;
import com.codeclan.example.filesFolders.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesFoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFileFolderAndUser(){
		User user = new User("Sacha");
		userRepository.save(user);

		Folder folder = new Folder("Base", user);
		folderRepository.save(folder);

		File file = new File("info", ".txt", 0.5, folder);
		fileRepository.save(file);
	}

}

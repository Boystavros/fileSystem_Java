package com.codeclan.example.filesFolders.components;

import com.codeclan.example.filesFolders.models.File;
import com.codeclan.example.filesFolders.models.Folder;
import com.codeclan.example.filesFolders.models.User;
import com.codeclan.example.filesFolders.repositories.FileRepository;
import com.codeclan.example.filesFolders.repositories.FolderRepository;
import com.codeclan.example.filesFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        User sacha = new User("Sacha");
        userRepository.save(sacha);

        User lennox = new User("Lennox");
        userRepository.save(lennox);

        User evie = new User("Evie");
        userRepository.save(evie);

        Folder cars = new Folder("cars", sacha);
        folderRepository.save(cars);

        Folder foods = new Folder("foods", lennox);
        folderRepository.save(foods);

        Folder toys = new Folder("toys", evie);
        folderRepository.save(toys);

        File renault = new File("reanult", ".img", 2.5, cars);
        fileRepository.save(renault);

        File milk = new File("milk", ".mp4", 5.0, foods);
        fileRepository.save(milk);

        File momo = new File("momo", ".txt", 0.5, toys);
        fileRepository.save(momo);
    }
}

package com.codeclan.FoldersandFiles.FoldersAndFiles.components;

import com.codeclan.FoldersandFiles.FoldersAndFiles.models.File;
import com.codeclan.FoldersandFiles.FoldersAndFiles.models.Folder;
import com.codeclan.FoldersandFiles.FoldersAndFiles.models.User;
import com.codeclan.FoldersandFiles.FoldersAndFiles.repositories.FileRepository;
import com.codeclan.FoldersandFiles.FoldersAndFiles.repositories.FolderRepository;
import com.codeclan.FoldersandFiles.FoldersAndFiles.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User dutchman = new User("Flying Dutchman");
        userRepository.save(dutchman);

        User pearl = new User("Black Pearl");
        userRepository.save(pearl);

        Folder jack = new Folder("jack", dutchman);
        folderRepository.save(jack);

        Folder shells = new Folder("Shells", pearl);
        folderRepository.save(shells);

        File text = new File("cv", "txt", 32, shells);
        fileRepository.save(text);


    }
}
package com.codeclan.FoldersandFiles.FoldersAndFiles.repositories;

import com.codeclan.FoldersandFiles.FoldersAndFiles.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

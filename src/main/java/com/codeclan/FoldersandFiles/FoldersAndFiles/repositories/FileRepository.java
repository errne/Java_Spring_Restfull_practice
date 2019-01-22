package com.codeclan.FoldersandFiles.FoldersAndFiles.repositories;

import com.codeclan.FoldersandFiles.FoldersAndFiles.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}

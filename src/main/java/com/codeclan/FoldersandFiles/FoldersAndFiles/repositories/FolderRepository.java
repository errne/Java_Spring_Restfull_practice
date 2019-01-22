package com.codeclan.FoldersandFiles.FoldersAndFiles.repositories;

import com.codeclan.FoldersandFiles.FoldersAndFiles.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}

package com.ld.springsecurity.repo;

import com.ld.springsecurity.model.StudentTopicSelection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentTopicSelectionRepository extends JpaRepository<StudentTopicSelection, String> {
    Optional<StudentTopicSelection> findByStudent_IdAndRoom_Id(String studentId, String roomId);
    List<StudentTopicSelection> findByRoom_Id(String roomId);
    void deleteAllByTopic_Id(String topicId);
}

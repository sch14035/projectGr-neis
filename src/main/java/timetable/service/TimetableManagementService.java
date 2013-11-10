package timetable.service;

import timetable.domain.Teacher;
import timetable.repositoryjpa.ClassRoomJpaRepository;
import timetable.repositoryjpa.TeacherJpaRepository;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimetableManagementService {
    @Autowired
	private TeacherJpaRepository teacherJpaRepository;

	public void createNewTeacher(String name) {
		// start transaction
		// write audit log
		Teacher teacher = new Teacher(name, new Date());
		teacherJpaRepository.persist(teacher);
		// end (commit) transaction
	}
}

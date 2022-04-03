package peaksoft.dao;

import peaksoft.entity.Teacher;

import java.util.List;

public interface TeacherDao {

    List<Teacher> teacherList();

    void saveTeacher(Teacher teacher);

    Teacher findId(Long id);

    void update(Teacher teacher);

    void delete(Long id);
}

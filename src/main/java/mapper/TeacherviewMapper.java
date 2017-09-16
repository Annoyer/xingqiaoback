package mapper;

import java.util.List;
import model.Teacherview;
import model.TeacherviewExample;
import model.TeacherviewWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface TeacherviewMapper {
    int countByExample(TeacherviewExample example);

    int deleteByExample(TeacherviewExample example);

    int insert(TeacherviewWithBLOBs record);

    int insertSelective(TeacherviewWithBLOBs record);

    TeacherviewWithBLOBs selectByTeacherId(Integer teacherId);

    List<TeacherviewWithBLOBs> selectByExampleWithBLOBs(TeacherviewExample example);

    List<Teacherview> selectByExample(TeacherviewExample example);

    int updateByExampleSelective(@Param("record") TeacherviewWithBLOBs record, @Param("example") TeacherviewExample example);

    int updateByExampleWithBLOBs(@Param("record") TeacherviewWithBLOBs record, @Param("example") TeacherviewExample example);

    int updateByExample(@Param("record") Teacherview record, @Param("example") TeacherviewExample example);
}
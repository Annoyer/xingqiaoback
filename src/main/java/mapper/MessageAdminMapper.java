package mapper;

import java.util.List;
import model.MessageAdmin;
import model.MessageAdminExample;
import org.apache.ibatis.annotations.Param;

public interface MessageAdminMapper {
    int countByExample(MessageAdminExample example);

    int deleteByExample(MessageAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MessageAdmin record);

    int insertSelective(MessageAdmin record);

    List<MessageAdmin> selectByExample(MessageAdminExample example);

    MessageAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MessageAdmin record, @Param("example") MessageAdminExample example);

    int updateByExample(@Param("record") MessageAdmin record, @Param("example") MessageAdminExample example);

    int updateByPrimaryKeySelective(MessageAdmin record);

    int updateByPrimaryKey(MessageAdmin record);
}
package mapper;

import java.util.List;
import model.Sysrole;
import model.SysroleExample;
import org.apache.ibatis.annotations.Param;

public interface SysroleMapper {
    int countByExample(SysroleExample example);

    int deleteByExample(SysroleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sysrole record);

    int insertSelective(Sysrole record);

    List<Sysrole> selectByExample(SysroleExample example);

    Sysrole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sysrole record, @Param("example") SysroleExample example);

    int updateByExample(@Param("record") Sysrole record, @Param("example") SysroleExample example);

    int updateByPrimaryKeySelective(Sysrole record);

    int updateByPrimaryKey(Sysrole record);
}
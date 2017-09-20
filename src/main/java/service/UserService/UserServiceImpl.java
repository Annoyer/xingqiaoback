package service.UserService;

import mapper.*;
import model.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 86761 on 2017/9/16.
 */
@Service(value = "IUserService")
public class UserServiceImpl implements IUserService{
    @Resource
    private ParentviewMapper parentviewMapper;
    @Resource
    private TeacherviewMapper teacherviewMapper;
    @Resource
    private OrderviewMapper orderviewMapper;
    @Resource
    private DemandMapper demandMapper;
    @Resource
    private ParentMapper parentMapper;

    @Override
    public List<Parentview> getAllParentFromView(){
        List<Parentview> result = new ArrayList<>();
        List<Parentview> tmp = parentviewMapper.selectAll();
        if (tmp != null){
            result.addAll(tmp);
        }
        return result;
    }

    @Override
    public List<TeacherviewWithBLOBs> getAllTeachersFromView(){
        List<TeacherviewWithBLOBs> result = new ArrayList<>();
        List<TeacherviewWithBLOBs> tmp = teacherviewMapper.selectAll();
        if (tmp != null){
            result.addAll(tmp);
        }
        return result;
    }

    @Override
    public List<Teacherview> getAllTeachersByParentId(int parentId){
        List<Teacherview> result=new ArrayList<>();
        List<Integer> idList=orderviewMapper.selectTeacherIdByParentId(parentId);
        for(Integer id:idList) {
            result.add(teacherviewMapper.selectByTeacherId(id));
        }
        return result;
    }

    @Override
    public List<Demand> getAllDemandsByUserId(int userId){
        List<Demand> result=new ArrayList<>();
        List<Demand> tmp=demandMapper.selectByUserId(userId);
        if(tmp!=null){
            result.addAll(tmp);
        }
        return result;
    }

    @Override
    public TeacherviewWithBLOBs getTeacherById(int id){
        TeacherviewWithBLOBs result=teacherviewMapper.selectByTeacherId(id);
        return result;
    }

    @Override
    public Parent getParentById(int parentId) {
        return parentMapper.selectByPrimaryKey(parentId);
    }

    @Override
    public void modifyParentInfo(int parentId,String name,String ground,String address){
        Parent parent=new Parent();
        parent.setId(parentId);
        parent.setRealname(name);

        parentMapper.updateByPrimaryKeySelective(parent);
    }
}

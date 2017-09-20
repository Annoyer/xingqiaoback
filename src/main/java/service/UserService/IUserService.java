package service.UserService;

import model.*;

import java.util.List;

/**
 * Created by 86761 on 2017/9/16.
 */
public interface IUserService {
    List<Parentview> getAllParentFromView();
    List<Teacherview> getAllTeachersByParentId(int parentId);
    List<Demand> getAllDemandsByUserId(int userId);
    List<TeacherviewWithBLOBs> getAllTeachersFromView();
    TeacherviewWithBLOBs getTeacherById(int id);
    Parent getParentById(int parentId);
    void modifyParentInfo(int parentId,String name,String ground,String address);
}

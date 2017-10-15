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
    List<TeacherWithBLOBs> getAllTeachers();
    TeacherWithBLOBs getTeacherById(int id);
    Parentview getParentById(int parentId);
    void modifyParentInfo(int parentId,String name,String ground,String address);
    void modifyTeacherWithBLOB(int teacherId,String name,String pid,String address,String detailaddress,String abstractT,int experienceAge,String school,String unit,
                               String domain,String question,String object,String way,int priceS,int priceT,int priceO,String tGround,String sGround);
    void deleteTeacher(int userId);
    void deleteParent(int id,int userId);
    Sysuser getSysuserById(int userId);
    void modifySysuserInfo(int userId,String phone,String email);
    void modifySysuserPw(int userId,String pw);
    void addTeacher(String username,String password, String name,String pid,String gender, String address,
                    String phone, String email, String school, String unit, String tGround, String sGround,
                    String  domain, String question, String object, String way, Integer priceS,
                    Integer priceT, Integer priceO);
    void addParent(String username,String password, String name,String pid,String gender, String ground,String address,
                   String phone, String email);
}

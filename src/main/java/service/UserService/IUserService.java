package service.UserService;

import model.Demand;
import model.Parentview;
import model.Teacher;
import model.Teacherview;

import java.util.List;

/**
 * Created by 86761 on 2017/9/16.
 */
public interface IUserService {
    List<Parentview> getAllParentFromView();
    List<Teacherview> getAllTeachersByParentId(int parentId);
    List<Demand> getAllDemandsByUserId(int userId);
}

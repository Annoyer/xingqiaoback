package service.UserService;

import mapper.*;
import model.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    @Resource
    private TeacherMapper teacherMapper;
    @Resource
    private SysuserMapper sysuserMapper;

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
    public List<TeacherWithBLOBs> getAllTeachers(){
        List<TeacherWithBLOBs> result = new ArrayList<>();
        List<TeacherWithBLOBs> tmp = teacherMapper.selectAll();
        if (tmp != null){
            result.addAll(tmp);
        }
        return result;
    }

    @Override
    public List<TeacherWithBLOBs> getAllTeachersByParentId(int parentId){
        List<TeacherWithBLOBs> result=new ArrayList<>();
        List<Integer> idList=orderviewMapper.selectTeacherIdByParentId(parentId);
        for(Integer id:idList) {
            result.add(teacherMapper.selectByPrimaryKey(id));
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
    public Demand getDemandById(int demandId){
        return demandMapper.selectByPrimaryKey(demandId);
    }

    @Override
    public TeacherWithBLOBs getTeacherById(int id){
        TeacherWithBLOBs result=teacherMapper.selectByPrimaryKey(id);
        return result;
    }

    @Override
    public Parentview getParentById(int parentId) {
        return parentviewMapper.selectByParentId(parentId);
    }

    @Override
    public List<Demand> getDemandsByTeacherId(int teacherId){
        List<Integer> ids=orderviewMapper.selectDemandIdsByTeacherId(teacherId);
        List<Demand> demands=new ArrayList<>();
        for(int id:ids){
            demands.add(demandMapper.selectByPrimaryKey(id));
        }
        return demands;
    }

    @Override
    public void modifyParentInfo(int parentId,String name,String ground,String address){
        Parent parent=parentMapper.selectByPrimaryKey(parentId);
        if(!parent.getAddress().equals(address)) parent.setAddress(address);
        if(!parent.getRealname().equals(name)) parent.setRealname(name);
        if(!parent.getGround().equals(ground)) parent.setGround(ground);
        parentMapper.updateByPrimaryKeySelective(parent);
    }

    @Override
    public void modifyDemandInfo(int demandId,String name,int gender,String birthday,String disease){
        DemandWithBLOBs demand=demandMapper.selectByPrimaryKey(demandId);
        if(!demand.getName().equals(name)) demand.setName(name);
        if(demand.getGender()!=gender) demand.setGender(gender);
        if(!demand.getBirthday().equals(birthday)) demand.setBirthday(birthday);
        if(!demand.getDisease().equals(disease)) demand.setDisease(disease);
        demandMapper.updateByPrimaryKeySelective(demand);
    }

    @Override
    public void modifyTeacherWithBLOB(int teacherId,String name,String pid,String address,String detailaddress,String abstractT,int experienceAge,String school,String unit,
                                      String domain,String question,String object,String way,int priceS,int priceT,int priceO,String tGround,String sGround){
        TeacherWithBLOBs teacher=teacherMapper.selectByPrimaryKey(teacherId);
        if(!teacher.getName().equals(name)) teacher.setName(name);
        if(!teacher.getPid().equals(pid)) teacher.setPid(pid);
        if(!teacher.getAddress().equals(address)) teacher.setAddress(address);
        if(!teacher.getDetailaddress().equals(detailaddress)) teacher.setDetailaddress(detailaddress);
        if(!teacher.getAbstractteacher().equals(abstractT)) teacher.setAbstractteacher(abstractT);
        if(teacher.getExperienceAge()!=experienceAge) teacher.setExperienceAge(experienceAge);
        if(!teacher.getSchool().equals(school)) teacher.setSchool(school);
        if(!teacher.getUnit().equals(unit)) teacher.setUnit(unit);
        if(!teacher.getDomain().equals(domain)) teacher.setDomain(domain);
        if(!teacher.getQuestion().equals(question)) teacher.setQuestion(question);
        if(!teacher.getObject().equals(object)) teacher.setObject(object);
        if(!teacher.getWay().equals(way)) teacher.setWay(way);
        if(teacher.getPriceO()!=priceO||teacher.getPriceS()!=priceS||teacher.getPriceT()!=priceT){
            if((!teacher.getPriceO().equals(priceO))) teacher.setPriceO(priceO);
            if((!teacher.getPriceS().equals(priceS))) teacher.setPriceS(priceS);
            if((!teacher.getPriceT().equals(priceT))) teacher.setPriceT(priceT);
            List<Integer> prices=new ArrayList<>();
            prices.add(priceO);
            prices.add(priceS);
            prices.add(priceT);
            Collections.sort(prices, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2);
                }
            });
            teacher.setPriceMax(prices.get(2));
            teacher.setPriceMid(prices.get(1));
            teacher.setPriceMin(prices.get(0));
        }
        if(!teacher.gettGround().equals(tGround)) teacher.settGround(tGround);
        if(!teacher.getsGround().equals(sGround)) teacher.setsGround(sGround);

        teacherMapper.updateByPrimaryKeyWithBLOBs(teacher);
     }

     @Override
     public void modifyTeacherSchedule(int teacherId,String schedule){
        TeacherWithBLOBs teacher=teacherMapper.selectByPrimaryKey(teacherId);
        teacher.setSchedule(schedule);
        teacherMapper.updateByPrimaryKeyWithBLOBs(teacher);
     }

     @Override
     public void deleteTeacher(int userId){
        teacherMapper.deleteByUserId(userId);
        sysuserMapper.deleteByPrimaryKey(userId);
     }

    @Override
    public void deleteParent(int id,int userId){
        parentMapper.deleteByPrimaryKey(id);
        sysuserMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public Sysuser getSysuserById(int userId){
        return sysuserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public void modifySysuserInfo(int userId,String phone,String email){
        Sysuser sysuser=new Sysuser();
        sysuser.setId(userId);
        sysuser.setPhone(phone);
        sysuser.setEmail(email);
        sysuserMapper.updateByPrimaryKeySelective(sysuser);
    }

    @Override
    public void modifySysuserPw(int userId,String pw){
        Sysuser sysuser=new Sysuser();
        sysuser.setId(userId);
        sysuser.setPassword(pw);
        sysuserMapper.updateByPrimaryKeySelective(sysuser);
    }

    @Override
    public void addTeacher(String username,String password, String name,String pid,String gender, String address,
                           String phone, String email, String school, String unit, String tGround, String sGround,
                           String  domain, String question, String object, String way, Integer priceS,
                           Integer priceT, Integer priceO){
        Sysuser sysuser=new Sysuser();
        sysuser.setStatus(1);
        sysuser.setUsername(username);
        sysuser.setPassword(password);
        sysuser.setEmail(email);
        sysuser.setGender(gender);
        sysuser.setPhone(phone);
        sysuserMapper.insertSelective(sysuser);
        TeacherWithBLOBs teacher=new TeacherWithBLOBs();
        teacher.setIsPass(0);
        teacher.setUserId(sysuser.getId());
        teacher.setName(name);
        teacher.setPid(pid);
        teacher.setAddress(address);
        teacher.setUnit(unit);
        teacher.setSchool(school);
        teacher.settGround(tGround);
        teacher.setsGround(sGround);
        teacher.setDomain(domain);
        teacher.setQuestion(question);
        teacher.setObject(object);
        teacher.setWay(way);
        teacher.setPriceS(priceS);
        teacher.setPriceT(priceT);
        teacher.setPriceO(priceO);
        List<Integer> prices=new ArrayList<>();
        prices.add(priceO);
        prices.add(priceS);
        prices.add(priceT);
        Collections.sort(prices, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        teacher.setPriceMax(prices.get(2));
        teacher.setPriceMid(prices.get(1));
        teacher.setPriceMin(prices.get(0));

        teacherMapper.insertSelective(teacher);
    }

    @Override
    public void addParent(String username,String password, String name,String pid,String gender, String ground,String address,
                           String phone, String email){
        Sysuser sysuser=new Sysuser();
        sysuser.setStatus(0);
        sysuser.setUsername(username);
        sysuser.setPassword(password);
        sysuser.setEmail(email);
        sysuser.setGender(gender);
        sysuser.setPhone(phone);
        sysuserMapper.insertSelective(sysuser);
        Parent parent =new Parent();
        parent.setUserid(sysuser.getId());
        parent.setRealname(name);
        parent.setAddress(address);
        parent.setGround(ground);
        parentMapper.insertSelective(parent);
    }
}

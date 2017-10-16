package service.MsgAdminService;

import model.MessageAdmin;

import java.util.List;

/**
 * Created by joy12 on 2017/10/3.
 */
public interface IMsgAdminService {
    public int countUnreadMsg();
    public List<MessageAdmin> getAllMsg();
}

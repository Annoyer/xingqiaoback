package service.MsgAdminService;

import mapper.MessageAdminMapper;
import model.MessageAdmin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by joy12 on 2017/10/3.
 */
@Service("IMsgAdminService")
public class MsgAdminServiceImpl implements IMsgAdminService{
    @Resource
    private MessageAdminMapper messageAdminMapper;
    @Override
    public int countUnreadMsg() {
        return messageAdminMapper.countUnread();
    }

    @Override
    public List<MessageAdmin> getAllMsg() {
        List<MessageAdmin> msgs = messageAdminMapper.selectAll();
        messageAdminMapper.setAllRead();
        return msgs;
    }
}

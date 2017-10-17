package service.RefundService;

import model.Orderview;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by joy12 on 2017/10/4.
 */
public interface IRefundService {
    public List<Orderview> getTeacherCancelRequest();
    public List<Orderview> getParentCancelRequest();
    public List<Orderview> getAllRefundRequest();
    public void checkRefundRequest(String orderId, String requestSubject, Boolean isAccept);
  //  public void dealRefundRequest(String orderId, Double refundAmount);
}

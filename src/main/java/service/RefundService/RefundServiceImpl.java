package service.RefundService;

//import alipay.AlipayConfig;
//import alipay.AlipayUtils;
//import com.alipay.api.AlipayClient;
//import com.alipay.api.DefaultAlipayClient;
//import com.alipay.api.internal.util.AlipaySignature;
//import com.alipay.api.request.AlipayTradeFastpayRefundQueryRequest;
//import com.alipay.api.request.AlipayTradePagePayRequest;
//import com.alipay.api.request.AlipayTradeRefundRequest;
//import com.alipay.api.response.AlipayTradeFastpayRefundQueryResponse;
//import com.alipay.api.response.AlipayTradeRefundResponse;
import mapper.OrdersMapper;
import mapper.OrderviewMapper;
import model.Message;
import model.Orders;
import model.Orderview;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by joy12 on 2017/10/4.
 */
@Service("IRefundService")
public class RefundServiceImpl implements IRefundService{
    @Resource
    private OrderviewMapper orderviewMapper;
    @Resource
    private OrdersMapper ordersMapper;

//    private static AlipayClient alipayClient = null;

    @Override
    public List<Orderview> getTeacherCancelRequest() {
        return orderviewMapper.selectTeacherRefundRequest();
    }

    @Override
    public List<Orderview> getParentCancelRequest() {
        return orderviewMapper.selectParentRefundRequest();
    }

    @Override
    public List<Orderview> getAllRefundRequest() {
        return orderviewMapper.selectAllRefundToDeal();
    }

    @Override
    public void checkRefundRequest(String orderId, String requestSubject, Boolean isAccept) {
        if (isAccept){
            if (requestSubject.equals("p")){
                ordersMapper.acceptRefundRequestFromParent(orderId);
            } else if (requestSubject.equals("t")){
                ordersMapper.acceptRefundRequestFromTeacher(orderId);
            }

        } else {
            ordersMapper.rejectRefund(orderId);
        }
    }

    @Override
    public void dealRefundRequest(String orderId, Double refundAmount) {
//        Orders order = ordersMapper.selectByPrimaryKey(orderId);
//        if (order != null){
//            String tradeNo = order.getTradeNo();
//            String reason = "" + order.getReason();
//            if (tradeNo != null){
//                if (doRefund(tradeNo,refundAmount,reason)){
//                    if (order.getStatusP() == 6){
//                        ordersMapper.refundSuccessFromParent(orderId);
//                    } else if (order.getStatusT() == 9){
//                        ordersMapper.refundSuccessFromTeacher(orderId);
//                    } else {
//                        System.out.println("数据库出错！！！");
//                    }
//                }
//            }
//        }
    }

//    public static AlipayClient getAlipayClient() {
//        return alipayClient;
//    }
//    public static void setAlipayClient() {
//        alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
//    }

//    public boolean refundQuery(String tradeNo, String outRequestNo){
//        if (alipayClient == null){
//            setAlipayClient();
//        }
//
//        System.out.println("refundQuery开始查询退款结果：trade_no=" + tradeNo);
//        //设置请求参数
//        AlipayTradeFastpayRefundQueryRequest request = new AlipayTradeFastpayRefundQueryRequest();
//
//        request.setBizContent("{\"trade_no\":\""+ tradeNo +"\","
//                + "\"out_request_no\":\""+ outRequestNo +"\"}");
//        try {
//            AlipayTradeFastpayRefundQueryResponse response = alipayClient.execute(request);
//            if(response.isSuccess()){
//                System.out.println("refundQuery检查：退款成功 trade_no=" + response.getOutTradeNo());
//                return true;
//            } else {
//                System.out.println("refundQuery检查：调用失败 trade_no=" + response.getOutTradeNo());
//                return false;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return false;
//
//    }


//    public boolean doRefund(String tradeNo, Double refundAmount, String refundReason){
//        if (alipayClient == null){
//            setAlipayClient();
//        }
//
//        System.out.println("doRefund开始处理退款：trade_no=" + tradeNo);
//
//        //设置请求参数
//        AlipayTradeRefundRequest alipayRequest = new AlipayTradeRefundRequest();
//
//        String outRequestNo = new Date().getTime()+"";
//        alipayRequest.setBizContent("{\"trade_no\":\""+ tradeNo +"\","
//                + "\"refund_amount\":\""+ refundAmount +"\","
//                + "\"refund_reason\":\""+ refundReason +"\","
//                + "\"out_request_no\":\""+ outRequestNo +"\"}");
//        try {
//            String result = alipayClient.execute(alipayRequest).getBody();
//            System.out.println("doRefund result:" + result);
//
//            //复查退款结果
//            Thread.sleep(2000);
//            return refundQuery(tradeNo,outRequestNo);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return false;
//    }

}

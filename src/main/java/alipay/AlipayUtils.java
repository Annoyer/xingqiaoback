package alipay;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeFastpayRefundQueryRequest;
import com.alipay.api.request.AlipayTradeRefundRequest;
import com.alipay.api.response.AlipayTradeFastpayRefundQueryResponse;

import java.util.Date;

/**
 * Created by joy12 on 2017/10/5.
 */
public class AlipayUtils {
    private static AlipayClient alipayClient = null;
    public static AlipayClient getAlipayClient() {
        return alipayClient;
    }
    public static void setAlipayClient() {
        alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
    }

    public static boolean refundQuery(String outTradeNo, String outRequestNo){
        if (alipayClient == null){
            setAlipayClient();
        }

        System.out.println("refundQuery开始查询退款结果：out_trade_no=" + outTradeNo);
        //设置请求参数
        AlipayTradeFastpayRefundQueryRequest request = new AlipayTradeFastpayRefundQueryRequest();

        request.setBizContent("{\"out_trade_no\":\""+ outTradeNo +"\","
                + "\"out_request_no\":\""+ outRequestNo +"\"}");
        try {
            AlipayTradeFastpayRefundQueryResponse response = alipayClient.execute(request);
            if(response.isSuccess()){
                System.out.println("refundQuery检查：退款成功 out_trade_no=" + response.getOutTradeNo());
                return true;
            } else {
                System.out.println("refundQuery检查：调用失败 out_trade_no=" + response.getOutTradeNo());
                return false;
            }
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        return false;

    }


//    public static boolean doRefund(String outTradeNo, Double refundAmount, String refundReason){
//        if (alipayClient == null){
//            setAlipayClient();
//        }
//
//        System.out.println("doRefund开始处理退款：out_trade_no=" + outTradeNo);
//
//        //设置请求参数
//        AlipayTradeRefundRequest alipayRequest = new AlipayTradeRefundRequest();
//
//        String outRequestNo = new Date().getTime()+"";
//        alipayRequest.setBizContent("{\"out_trade_no\":\""+ outTradeNo +"\","
//                + "\"refund_amount\":\""+ refundAmount +"\","
//                + "\"refund_reason\":\""+ refundReason +"\","
//                + "\"out_request_no\":\""+ outRequestNo +"\"}");
//        try {
//            String result = alipayClient.execute(alipayRequest).getBody();
//            System.out.println("doRefund result:" + result);
//
//            //复查退款结果
//            Thread.sleep(2000);
//            return refundQuery(outTradeNo,outRequestNo);
//        } catch (AlipayApiException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        return false;
//    }
}

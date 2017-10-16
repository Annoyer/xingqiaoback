package alipay;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

//    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
////    public static String app_id = "2017082508383175";
//    public static String app_id = "2016080900201394";
//
//
//    // 商户私钥，您的PKCS8格式RSA2私钥
////    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCyys5RLfNj7Z0Lu7sPJmXzCAKuZlZCSwgduLmRJaabhW+cDuflpWwxJKiJS8LLEyn65vkr/5dwXGM0gfBOfAPxdv/jp9SjbU2g/yrJ44/58mJ0YwGvbvKwlsMg1CCBue7lOfVBv+dl32ierYAWCu5t/H1DZatvzRznN6j30FZPAMf+CXnSUl0gnxp3eikb8YQ7khtHStpVNx5OSH4HZlr64zzldD7zOzDaP+Jy0YBSA3jZE0zaVJcBZVWZbecHJ0rhTDdjdHIQosCmP1g5H4onkrPtuSU3549M4v1jzu4yXc7KorZe8wgLW1e+wVwF9AeYd2R240UJwiEp8KZ8aJyFAgMBAAECggEAbTWBxoZZ190JA2S9QujCdyuab6qk38NzBqyR9L3Zwb9EyD82mMhtiKsKoyp6po5jIxW4d46ckw5rrmP8RARuaCy26vjV4qleNIwIN99fT14lk0/ydJVBemnscH4CCRtod+3qCCpPDqPjBKGXzl8I+neyj9tnV1gjYnxWImDIh2I+DJ7Nl3b80DH5JeXIKNqXCkiNxE+mst87ZchO+cGDeT/6YH2WcPzAeWFD9wgzWK2dtMfMfpu0BwM5UOqnmS5Ga2HTeWnqQXLINhCHnjd6VH3ozHL+A2CwxNp5F4FwmHmvep783DUB8JszUVbiiwDrbsindeEf0YClvegypwdEVQKBgQDhkdhHHsLsa6qOg3rWmZ7jxeOW1DNlw/gXO9fRwtM4NJGrZfjUwIQiaAYVGE6x9jWrmG67M9zuU7JYdY5t8Mqj9T6mdY9ftJGt+Jp0od/VNi86BUTqzeTIoMKu8bSFeYUXwyp1Pur22A4LPjcMRaHCgiex5zDqigO/waxLHg/oYwKBgQDK6Xp6PbVwFdq1YYt+sdvVSJfFF29oBFaXdZCwJJIhXol2osOGmekgbZ9+cxlN/Drv55uZ8SkHHAtG1fFwlT8uCew0QDJQK/tr6MmAr8rcBfJ2DK1IJFNxNJ0ztUrgX7XreRTDfKHxnIGDzZE5rsOWVoyJ0+85NXMQg0lVxx+X9wKBgFB5bNSqt9YK71VauPdY5SPT1MdZu2CCEr+PPQb738k8j/+7KJQWfs2bmRfrjR/We/1VK6Qj850fRRBkGEVG07S86PYQGO+HBzYu7EPSAH4bj6u+d4Dhpc6h8/LgDoxT91Sr7zjXEpKwMAp4zsDVEsnHD4xbs8rpJD9EREikV/6LAoGBAIQf96J1YBl2AY2t0JlU0uJUfI7XrbE7ce75nJc1mPmlhzj6zvpsacK13u8Fn2qKXQ4t78ITqDV661TapnY6mIMv7uAvFRPjL7maQOtMjHksXi7EHmklTjgenGY5HGJxsBF+LCkGlKSw1hyu1GuNAsp33Nc6a0EDLsOH2U7DdC0NAoGAfjymKv3kJFZfLP3lV3K0U2Nxj6NUAtl9u4e6ndbbeI7UpBoJr+qkShVKSwRoeoPUN7oUPTprLR9pLq8XeJD/1YXUPPFzB++AmpuuKIn+cgg7OY8RuDNOCT6tbduiAzW4ds3Xy/WlTkg8o/0kctrL7jefmW+Lzm9iYnJZraw+LtE=";
//    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDaFQDRexWV6Vj5Y7aFjlPXwuBf+2dCxKpG0NLYHtFVvxO2TTNcjxuJ53P0IWiYlEvpdrRlKUCex9Iyh7rCTuL67alXgf+INNur3e4UnJIEeVG8NLSsVJhdOgm/lqw3V4+h/WWJeSpwKQAehkQaRUHZ6n8o0AMKK1RAgQaOeAnIZsRnbqgDSE+fVf7uRjgFxGQvRjQXftXaxvJuRJJMsXkJtBV0XNt1MKUWZYyc59Eq+NbQGjHokwWMQ0/RO/UiVKxTyoVErXb2iSp3IT2ffIWU+WWoXtHtIGzsgPDAVTl2dU76fE42k14BtNfiR4kxndGFOcm7dBfUvROEv9prk/S9AgMBAAECggEARV061mZM1lLTLveNPWuotU7RqRXAoVcGReHzvjQHJzvQXEKv3HfULYfFtNfPegBpKMfN1wNI/3fVHqdXOqh2v5NKMoAxs7QETuUW7c1jEDM6UR9+e/WoRLbKFPsqqaubDs4XNqOoYOZZmFviW2y95j8U1PlcjiZ79MxVNoltqySWaiyv2LZH6t/AchOi6hiELfrOczweU3Wy4ZPb5daklf1JuIvS17tlLuyse1lVyG+Xuw3zYq7cM1WQDPpaWlWB/H/WRE0w0wQuJMwDWrcqkgFMDY9bAGbWhWZvf/z0ouFQ3EYUBg8hpDk8CY8RrMKiNWZIvUDbGAkiAKyeicuyAQKBgQDxYI7M4OdQ3sepRLEINPWToWYAoRpHs809frHGsvN3/UcNaOLpwSgy5iAp/eFIourbdW5SkmFSBqSZ3mBgYGbgsjQiJ8KPyK35S8R9EhBHzM5y1cbEjERuCdjBzO1C6Y3TRyLxR5h0FnJ2YxYf/2qRnfXdFgTBKqenYPITNlNRPQKBgQDnSysjlog85Isy8iBYI0t9PskYTvN9BneMGQNbtgG3jO/nEnIBekjDaXdKbVad7ZDVzYdByWNXzdxFcmqzg2hLsttcXnGsrn0XlozOa9C1ri66+2x1rDGYlKj7n2850O4RrsTbJRnj8izTA4h4C8sYA44TfB0pSXceR6g1JL5pgQKBgHyhnbo92lJQZYmJ9VrGdZK/wHpMtNQXC79X3pU5KytmdLyAzsFhwc7eMfdcpmkp7dhY/xjVijifQ3hLcTnyLMySVwbXvscdGG9jZtYpcIySPHrg1NwBjQfAP9J5bHyjOV7BGVK55Ab03C8ypGbrK+x6QkvgpZ3T13M+RGAVKdoFAoGBALRXq/9HtFqmaNMEb6vJeWbiubG2fawSisw2BKRRue0Ae15Ux4fXbTzQ0y65Kjxhq/jJFJl7CXbBEOslV4U5BO1hPCE9kqzuMKNfw9J/xnCiq9UnjV4DMXijEU+A9RzDh51KBDxLJXDSt5igvJu9tlG3E+SldadnnPWDMeieCcoBAoGAW+H22/mGfNGeikzo3yC6DOj7eK3LhOTyPjDAkC1cYbpYkQiMOi2JISgRZ+UGs62ZUS/L+5bug2TeNChZ8yxyWRhaDGtIQczFBNS/hkcLF0KQmVK2kxs91B6NHTqd41NSn07ImvyQw3PO7bq75EYXdLWzz9dIshEk2JOUurBCqUM=";
//
//    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
////    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAx2+DwjAWPTZf5Q2IoCA251SE6LpTabGgMCYbaQc8Sj/ULf9pJxCDHlUBHeJ+Nv690SYbw4loYirKOgUSWeoPExLTh69jUuNzG/GyPiRW/05Cy9mEwyt5drJ9xk7FJQQcj3FPL7Q1eERx8S61Mm2UEcLmaPMIK/dSjIUeCQ381NRqRRP8h754hYj7XJEQdxp9G7gNV6SuvBSG/vow5jm2jWI9pvg4wdDDNEUZiTe8btKLHUbnliDrJVRIG0Wq0LsupdFWRF1nb1YzR7yZM66W8UDW0KDh+p7kUhQ3GrhFfQVrBG8R7s2DMKDZqOmSlV6HSbT8qchKyQuwtOG0THkiHQIDAQAB";
//    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvpVRHimrRiVooq7vX7+cS2fOx2oxryfdAsbixfKgebWApOR4dCZxuUlzZqIBRPueP98JTH3aEZ0jNgYDqqBQr/FJC7qgKCyczLVZ5qG6IA4+iNOTfrgzIc5mhA5/t3serIv1ehegsKtbCuEbm7ls/brINYS2cRRE7OlQmN0HxelvKfSMk8Ip4+06ynrXfWcKh4DfoknlA9xVhNTLNZ645CF1OEhz77qbso9CGVyUFva6t/2uRR0Vu1v1YZo4BiIH65v5AkGQvN4Y428blyMxKdbHxEpORAb1GmA7mtrORsQ5/+lqLmQuGBrIU+geLQ/q91aVMvKzSaZnXH946yq1bQIDAQAB";

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016080600182936";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAI1T0bZJ9bixsGZyKSxXIYIivjTUNvYGC6gNJrJs3ROOiqO713Hy9UH+cj/lWN5eaDG34fJLbFKk1+d2YElNWz4xq3Mx0zF7XAA8oqVX0nuBzPxHOMq2ZmZBZbxbaI02jGMrLVDz6s0flEWHoGyiEHhvpGYBH+7xj9nJE3QKihu9AgMBAAECgYAodQs+vNNr6OoPmbSxrcu43ktHAk0thrOFiyY9w65R7+c+UgKt6xhMqRN5uSUEm1AGk5ZJ7092JRxtdVTBBzUMHfWoVqNYuUi4DYkue2+QeyM64uZMZmd0rNK+apZT9Wkp0uVL+HMJZU5RHLbDFnbCB0pnH1NBzI06jvdc7YX3AQJBANmgyZD00ONJl2rmCNzUSfm9AVGk70vHTGkGf53A7oiQviqz3yvSldUcW+hWsmqs0LscpwdQ8NjRohoRsIMOJH0CQQCmPwCEjxRSWhVxXskllhEut31yom0cmXbgD/DlRUi+smSpz69MWFLnhDOJ3dYlMEKUOdNWnnDXw3us9g667bhBAkBDMbTqr9xLQS6iT/JOlLFeja/5kG5ePGPoTZxbjfVYbzB4KN9wPW4LxdzOyO3/p+ouy7L6vFAQ8fEWEX4piNVVAkAd7X2UX4WTBbCShjPD1m4lcNbeiisGWQIzd+sv+vcLjWXdxAuUvNm/3+a/TPY+H5/8uyQ2lbNOxFxBWNJyCFWBAkBuGAb4aKzLram8qqER08xLaHC/m4er+WzgwwUvRuesqvjZCjCvEq77UedVnwAruaBhy/1lC1v1O887PMPkr1VZ";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDIgHnOn7LLILlKETd6BFRJ0GqgS2Y3mn1wMQmyh9zEyWlz5p1zrahRahbXAfCfSqshSNfqOmAQzSHRVjCqjsAw1jyqrXaPdKBmr90DIpIxmIyKXv4GGAkPyJ/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://101.132.76.252/alipay/notify_url";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://101.132.76.252/alipay/return_url";

    // 签名方式
    public static String sign_type = "RSA";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
 //   public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


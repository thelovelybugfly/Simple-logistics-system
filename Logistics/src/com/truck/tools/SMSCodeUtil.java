package com.truck.tools;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Random;
import javax.servlet.http.HttpSession;
/**
 * 短信发送类
 * @author  j
 *
 */
public class SMSCodeUtil {
	/**
	 * 生成6位0-9的数字字符串验证码
	 * @return
	 */
	public static StringBuffer getRandomCode(){
		StringBuffer buffer =new StringBuffer();
		Random random = new Random();
		for(int i=0;i<6;i++){
			buffer.append(random.nextInt(10));
		}
		return buffer;
	}
	/**
	 * 发送验证码
	 * @return
	 */
	public static boolean sendCode(HttpSession session,String telephone) throws Exception{
		//判断是否在规定时间内获取id
		Long time=(Long)session.getAttribute("time");
//		if(time!=null){
//			Long nowTime=System.currentTimeMillis();
//			if((nowTime-time)/1000/60<5){
//				return false;
//			}
//		}
		StringBuffer code=getRandomCode();
//		//将code转换为utf-8编码格式
//		String code_str=URLEncoder.encode("#code#="+code,"utf-8");
//		//包装好URL对象，将接口地址包装在此接口中
//		URL url=new URL("http://v.juhe.cn/sms/send?mobile="+telephone+"&tpl_id=91048&tpl_value="+code_str+
//				"&key=e01a8b06cd9b91c38e512c86d5204c95");
//		//打开连接，得到连接对象
//		URLConnection connection =url.openConnection();
//		//向服务器发出连接请求
//		connection.connect();
//		//获取服务器响应数据
//		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8"));
//		StringBuffer buffer=new StringBuffer();
//		String lineData=null;
//		while((lineData=bufferedReader.readLine())!=null){
//			buffer.append(lineData);
//		}
//		if(buffer.toString().indexOf("\"error_code\":0")>=0){
//			session.setAttribute("phoneCode", code.toString());
//			System.out.println(session.getAttribute("phoneCode"));
//			session.setAttribute("time", System.currentTimeMillis());
//			return true;
//		}else{
//			return false;
//		}
		
		session.setAttribute("phoneCode", code.toString());
		System.out.println(session.getAttribute("phoneCode"));
		session.setAttribute("time", System.currentTimeMillis());
		return true;
	}
}

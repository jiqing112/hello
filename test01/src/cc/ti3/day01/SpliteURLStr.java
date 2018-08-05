package cc.ti3.day01;

import java.math.BigDecimal;
import java.net.URL;
import java.net.URLConnection;

public class SpliteURLStr {

	public static void main(String[] args) throws Throwable {
		//imageUrl是原图片被js压缩后的地址
		String imageUrl="http://imglf2.nosdn.127.net/img/SmpBYWc2RCttaG0xMlBZM1RQNnBwbVFoeERSaUNOaTlML3NMWGkwbzViUElJMUd2Nkk5ajhRPT0.jpg?imageView&thumbnail=1680x0&quality=96&stripmeta=0&type=jpg%7Cwatermark&type=2&text=wqkga2FyYXN55b2x6ZuAwrdGb1BvVG8gLyBrYXJhc3kubG9mdGVyLmNvbQ==&font=bXN5aA==&gravity=southwest&dissolve=30&fontsize=680&dx=32&dy=36&stripmeta=0";
		
		
		String[] imageArr=imageUrl.split("\\?");
		
		//OriginalImageSize是通过splite过滤掉imagerUrl“?”之后的原图地址
		String OriginalImageSize=imageArr[0];
		System.out.println("获取到的源文件地址："+imageArr[0]);

	
		URL url =new URL(OriginalImageSize);
		URLConnection conn =url.openConnection();
		double size =conn.getContentLength();
		
		if (size<0) {
			System.out.println("无法获取文件大小！");
			
		} else {
			System.out.println("获取到的文件大小为："+size+"byte");
			
			 
			   double SizeToMb= (size/1000000);
			   
	           BigDecimal bg = new BigDecimal(SizeToMb);
	           double f1 = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();


			System.out.println("换算成MB为："+f1+"MBit");
			conn.getInputStream().close();
		}
	}
}

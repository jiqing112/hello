package cc.ti3.day01;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.net.URLConnection;


public class GetImageSize {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String ImageUrl="http://imglf3.nosdn0.126.net/img/dDhxc2U3ckpTUy9KandJMlRndEVIMCtEWUFTcHBNaGFyYXdDb1FRclVVbEFoOEkyb2crT2l3PT0.jpg";
		URL url =new URL(ImageUrl);
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

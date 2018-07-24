package cc.ti3.day01;

import java.io.File;


public class MemDisk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getDiskInfo();
		System.out.println("");
		
	}
	public static void getDiskInfo() {
		// TODO Auto-generated method stub
		File[] disks =File.listRoots();
		for(File file:disks) {
			System.out.println(file.getPath()+"");
			System.out.println("空闲使用："+file.getFreeSpace()/1024/1024+"MB"+"");
			System.out.println("已经使用："+file.getUsableSpace()/1024/1024+"MB"+"");
			System.out.println("总容量："+file.getTotalSpace()/1024/1024+"MB"+"");
		}
	}
	/* 这段网上查到的获取内存的方法是错误的，报错方法未定义
	 * public static void getMemInfo()
	    {
	      OperatingSystemMXBean osmb = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();     
	        System.out.println("系统物理内存总计：" + osmb.getTotalPhysicalMemorySize() / 1024/1024 + "MB");     
	        System.out.println("系统物理可用内存总计：" + osmb.getFreePhysicalMemorySize() / 1024/1024 + "MB");   
	    }*/
	

}

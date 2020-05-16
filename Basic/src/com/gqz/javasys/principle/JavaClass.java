/**  
* @Title:  JavaClass.java
* @Package com.gqz.javasys.principle
* @Description: TODO(用一句话描述该文件做什么)
* @author ganquanzhong
* @date  2019年11月19日 下午9:43:01
* @version V1.0  
* Update Logs:
* ****************************************************
* Name:
* Date:
* Description:
******************************************************
*/
package com.gqz.javasys.principle;

/**
* @ClassName: JavaClass
* @Description: TODO(这里用一句话描述这个类的作用)
* @author ganquanzhong
* @date 2019年11月19日 下午9:43:01
*/
public class JavaClass {

	private static int CODE_MODE = 96;
	
	private String username = "gqzdev";
	
	public void show() {
		System.out.println(username+CODE_MODE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JavaClass().show();
	}

}

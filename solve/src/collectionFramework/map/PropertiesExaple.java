package collectionFramework.map;

import java.io.*;
import java.net.URLDecoder;
import java.util.*;

public class PropertiesExaple {
	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		String path = PropertiesExaple.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(path)); // properties파일로 부터 Properties객체 얻기
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println("driver: " + driver);
		System.out.println("url: " + url);
		System.out.println("username: " + username);
		System.out.println("password: " + password);
		
	}
}

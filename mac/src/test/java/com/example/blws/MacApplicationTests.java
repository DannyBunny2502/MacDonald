package com.example.blws;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MacApplicationTests {

	//private static final Logger Logger = LoggerFactory.getLogger(OracleConnectionTest.class);
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@49.173.41.72:1521:blwsoracle";
	private static final String USER = "mac";
	private static final String PW = "donald";

	@Test //JUnit이 테스트하는 코드
	public void testConnection() throws Exception {
	        Class.forName(DRIVER);
	        try(Connection conn= DriverManager.getConnection(URL, USER, PW)) {
	                System.out.println("오라클에 연결되었습니다.");
	                System.out.println(conn.isClosed());
	        }catch(Exception e) {
	                e.printStackTrace();
	        }
	}
}

package kosta.matchat.model.util;
/**
 * DB관련 설정 정보 상수필드 interface
 * @author onething
 *
 */
public interface DBProperty {
	public static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	//public static final String URL = "jdbc:oracle:thin:@192.168.0.106:1521:xe";

	public static final String USER_NAME = "project";
	public static final String USER_PASS = "project";


}

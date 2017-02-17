/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dotdbopener;

import java.sql.*;
import org.apache.logging.log4j.*;

/**
 *
 * @author ar
 */
public class DotDBOpener {

	private static final Logger logger = LogManager.getLogger();

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		DotDBOpener ddo = new DotDBOpener();

		logger.info("{}", "DBをオープンします。");
		ddo.openDB();
	}

	private void openDB() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:sqlite:db/EasyLog.db");

			con.close();
		} catch (SQLException ex) {
			logger.fatal("{}", ex);
		}

	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;

/**
 *
 * @author demonslight998
 */
public class DbContext {

  InitialContext initCxt;
  Context envirCxt;
  String serverName;
  String port;
  String username;
  String password;
  String dbName;
  String imgFolder;

  public DbContext() throws Exception {
    initCxt = new InitialContext();
    envirCxt = (Context) initCxt.lookup("java:/comp/env");
    serverName = (String) envirCxt.lookup("severName");
    port = (String) envirCxt.lookup("port");
    username = (String) envirCxt.lookup("username");
    password = (String) envirCxt.lookup("password");
    dbName = (String) envirCxt.lookup("dbName");
  }

  public Connection getConnection() throws Exception {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    return DriverManager.getConnection("jdbc:sqlserver://" + serverName + ":" + port + ";databaseName=" + dbName, username, password);
  }

  public void closeConnection(Connection con, PreparedStatement ps, ResultSet rs) throws SQLException {
    if (rs != null && !rs.isClosed()) {
      rs.close();
    }
    if (ps != null && !ps.isClosed()) {
      ps.close();
    }
    if (con != null && !con.isClosed()) {
      con.close();
    }
  }
}

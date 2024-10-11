package Facebook;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class ConnectionManager {
    private Map<String, User> users;

    public ConnectionManager() {
        this.users = new HashMap<>();
    }

    public User createUser(String Name, String userType, String extraInfo) throws SQLException {
        String insertUser = "INSERT INTO users(Name, user_type, extra_info)VALUES(?,?,?)";

        try(Connection conn = DataBaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(insertUser, Statement.RETURN_GENERATED_KEYS)){
            pstmt.setString(1, "Ram");
            pstmt.setString(2, "Regular");
            pstmt.setString(3, null);
            pstmt.executeUpdate();

            ResultSet generatedKeys= pstmt.getGeneratedKeys();
            if(generatedKeys.next()){
                User user  = User.fromResultSet(generatedKeys);
                users.put(Name, user);
                return user;
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public User getUsers(String Name) throws SQLException, ClassNotFoundException {
        String selectSQL = "Select * from users where Name = ?";
        try(Connection conn = DataBaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(selectSQL)){
            pstmt.setString(1, Name);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                User user  = User.fromResultSet(rs);
                users.put(Name, user);
                return user;
            }

        }
        return null;
    }

        public void addConnections(String userName, String connectionName) throws SQLException, ClassNotFoundException {
        User user = getUsers(userName);
        User connection = getUsers(connectionName);

        if(user != null && connection != null){
            user.addConnections(connection);
            String insertSQL = "INSERT INTO connections(user_Id, connection_Id)VALUES(?,?)";
            try(Connection conn = DataBaseConnection.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
                pstmt.setInt(1, user.getId());
                pstmt.setInt(2, connection.getId());
                pstmt.executeUpdate();
            }
        }

    }

    public void loadConnections(User user) throws SQLException {
            String querySql = "Select u.* FROM connections c JOIN user u ON c.connection_Id = u.Id WHERE c.user_Id =?";
        try(Connection conn = DataBaseConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(querySql)) {
            pstmt.setInt(1, user.getId());

            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                User connection = User.fromResultSet(rs);
                user.addConnections(connection);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

package Facebook;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

public abstract class User {
    private Integer Id;
    private String Name;
    private String user_type;
    private String extra_info;
    private Set<User> connections;

    public User(Integer Id, String Name, String user_type, String extra_info, Set<User> connections) {
        this.Id = Id;
        this.Name = Name;
        this.user_type = user_type;
        this.extra_info = extra_info;
        this.connections = connections;
    }

    public User(int Id, String Name) {
        this.Id = Id;
        this.Name = Name;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getExtra_info() {
        return extra_info;
    }

    public void setExtra_info(String extra_info) {
        this.extra_info = extra_info;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }


    public Set<User> getConnections() {
        return connections;
    }

    public void setConnections(Set<User> connections) {
        this.connections = connections;
    }

    public void addConnections(User user){
        connections.add(user);

    }

    public abstract String getUserType();

    public static User fromResultSet(ResultSet rs) throws SQLException {
        String Name = rs.getString(2);
        String userType = rs.getString(3);
        String extraInfo = rs.getString(4);
        if("influencer".equalsIgnoreCase(userType)){
            return new Influencer(rs.getInt(1), Name, Integer.parseInt(extraInfo));
        }else{
            return new RegularUser(rs.getInt(1), Name);
        }
    }

}

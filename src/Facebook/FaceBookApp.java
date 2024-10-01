package Facebook;

import java.sql.SQLException;
import java.util.Set;

public class FaceBookApp {
    public static void main(String[] args) {
        ConnectionManager connectionManager = new ConnectionManager();
        try{
            User ram = connectionManager.createUser("Ram", "regular", null);
            User krishna = connectionManager.createUser("Krishna", "influencer", "1500");

            connectionManager.loadConnections(ram);
            connectionManager.loadConnections(krishna);

            Recommendation recommendation = new Recommendation();
            Set<User> recommondations = recommendation.recommendationsConnection(ram);

            System.out.println("Recommondations for : "+ram.getName()+ " : ");
            for(User user : recommondations){
                System.out.println(user.getName() + " ("+ user.getUserType()+ " )");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

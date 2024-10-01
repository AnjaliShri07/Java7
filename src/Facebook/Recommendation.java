package Facebook;

import java.util.HashSet;
import java.util.Set;

public class Recommendation {
    public Set<User> recommendationsConnection(User user){
        Set<User> recommendations = new HashSet<>();
        for(User connection : user.getConnections()){
            for (User mutualConnection: connection.getConnections()){
                if(!mutualConnection.equals(user) && user.getConnections().contains(mutualConnection)){
                    recommendations.add(mutualConnection);
                }
            }
        }
        return recommendations;
    }
}

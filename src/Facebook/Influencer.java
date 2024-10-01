package Facebook;

public class Influencer extends User{
    private int followerCount;

    @Override
    public String getUserType() {
        return "Influencer";
    }

    public Influencer(int id, String name, int followerCount){
        super(id, name);
        this.followerCount = followerCount;
    }

    public int getFollowerCount() {
        return followerCount;
    }
}

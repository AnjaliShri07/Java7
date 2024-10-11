package Facebook;

public class Influencer extends User{
    private int followerCount;

    @Override
    public String getUserType() {
        return "Influencer";
    }

    public Influencer(int id, String Name, int followerCount){
        super(id, Name);
        this.followerCount = followerCount;
    }

    public int getFollowerCount() {
        return followerCount;
    }
}

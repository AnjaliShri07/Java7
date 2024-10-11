package Facebook;

public class RegularUser extends User{
    public RegularUser(int Id, String Name){
        super(Id, Name);
    }

    @Override
    public String getUserType() {
        return "Regular User";
    }
}

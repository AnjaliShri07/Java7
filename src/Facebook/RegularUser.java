package Facebook;

public class RegularUser extends User{
    public RegularUser(int id, String name){
        super(id, name);
    }

    @Override
    public String getUserType() {
        return "Regular User";
    }
}

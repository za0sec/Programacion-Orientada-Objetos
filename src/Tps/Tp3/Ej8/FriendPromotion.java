package Tps.Tp3.Ej8;
import java.util.ArrayList; //Este ejercicio esta mal porque no se puede usar esto la concha de la lora!
public class FriendPromotion {

    public static final int MAX_FRIENDS = 3;

    private ArrayList<String> friends;
    private double discount;
    private int maxFriends;

    public FriendPromotion(){
        friends = new ArrayList<>(MAX_FRIENDS);
    }

    public boolean addFriend(String name){
            return friends.add(name);
    }

    public boolean removeFriend(String name){
            return friends.remove(name);
    }

    public void setDiscountPercentage(double discountPercentage){
        this.discount = discountPercentage;
    }

    public boolean isFriend(String name){
        return friends.contains(name);
    }
}

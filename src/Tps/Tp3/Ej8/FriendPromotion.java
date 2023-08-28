package Tps.Tp3.Ej8;
import java.util.ArrayList;
public class FriendPromotion {

    public static final int MAX_FRIENDS = 3;

    private ArrayList<String> friends;
    private double discount;
    private int maxFriends;

    public FriendPromotion(){
        friends = new ArrayList<>(MAX_FRIENDS);
        this.discount = 0.2;
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

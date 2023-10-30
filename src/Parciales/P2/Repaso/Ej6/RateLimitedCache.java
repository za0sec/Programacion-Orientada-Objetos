package Parciales.P2.Repaso.Ej6;
//PREGUNTAR TODO EL EJ0
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class RateLimitedCache<K, V> extends BaseCache<K, V>{

    private LocalDateTime date;

    Map<User, QuotaType> users = new HashMap<>();

    public void register(String user, QuotaType type){
        users.put(new User(user), type);
    }

    @Override
    public void put(String user, String date, K key, V value) {
        User theUser = new User(user);
        for(User myUser : users.keySet()) {
            if (theUser.equals(myUser)) {
                myUser.setDate(date);
                if (users.get(myUser).canWrite(myUser.getWrite(date))) {
                    super.put(user, date, key, value);
                    myUser.sumWrite(date);
                    return;
                } else {
                    throw new RateLimitedException("Cannot put " + key + " -> " + value + " on " + date);
                }
            }
        }
        throw new IllegalArgumentException("User not registered: " + user);
    }

    @Override
    public V get(String user, String date, K key) {
        User theUser = new User(user);
        for(User myUser : users.keySet()) {
            if (theUser.equals(myUser)) {
                myUser.setDate(date);
                if (users.get(myUser).canRead(myUser.getRead(date))) {
                    myUser.sumRead(date);
                    return super.get(user, date, key);
                } else {
                    throw new RateLimitedException("Cannot read " + key + " on " + date);
                }
            }
        }
        throw new IllegalArgumentException("User not registered: " + user);
    }
}

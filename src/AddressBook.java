import java.util.ArrayList;
import java.util.Random;
public class AddressBook {
    ArrayList<BuddyInfo> buddies;

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }

    public AddressBook(){
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo pal){
        if(pal != null){
            buddies.add(pal);
        }
    }

    public void removeBuddy(int location){
        if(location >= 0 && location <= buddies.size()){
            buddies.remove(location);
        }
    }

    public BuddyInfo randomBuddy(){
        Random r = new Random();
        int x = r.nextInt(buddies.size());
        return buddies.get(x);
    }
}

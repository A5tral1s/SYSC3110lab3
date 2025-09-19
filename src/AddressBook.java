import java.util.List;
public class AddressBook {
    List<BuddyInfo> buddies;


    public static void main(String[] args){
        System.out.println("Address Book");
    }

    public AddressBook(){
        this.buddies = null;
    }

    public void addBuddy(BuddyInfo pal){
        buddies.add(pal);
    }

    public void removeBuddy(BuddyInfo notPal){
        buddies.remove(notPal);
    }
}

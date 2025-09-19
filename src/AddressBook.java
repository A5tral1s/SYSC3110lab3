import java.util.List;
public class AddressBook {
    List<BuddyInfo> buddies;

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
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

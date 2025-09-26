import java.util.ArrayList;
public class AddressBook {
    ArrayList<BuddyInfo> buddies;

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }

    public AddressBook(){
        this.buddies = new ArrayList<BuddyInfo>();
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
}

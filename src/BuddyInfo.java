public class BuddyInfo {
    String name;
    String address;

    //Adding comment for lab3
    static final String basename = "Steve";
    static final String baseAddress = "Carleton";

    public BuddyInfo() {
        this.name = basename;
        this.address = baseAddress;
    }

    public BuddyInfo(String named, String add) {
        this.name = named;
        this.address = add;
    }

    public static void main(String[] args) {
        BuddyInfo x = new BuddyInfo();
        x.setName(basename);
        System.out.printf("Hello, %s%n", x.getName());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class BuddyInfo {
    String name;
    String address;

    static final String basename = "Steve";
    static final String baseadd = "Carleton";

    public BuddyInfo() {
        this.name = basename;
        this.address = baseadd;
    }

    public BuddyInfo(String namey, String add) {
        this.name = namey;
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

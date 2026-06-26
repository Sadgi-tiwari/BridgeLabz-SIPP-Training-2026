public class Main {

    // Print all member details
    public static void printMembers(LibraryMember[] members) {

        System.out.println("Library Members:\n");

        for (LibraryMember member : members) {
            member.printDetails();
            System.out.println("----------------------");
        }
    }

    // Calculate fine using dynamic method dispatch
    public static void calculateFine(LibraryMember[] members, int overdueDays) {

        System.out.println("\nFine Details:\n");

        for (LibraryMember member : members) {
            member.printDetails();
            System.out.println("Fine = ₹" + member.calculateFine(overdueDays));
            System.out.println("----------------------");
        }
    }

    // Search member by ID
    public static void searchMember(LibraryMember[] members, String id) {

        boolean found = false;

        for (LibraryMember member : members) {

            if (member.memberId.equals(id)) {

                System.out.println("\nMember Found:");
                member.printDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nMember with ID " + id + " not found.");
        }
    }

    public static void main(String[] args) {

        LibraryMember[] members = {
                new StudentMember("Sadgi", "S101"),
                new FacultyMember("Rahul", "F201"),
                new GuestMember("Priya", "G301"),
                new StudentMember("Aman", "S102")
        };

        printMembers(members);

        calculateFine(members, 5);

        searchMember(members, "F201");
    }
}

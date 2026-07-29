public class SearchHistory {

    private String[] history = new String[100];
    private int count = 0;

    public void addHistory(String text) {

        history[count] = text;
        count++;

        System.out.println("Search Saved.");
    }

    public void displayHistory() {

        System.out.println("\n===== SEARCH HISTORY =====");

        for (int i = 0; i < count; i++) {

            System.out.println((i + 1) + ". " + history[i]);
        }
    }

    public int getCount() {

        return count;
    }
}
public class ConfigManager {

    private String theme = "Light";
    private String language = "English";

    public void setTheme(String theme) {

        this.theme = theme;
    }

    public String getTheme() {

        return theme;
    }

    public void setLanguage(String language) {

        this.language = language;
    }

    public String getLanguage() {

        return language;
    }

    public void displaySettings() {

        System.out.println("\n===== CONFIGURATION =====");
        System.out.println("Theme : " + theme);
        System.out.println("Language : " + language);
    }
}
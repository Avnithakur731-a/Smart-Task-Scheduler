public class SettingsManager {

    private ConfigManager config = new ConfigManager();

    public void changeTheme(String theme) {

        config.setTheme(theme);
    }

    public void changeLanguage(String language) {

        config.setLanguage(language);
    }

    public void showSettings() {

        config.displaySettings();
    }

    public ConfigManager getConfig() {

        return config;
    }
}
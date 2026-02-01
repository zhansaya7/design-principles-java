public class DRY {

    static class Logger {
        void log(String level, String message) {
            System.out.println(level + ": " + message);
        }
    }

    static class AppConfig {
        static final String CONNECTION =
                "Server=myServer;Database=myDb;User Id=myUser;Password=myPass;";
    }
}

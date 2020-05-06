package utils;

import lombok.Getter;
import lombok.Setter;

public class PropertiesLabels {

    private PropertiesLabels(){}

    @Getter @Setter private static String marketDatabase = "marketDatabase";
    @Getter @Setter private static String dbPassword = "dbPassword";
    @Getter @Setter private static String dbUser = "application";
    @Getter @Setter private static String dbUrl = "dbUrl";

}

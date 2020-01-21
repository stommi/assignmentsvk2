package TDD;

public class GreetingKata {

    public String greet(String name) {
        String greet = "Hello, ";
        if (name==null) {
            name = "my friend";
        } else if (name.equals(name.toUpperCase())) {
            return greet.toUpperCase() + name + ".";
        } else if (name.contains(",")) {
            String[] nimet = name.split(",");
            return greet + nimet[0] + " and " + nimet[1] + ".";
        }
        return greet + name + ".";
    }
}

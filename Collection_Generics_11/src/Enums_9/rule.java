package Enums_9;

public enum rule {
    RED("Stop"), GREEN("Go"), YELLOW("Wait");

    private final String action;

    public String getAction() {
        return action;
    }

    rule(String action) {
        this.action = action;
    }
}

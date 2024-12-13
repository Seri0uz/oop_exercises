package ch.hslu.sw13;

public enum State {
    ON("on"), OFF("off");
    private final String state;

    State(String state) {
        this.state = state;
    }
    public String getState() {
        return this.state;
    }
}

public class Side {

    private String value;

    public Side(String value) {
        this.value = value;
    }

    public Integer getValueAsInteger() {
        return Integer.parseInt(value);
    }

    public String getValueAsString() {
        return this.value;
    }

}

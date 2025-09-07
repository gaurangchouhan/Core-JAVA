package Exercise18CollectionGenerics.problem97;

public enum Day {
    Sunday(false), Monday(true),
    Tuesday(true), Wednesday(true),
     Thursday(true), Friday(true),
    Saturday(false);

    private final boolean isWeekday;

    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public boolean isWeekday() {
        return isWeekday;
    }

    public String getType(){
        return isWeekday ? "Weekday" : "Weekend";
    }
}

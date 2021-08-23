import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event extends Task {

    protected LocalDateTime at;

    public Event(String name, LocalDateTime at) {
        super(name);
        this.at = at;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyyy HH:mm");
        return "[E]" + super.toString() + " (at: " + this.at.format(formatter) + ")";
    }

    @Override
    public String getRecordString() {
        int done = this.isDone ? 1 : 0;
        String record = String.format("E | %d | %s | %s", done, this.name, this.at);
        return record;
    }
}


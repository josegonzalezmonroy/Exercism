import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;

public class Gigasecond {
    private final LocalDateTime result;

    public Gigasecond(LocalDate moment) {
        this.result = moment.atStartOfDay().plusSeconds(1_000_000_000L);
    }

    public Gigasecond(LocalDateTime moment) {
        this.result = moment.plusSeconds(1_000_000_000L);
    }

    public LocalDateTime getDateTime() {
        return this.result;
    }
}

package production;

import org.joda.time.Period;
import production.domain.Blocker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import static java.lang.String.format;
import static production.support.TimeLapseCalculator.lapseFrom;

public class StorageBean {

    private static List<Blocker> blocked = new ArrayList<>();
    private static List<Blocker> unblocked = new ArrayList<>();

    public void block(Blocker blocker) throws IOException {
        blocked.add(blocker);
    }

    public void unblock(Blocker blocker) throws Exception {
        unblocked.add(lapseFrom(blocker));
        delete(blocker);
    }

    private void delete(Blocker blocker) throws IOException {
        blocked.remove(blocker);
    }

    public List<Blocker> allBlockers() throws IOException {
        return blocked;
    }

    public List<Blocker> allUnblocked() {
        return unblocked;
    }

    public String averageBlockedTime() {
        try {

            Optional<Long> reduce = unblocked.stream().map(Blocker::getElapsedTimeInMillis).reduce((seed, value) -> seed += value);
            Period period = new Period(reduce.get() / unblocked.size());

            return format("%d days, %d hours, %d minutes, %d seconds", period.getDays(), period.getHours(), period.getMinutes(), period.getSeconds());

        } catch (NoSuchElementException e) {
            return "Nothing unblocked!";
        }
    }

}

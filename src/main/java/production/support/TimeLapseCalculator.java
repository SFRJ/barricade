package production.support;

import org.joda.time.Interval;
import org.joda.time.Period;
import production.domain.Blocker;

import java.text.ParseException;
import java.util.Date;

import static java.lang.String.format;

public class TimeLapseCalculator {

    public static Blocker lapseFrom(Blocker blocker) throws ParseException {

        Interval interval = new Interval(blocker.getDate().getTime(), new Date().getTime());
        Period period = interval.toPeriod();

        blocker.setHowLongWasBlockedFor(
                format("%d days, %d hours, %d minutes, %d seconds",
                        period.getDays(), period.getHours(), period.getMinutes(), period.getSeconds()));
        return blocker;
    }
}

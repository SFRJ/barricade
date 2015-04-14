package production.domain;

import java.util.Date;

public class Blocker {

    private final String yourTeam;
    private final String whoBlocksYou;
    private final String reason;
    private final String urgency;
    private final Date date;
    private String reference;
    private String howLongWasBlockedFor;

    public Blocker(String yourTeam, String whoBlocksYou, String reason, String urgency, Date date, String reference) {
        this.yourTeam = yourTeam;
        this.whoBlocksYou = whoBlocksYou;
        this.reason = reason;
        this.urgency = urgency;
        this.date = date;
        this.reference = reference;
    }

    public String getYourTeam() {
        return yourTeam;
    }

    public String getWhoBlocksYou() {
        return whoBlocksYou;
    }

    public String getReason() {
        return reason;
    }

    public String getUrgency() {
        return urgency;
    }

    public Date getDate() {
        return date;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getHowLongWasBlockedFor() {
        return howLongWasBlockedFor;
    }

    public void setHowLongWasBlockedFor(String howLongWasBlockedFor) {
        this.howLongWasBlockedFor = howLongWasBlockedFor;
    }

    @Override
    public String toString() {
        return "{" +
                "yourTeam='" + yourTeam + '\'' +
                ", whoBlocksYou='" + whoBlocksYou + '\'' +
                ", reason='" + reason + '\'' +
                ", urgency='" + urgency + '\'' +
                ", date='" + date + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Blocker blocker = (Blocker) o;

        if (date != null ? !date.equals(blocker.date) : blocker.date != null) return false;
        if (howLongWasBlockedFor != null ? !howLongWasBlockedFor.equals(blocker.howLongWasBlockedFor) : blocker.howLongWasBlockedFor != null)
            return false;
        if (reason != null ? !reason.equals(blocker.reason) : blocker.reason != null) return false;
        if (reference != null ? !reference.equals(blocker.reference) : blocker.reference != null) return false;
        if (urgency != null ? !urgency.equals(blocker.urgency) : blocker.urgency != null) return false;
        if (whoBlocksYou != null ? !whoBlocksYou.equals(blocker.whoBlocksYou) : blocker.whoBlocksYou != null)
            return false;
        if (yourTeam != null ? !yourTeam.equals(blocker.yourTeam) : blocker.yourTeam != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yourTeam != null ? yourTeam.hashCode() : 0;
        result = 31 * result + (whoBlocksYou != null ? whoBlocksYou.hashCode() : 0);
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        result = 31 * result + (urgency != null ? urgency.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (reference != null ? reference.hashCode() : 0);
        result = 31 * result + (howLongWasBlockedFor != null ? howLongWasBlockedFor.hashCode() : 0);
        return result;
    }
}

package production.domain;

public class Blocker {

    private final String yourTeam;
    private final String whoBlocksYou;
    private final String reason;
    private final String urgency;
    private final String date;
    private String reference;

    public Blocker(String yourTeam, String whoBlocksYou, String reason, String urgency, String date, String reference) {
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

    public String getDate() {
        return date;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
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
}

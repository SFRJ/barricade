package production;

import production.domain.Blocker;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

import static java.util.UUID.randomUUID;

public class NewBlockerBean implements Serializable {

    private String yourTeam;
    private String whoBlocksYou;
    private String reason;
    private String urgency;
    private StorageBean storageBean;


    public NewBlockerBean() {

    }

    @PostConstruct
    public void init() {
        storageBean = new StorageBean();
    }

    public void onFormSubmit(ActionEvent actionEvent) throws IOException {
        //TODO Don't change the date format, there is a bug when reading from the blockers.txt file
        storageBean.block(
                new Blocker(yourTeam, whoBlocksYou, reason, urgency,
                       new Date(), randomUUID().toString()));
    }

    private void redirect() throws IOException {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletResponse response = (HttpServletResponse)context.getExternalContext().getResponse();
        response.sendRedirect("allblockers.xhtml");
    }

    public String getYourTeam() {
        return yourTeam;
    }

    public void setYourTeam(String yourTeam) {
        this.yourTeam = yourTeam;
    }

    public String getWhoBlocksYou() {
        return whoBlocksYou;
    }

    public void setWhoBlocksYou(String whoBlocksYou) {
        this.whoBlocksYou = whoBlocksYou;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

}

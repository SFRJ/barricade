package production;


import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

public class NavigationBean implements Serializable {

    public void allBlockers() throws IOException {
        redirectTo("allblockers.xhtml");
    }

    public void newBlocker() throws IOException {
        redirectTo("newblocker.xhtml");
    }

    public void unblocked() throws IOException {
        redirectTo("unblocked.xhtml");
    }

    public void about() throws IOException {
        redirectTo("about.xhtml");
    }

    private void redirectTo(String page) throws IOException {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletResponse response = (HttpServletResponse)context.getExternalContext().getResponse();
        response.sendRedirect(page);
    }
}

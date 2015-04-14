package production;

import production.domain.Blocker;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UnblockBean {

    private StorageBean storageBean;

    @PostConstruct
    public void init() {
        storageBean = new StorageBean();
    }

    public void unblock(Object o) throws IOException {
        storageBean.unblock((Blocker) o);
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletResponse response = (HttpServletResponse)context.getExternalContext().getResponse();
        response.sendRedirect("unblocked.xhtml");
    }

}

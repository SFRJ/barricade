package production;

import production.domain.Blocker;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.List;

public class AllBlockersBean {

    private StorageBean storageBean;

    @PostConstruct
    public void init() {
        storageBean = new StorageBean();
    }

    public List<Blocker> blockers() throws IOException {
        return storageBean.allBlockers();
    }

    public List<Blocker> unblocked() throws IOException {
        return storageBean.allUnblocked();
    }
}

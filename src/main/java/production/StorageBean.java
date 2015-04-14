package production;

import production.domain.Blocker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StorageBean {

    private static List<Blocker> blocked = new ArrayList<>();
    private static List<Blocker> unblocked = new ArrayList<>();

    public void block(Blocker blocker) throws IOException {
        blocked.add(blocker);
    }

    public void unblock(Blocker blocker) throws IOException {
        unblocked.add(blocker);
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
}

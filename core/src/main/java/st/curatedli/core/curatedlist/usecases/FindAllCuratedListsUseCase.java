package st.curatedli.core.curatedlist.usecases;

import st.curatedli.core.curatedlist.gateway.CuratedListGateway;
import st.curatedli.core.curatedlist.response.CuratedListResponse;

import java.util.Collection;

public class FindAllCuratedListsUseCase implements FindAllCuratedLists {

    private CuratedListGateway curatedListGateway;

    public FindAllCuratedListsUseCase(CuratedListGateway curatedListGateway) {
        this.curatedListGateway = curatedListGateway;
    }
    @Override
    public Collection<CuratedListResponse> get() {
        return curatedListGateway.findAll();
    }
}

package st.curatedli.core.curatedlist.usecases;

import st.curatedli.core.curatedlist.CuratedList;
import st.curatedli.core.curatedlist.gateway.CuratedListGateway;
import st.curatedli.core.curatedlist.request.CuratedListRequest;

public class SaveCuratedListUseCase implements SaveCuratedList {

    private CuratedListGateway curatedListGateway;

    public SaveCuratedListUseCase(CuratedListGateway curatedListGateway) {
        this.curatedListGateway = curatedListGateway;
    }

    @Override
    public CuratedList save(CuratedListRequest curatedListRequest) {
        return curatedListGateway.save(curatedListRequest.toCuratedList());
    }
}

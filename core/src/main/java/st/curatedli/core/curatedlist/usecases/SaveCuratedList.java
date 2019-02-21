package st.curatedli.core.curatedlist.usecases;

import st.curatedli.core.curatedlist.CuratedList;
import st.curatedli.core.curatedlist.request.CuratedListRequest;

public interface SaveCuratedList {
    CuratedList save(CuratedListRequest curatedListRequest);
}

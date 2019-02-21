package st.curatedli.core.curatedlist.gateway;

import st.curatedli.core.curatedlist.CuratedList;
import st.curatedli.core.curatedlist.response.CuratedListResponse;

import java.util.Collection;

public interface CuratedListGateway {
    CuratedList save(CuratedList curatedList);
    Collection<CuratedListResponse> findAll();
}

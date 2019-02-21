package st.curatedli.core.curatedlist.usecases;

import st.curatedli.core.curatedlist.response.CuratedListResponse;

import java.util.Collection;

public interface FindAllCuratedLists {
    Collection<CuratedListResponse> get();
}

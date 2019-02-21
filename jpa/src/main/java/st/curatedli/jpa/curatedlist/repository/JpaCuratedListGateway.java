package st.curatedli.jpa.curatedlist.repository;

import org.springframework.stereotype.Repository;
import st.curatedli.core.curatedlist.CuratedList;
import st.curatedli.core.curatedlist.gateway.CuratedListGateway;
import st.curatedli.core.curatedlist.response.CuratedListResponse;
import st.curatedli.jpa.curatedlist.entity.CuratedListEntity;

import java.util.ArrayList;
import java.util.Collection;

@Repository
public class JpaCuratedListGateway implements CuratedListGateway {

    private final CuratedListRepository curatedListRepository;

    public JpaCuratedListGateway(CuratedListRepository curatedListRepository) {
        this.curatedListRepository = curatedListRepository;
    }

    @Override
    public CuratedList save(CuratedList curatedList) {
        return curatedListRepository.save(CuratedListEntity.fromCuratedList(curatedList)).toCuratedList();
    }

    @Override
    public Collection<CuratedListResponse> findAll() {
        Collection<CuratedListResponse> curatedListResponses = new ArrayList<>();
        curatedListRepository.findAll().forEach(
                curatedListEntity -> curatedListResponses.add(curatedListEntity.toCuratedList().toCuratedListResponse())
        );
        return curatedListResponses;
    }
}

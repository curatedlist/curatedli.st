package st.curatedli.jpa.curatedlist.repository;

import org.springframework.data.repository.CrudRepository;
import st.curatedli.jpa.curatedlist.entity.CuratedListEntity;

public interface CuratedListRepository extends CrudRepository<CuratedListEntity, Integer>{
}

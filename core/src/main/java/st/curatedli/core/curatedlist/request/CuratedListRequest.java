package st.curatedli.core.curatedlist.request;

import lombok.Data;
import st.curatedli.core.curatedlist.CuratedList;

@Data
public class CuratedListRequest {
    private String name;
    private String description;

    public CuratedList toCuratedList() {
        return CuratedList.builder()
                .name(getName())
                .description(getDescription())
                .build();
    }
}

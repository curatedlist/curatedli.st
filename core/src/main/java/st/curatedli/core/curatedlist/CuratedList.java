package st.curatedli.core.curatedlist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import st.curatedli.core.curatedlist.response.CuratedListResponse;

@Data
@AllArgsConstructor
@Builder
public class CuratedList {
    private String name;
    private String description;

    public CuratedListResponse toCuratedListResponse() {
        return CuratedListResponse.builder()
                .name(getName())
                .description(getDescription())
                .build();
    }
}

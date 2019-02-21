package st.curatedli.core.curatedlist.response;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CuratedListResponse {
    private String name;
    private String description;
}

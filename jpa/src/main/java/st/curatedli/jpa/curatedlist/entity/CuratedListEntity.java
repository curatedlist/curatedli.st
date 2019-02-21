package st.curatedli.jpa.curatedlist.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import st.curatedli.core.curatedlist.CuratedList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CuratedListEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String name;
    private String description;

    public CuratedList toCuratedList() {
        return CuratedList.builder()
                .name(getName())
                .description(getDescription())
                .build();
    }
    public static CuratedListEntity fromCuratedList(CuratedList curatedList) {
        return CuratedListEntity.builder()
                .name(curatedList.getName())
                .description(curatedList.getDescription())
                .build();
    }
}

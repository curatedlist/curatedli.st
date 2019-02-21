package st.curatedli.mvc.curatedlist;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import st.curatedli.core.curatedlist.request.CuratedListRequest;
import st.curatedli.core.curatedlist.response.CuratedListResponse;
import st.curatedli.core.curatedlist.usecases.FindAllCuratedLists;
import st.curatedli.core.curatedlist.usecases.SaveCuratedList;

import javax.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping("/api")
public class CuratedListController {

    private final FindAllCuratedLists findAllCuratedLists;
    private final SaveCuratedList saveCuratedList;

    @Autowired
    public CuratedListController(FindAllCuratedLists findAllCuratedLists, SaveCuratedList saveCuratedList) {
        this.findAllCuratedLists = findAllCuratedLists;
        this.saveCuratedList = saveCuratedList;
    }

    @GetMapping("/curatedlist")
    public Collection<CuratedListResponse> getAllCuratedLists() {
        return findAllCuratedLists.get();
    }

    @PostMapping("/curatedlist")
    public ResponseEntity<?> saveBook(@Valid @RequestBody CuratedListRequest curatedListRequest) {
        return new ResponseEntity<>(saveCuratedList.save(curatedListRequest), HttpStatus.CREATED);
    }
}

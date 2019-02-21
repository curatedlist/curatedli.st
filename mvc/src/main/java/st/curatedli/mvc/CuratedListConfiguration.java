package st.curatedli.mvc;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import st.curatedli.core.curatedlist.gateway.CuratedListGateway;
import st.curatedli.core.curatedlist.usecases.FindAllCuratedLists;
import st.curatedli.core.curatedlist.usecases.FindAllCuratedListsUseCase;
import st.curatedli.core.curatedlist.usecases.SaveCuratedList;
import st.curatedli.core.curatedlist.usecases.SaveCuratedListUseCase;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"st.curatedli"})
public class CuratedListConfiguration {

    @Bean
    public FindAllCuratedLists findAllCuratedLists(CuratedListGateway curatedListGateway) {
        return new FindAllCuratedListsUseCase(curatedListGateway);
    }

    @Bean
    public SaveCuratedList saveCuratedList(CuratedListGateway curatedListGateway) {
        return new SaveCuratedListUseCase(curatedListGateway);
    }
}

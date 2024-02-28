package pl.lewandowski.readerarticleretriever;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReaderArticleRetrieverFacadeTest {

    @Test
    @DisplayName("should return article with id 1 and content xxx")
    void shouldReturnArticleWithId1AndContentXxx(){
        //given
        ReaderArticleRetrieverFacade facade = new ReaderArticleRetrieverFacade();

        //when
        ArticleDto articleDto = facade.retrievalById(1L);

        //then
        assert articleDto.id().equals(1L);
        assert articleDto.header().equals("jak zostac programista");
        assert articleDto.content().equals("5 krokow: 1, 2, 3, 4");

    }

}
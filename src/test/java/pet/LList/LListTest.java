package pet.LList;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import pet.linkedlist.LinkList;


@WebMvcTest()
public class LListTest {

    @Autowired
    private MockMvc mockMvc;



    @Test
    public void testInsert(){

        //Arrange
        LinkList myList = new LinkList();

        //Act
        for(long i = 1; i <= 10; i++)
            myList.insert(i);

        //Assert
        Assertions.assertThat(myList.display()).isEqualTo("1->2->3->4->5->6->7->8->9->10->null");
    }
}

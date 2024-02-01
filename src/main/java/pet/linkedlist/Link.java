package pet.linkedlist;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Link {

    @Getter
    public long linkData;
    public Link next;

    protected Link(long data){
        linkData = data;
    }

}

package pet.linkedlist;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import pet.Settings;

@Slf4j
public class LinkList {

    private Link head;
    private Link curr;

    public LinkList(){
        head = null;
        curr = null;
    }

    public void insert(long data){

        Link newLink = new Link(data);

        if(curr == null) curr = new Link(0);
        curr.next = newLink;

        if(head == null) head = curr.next;
        curr = curr.next;

    }
    public String display(){
        StringBuilder sb = new StringBuilder();
        Link now = head;

        while(now != null){
            sb.append(Long.toString(now.getLinkData())).append("->");
            now = now.next;
        }

        sb.append("null");
        //log.info(sb.toString());
        return sb.toString();
    }

    public void fillRandom(){
        int size = Settings.LINKLIST.size();
        final long range = Settings.LINKLIST.range();

        for(int i = 0; i < size; i++)
            insert( (long) (Math.random() * range));

        head = head.next;
    }
}

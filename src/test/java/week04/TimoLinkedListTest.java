package week04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TimoLinkedListTest {

    @DisplayName("제일 앞에 요소 삽입")
    @Test
    void pushFirst() {
        //given
        TimoLinkedList linkedListEmpty = new TimoLinkedList();
        TimoLinkedList linkedListAppend = new TimoLinkedList();
        Node fistNode = new Node(1);
        Node secondNode = new Node(1);

        //when
        linkedListEmpty.pushFirst(fistNode);
        linkedListAppend.pushFirst(fistNode);
        linkedListAppend.pushFirst(secondNode);

        //then
        assertThat(linkedListEmpty.size()).isEqualTo(1);
        assertThat(linkedListAppend.size()).isEqualTo(2);
    }
}
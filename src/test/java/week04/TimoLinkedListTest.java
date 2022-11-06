package week04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TimoLinkedListTest {

    @DisplayName("제일 앞에 요소 삽입")
    @Test
    void pushFirst() {
        //given
        TimoLinkedList linkedList = new TimoLinkedList();
        Node newNode = new Node(1);

        //when
        linkedList.pushFirst(newNode);

        //then
        assertThat(linkedList.size()).isEqualTo(1);
    }
}
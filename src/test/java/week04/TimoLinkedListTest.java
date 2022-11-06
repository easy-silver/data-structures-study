package week04;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        Assertions.assertThat(linkedList.size()).isEqualTo(1);
    }
}
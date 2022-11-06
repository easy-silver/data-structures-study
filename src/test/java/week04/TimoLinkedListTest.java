package week04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

    @DisplayName("제일 첫 요소 제거")
    @Test
    void popFirst() {
        //given
        TimoLinkedList linkedList = new TimoLinkedList();
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);

        linkedList.pushFirst(thirdNode);
        linkedList.pushFirst(secondNode);
        linkedList.pushFirst(firstNode);

        //when
        Node popNode = linkedList.popFirst();

        //then
        assertThat(popNode).isEqualTo(firstNode);
    }

    @DisplayName("비어있는 리스트에서 popFirst()를 호출하면 예외 발생")
    @Test
    void popFirstException() {
        //given
        TimoLinkedList linkedList = new TimoLinkedList();

        //when & then
        assertThatThrownBy(linkedList::popFirst)
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("비어있는 리스트입니다.");
    }
}
package ch02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class QueueTest {

    @DisplayName("특정 용량의 큐를 생성한다")
    @Test
    void init() {
        //given
        int size = 3;

        //when
        Queue queue = Queue.create(size);

        //then
        Assertions.assertEquals(queue.getCapacity(), size);
    }

    @DisplayName("큐에 값을 삽입한다")
    @Test
    void enqueue() {
        //given
        Queue queue = Queue.create(3);
        int item = 10;

        //when
        queue.enqueue(item);

        //then
        Assertions.assertEquals(1, queue.size());
    }

    @DisplayName("큐의 용량이 다 되었으면 삽입에 실패한다.")
    @Test
    void full() {
        //given
        int capacity = 1;
        Queue queue = Queue.create(capacity);

        //when
        queue.enqueue(10);

        //then
        Assertions.assertThrows(IllegalStateException.class, () -> queue.enqueue(20));
        Assertions.assertEquals(1, queue.size());
    }

    @DisplayName("큐에서 첫 번째 값을 꺼낸다")
    @Test
    void dequeue() {
        //given
        Queue queue = Queue.create(3);
        int firstItem = 10;
        queue.enqueue(firstItem);
        queue.enqueue(20);

        //when
        int result = queue.dequeue();

        //then
        Assertions.assertEquals(firstItem, result);
    }
}
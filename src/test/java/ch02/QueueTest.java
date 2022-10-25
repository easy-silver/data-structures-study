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
    void enqueue() {
        //given
        Queue queue = Queue.create(3);
        int item = 10;

        //when
        queue.enqueue(item);

        //then
        Assertions.assertEquals(1, queue.size);
    }
}
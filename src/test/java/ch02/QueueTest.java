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
}
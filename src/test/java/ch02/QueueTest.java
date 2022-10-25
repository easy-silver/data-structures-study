package ch02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @DisplayName("특정 용량의 큐를 생성한다")
    @Test
    void init() {
        //given
        int size = 3;

        //when
        Queue queue = Queue.create(size);

        //then
        assertEquals(queue.getCapacity(), size);
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
        assertEquals(1, queue.size());
    }

    @DisplayName("큐의 용량이 다 되었으면 삽입에 실패한다.")
    @Test
    void enqueueWhenFull() {
        //given
        int capacity = 1;
        Queue queue = Queue.create(capacity);

        //when
        queue.enqueue(10);

        //then
        Assertions.assertThrows(IllegalStateException.class, () -> queue.enqueue(20));
        assertEquals(1, queue.size());
    }

    @DisplayName("삽입된 순서를 기준으로 큐에서 값을 꺼낸다. 다 꺼내오면 큐는 비어있다.")
    @Test
    void dequeue() {
        //given
        Queue queue = Queue.create(3);
        int firstItem = 10;
        int secondItem = 20;
        queue.enqueue(firstItem);
        queue.enqueue(secondItem);

        //when, then
        assertEquals(firstItem, queue.dequeue());
        assertEquals(secondItem, queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @DisplayName("큐가 비어있으면 꺼낼 수 없다")
    @Test
    void dequeWhenEmpty() {
        //given
        Queue queue = Queue.create(3);

        //then
        Assertions.assertThrows(IllegalStateException.class, queue::dequeue);
    }

    @DisplayName("큐가 비어있는지 확인한다")
    @Test
    void isEmpty() {
        //given
        Queue queue1 = Queue.create(3);
        Queue queue2 = Queue.create(3);
        queue2.enqueue(10);

        //then
        assertTrue(queue1.isEmpty());
        assertFalse(queue2.isEmpty());
    }

    @DisplayName("큐가 꽉 차있는지 확인한다")
    @Test
    void isFull() {
        //given
        Queue queue1 = Queue.create(3);
        queue1.enqueue(10);
        queue1.enqueue(20);
        queue1.enqueue(30);

        Queue queue2 = Queue.create(3);
        queue2.enqueue(100);

        //then
        assertTrue(queue1.isFull());
        assertFalse(queue2.isFull());
    }
}
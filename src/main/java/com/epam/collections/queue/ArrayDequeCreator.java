package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {

    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> gameRes = new ArrayDeque<>();
        ArrayDeque<Integer> first = new ArrayDeque<>(firstQueue);
        ArrayDeque<Integer> second = new ArrayDeque<>(secondQueue);

        if (first.peek() != null) gameRes.add(first.poll());
        if (first.peek() != null) gameRes.add(first.poll());
        if (second.peek() != null) gameRes.add(second.poll());
        if (second.peek() != null) gameRes.add(second.poll());

        while (first.size() != 0 && second.size() != 0) {

            if(gameRes.peek() != null) first.addLast(gameRes.pollLast());
            if (first.peek() != null) gameRes.addLast(first.poll());
            if (first.peek() != null) gameRes.addLast(first.poll());

            if(gameRes.peek() != null) second.addLast(gameRes.pollLast());
            if (second.peek() != null) gameRes.addLast(second.poll());
            if (second.peek() != null) gameRes.addLast(second.poll());

        }

        return gameRes;
    }
}

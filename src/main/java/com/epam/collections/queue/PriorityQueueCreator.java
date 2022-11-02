package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {

    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        List<String> combineList = new LinkedList<>(firstList);
        combineList.addAll(secondList);

        PriorityQueue<String> res = new PriorityQueue<>(Comparator.reverseOrder());

        for(String r : combineList)
            res.offer(r);

        return res;
    }
}

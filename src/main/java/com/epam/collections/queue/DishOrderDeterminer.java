package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {

    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> dishQue = new ArrayDeque<>();
        Queue<Integer> temp = new ArrayDeque<>();;
        int count = 1;

        for (int i = 1; i <= numberOfDishes; i++) dishQue.add(i);
        List<Integer> dishOrder = new ArrayList<>();

        while (dishOrder.size() < numberOfDishes) {
            while (dishQue.size() > 0) {
                if (count % everyDishNumberToEat == 0)
                    dishOrder.add(dishQue.poll());
                else
                    temp.add(dishQue.poll());

                count++;
            }
            dishQue = temp;
        }

        return dishOrder;
    }
}

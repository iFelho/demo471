package com.puzzle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bridge {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(9, 7, 15, 21));
    int minutes = calculateFastestPersonsRoute(list);
    System.out.println(minutes);
  }

  public static int calculateFastestPersonsRoute(List<Integer> list) {
    int maxSpeed = findSmallest(list);
    int route = maxSpeed;
    for (int i = 0; i < list.size(); i++) {
      route += list.get(i);
    }
    return route + (list.size() - 4) * maxSpeed;
  }

  public static int findSmallest(List<Integer> list) {
//    return 6;
    int smallest = list.get(0);
    for (int i = 1; i < list.size(); i++) {
      if (smallest > list.get(i)) {
        smallest = list.get(i);
      }
    }
    return smallest;
  }
}

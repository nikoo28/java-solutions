package leetcode.medium;

import leetcode.DoubleListNode;

import java.util.*;

/**
 * Created by nikoo28 on 7/6/19 7:44 PM
 */

class LRUCache {

//  Set<Integer> lru;
//  final int maxCapacity;
//  int ticks;
//  HashMap<Integer, Integer> keyValPair;
//  HashMap<Integer, Integer> valTicksPair;
//
//  public LRUCache(int capacity) {
//
//    lru = new HashSet<>();
//    maxCapacity = capacity;
//    ticks = 0;
//    keyValPair = new HashMap<>(capacity);
//    valTicksPair = new HashMap<>(capacity);
//  }
//
//  public int get(int key) {
//
//    if (!lru.contains(key))
//      return -1;
//
//    ticks++;
//    valTicksPair.put(key, ticks);
//
//    return keyValPair.get(key);
//  }
//
//  public void put(int key, int value) {
//
//    ticks++;
//    if (lru.size() < maxCapacity) {
//      lru.add(key);
//      keyValPair.put(key, value);
//      valTicksPair.put(key, ticks);
//      return;
//    }
//
//    if (lru.contains(key)) {
//      keyValPair.put(key, value);
//      valTicksPair.put(key, ticks);
//      return;
//    }
//
//    int leastUsed = Integer.MIN_VALUE;
//    int minTicks = Integer.MAX_VALUE;
//    for (Map.Entry<Integer, Integer> valTicks : valTicksPair.entrySet()) {
//      if (valTicks.getValue() < minTicks) {
//        minTicks = valTicks.getValue();
//        leastUsed = valTicks.getKey();
//      }
//    }
//
//    lru.remove(leastUsed);
//    keyValPair.remove(leastUsed);
//    valTicksPair.remove(leastUsed);
//
//    lru.add(key);
//    keyValPair.put(key, value);
//    valTicksPair.put(key, ticks);
//  }

  private DoubleListNode head;
  private DoubleListNode tail;

  private Map<Integer, DoubleListNode> keyNodeAddressMap;
  private int maxCapacity;

  LRUCache(int capacity) {
    head = new DoubleListNode();
    tail = new DoubleListNode();

    head.prev = null;
    head.next = tail;

    tail.next = null;
    tail.prev = head;

    keyNodeAddressMap = new HashMap<>(capacity);
    maxCapacity = capacity;
  }

  int get(int key) {
    if (!keyNodeAddressMap.containsKey(key))
      return -1;

    DoubleListNode node = keyNodeAddressMap.get(key);
    moveToHead(node);
    return node.val;
  }

  private void moveToHead(DoubleListNode node) {
    removeNode(node);
    addToHead(node);
  }

  void put(int key, int value) {
    if (keyNodeAddressMap.containsKey(key)) {
      DoubleListNode node = keyNodeAddressMap.get(key);
      node.val = value;
      moveToHead(node);
      return;
    }

    DoubleListNode node = new DoubleListNode();
    node.key = key;
    node.val = value;

    keyNodeAddressMap.put(key, node);
    addToHead(node);

    if (keyNodeAddressMap.size() > maxCapacity) {
      keyNodeAddressMap.remove(tail.prev.key);
      removeNode(tail.prev);
    }
  }

  private void addToHead(DoubleListNode node) {
    node.prev = head;
    node.next = head.next;

    head.next.prev = node;
    head.next = node;
  }

  private void removeNode(DoubleListNode node) {
    DoubleListNode prevNode = node.prev;
    DoubleListNode nextNode = node.next;
    prevNode.next = nextNode;
    nextNode.prev = prevNode;
  }
}

package leetcode;

import java.util.*;

/**
 * Created by nikoo28 on 7/6/19 7:44 PM
 */

public class LRUCache {

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

  DoubleListNode head, tail;
  Map<Integer, DoubleListNode> keyAddressMap;
  int maxCapacity;

  public LRUCache(int capacity) {
    keyAddressMap = new HashMap<>(capacity);
    maxCapacity = capacity;
    head = new DoubleListNode();
    head.prev = null;
    tail = new DoubleListNode();
    tail.next = null;
    head.next = tail;
    tail.prev = head;
  }

  public int get(int key) {

    if (!keyAddressMap.containsKey(key))
      return -1;

    DoubleListNode node = keyAddressMap.get(key);
    moveToHead(node);
    return node.val;
  }

  private void moveToHead(DoubleListNode node) {
    removeNode(node);
    addToHead(node);
  }

  public void put(int key, int value) {

    if (keyAddressMap.containsKey(key)) {
      DoubleListNode node = keyAddressMap.get(key);
      node.val = value;
      moveToHead(node);
      return;
    }

    DoubleListNode node = new DoubleListNode();
    node.key = key;
    node.val = value;

    keyAddressMap.put(key, node);
    addToHead(node);

    if (keyAddressMap.size() > maxCapacity) {
      keyAddressMap.remove(tail.prev.key);
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

    // If middle node
    DoubleListNode prevNode = node.prev;
    DoubleListNode nextNode = node.next;
    prevNode.next = nextNode;
    nextNode.prev = prevNode;
  }

  public static void main(String[] args) {

    LRUCache cache = new LRUCache(2 /* capacity */);

//    cache.get(2);
//    cache.put(2,6);
//    cache.get(1);
//    cache.put(1,5);
//    cache.put(1,2);
//    cache.get(1);
//    cache.get(2);

    cache.put(1, 1);
    cache.put(2, 2);
    cache.get(1);       // returns 1
    cache.put(3, 3);    // evicts key 2
    cache.get(2);       // returns -1 (not found)
    cache.put(4, 4);    // evicts key 1
    cache.get(1);       // returns -1 (not found)
    cache.get(3);       // returns 3
    cache.get(4);       // returns 4

  }

}

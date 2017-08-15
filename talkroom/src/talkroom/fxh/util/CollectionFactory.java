package talkroom.fxh.util;



import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import gnu.trove.list.linked.TLinkedList;
import gnu.trove.map.hash.THashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.set.hash.THashSet;

/**
 * <a href="CollectionFactory.java.html"><b><i>View Source</i></b></a>
 *
 * @author  Brian Chan
 * @version $Revision: 1.3 $
 *
 */
public class CollectionFactory {

  static boolean trove = true;

  static {
    if (System.getProperty("trove").equalsIgnoreCase("true"))
      trove = true;
  }

  public static Map getHashMap() {
    if (trove) {
      return new THashMap();
    } else {
      return new HashMap();
    }
  }

  public static TIntObjectHashMap getHashMap2() {
      return new TIntObjectHashMap();
  }



  public static Map getHashMap(int capacity) {
    if (trove) {
      return new THashMap(capacity);
    } else {
      return new HashMap(capacity);
    }
  }

  public static Set getHashSet() {
    if (trove) {
      return new THashSet();
    } else {
      return new HashSet();
    }
  }

  public static Set getHashSet(int capacity) {
    if (trove) {
      return new THashSet(capacity);
    } else {
      return new HashSet(capacity);
    }
  }

  public static List getLinkedList() {
    if (trove) {
      return new TLinkedList();
    } else {
      return new LinkedList();
    }
  }

}
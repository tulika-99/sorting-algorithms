class HeapSort {
  static void sort(List<Comparable> pq) {
    int N = pq.length;
    for (int k = (N / 2).toInt(); k >= 1; k--) {
      _sink(pq, k, N);
    }

    while (N > 1) {
      _exch(pq, 1, N--);
      _sink(pq, 1, N);
    }
  }

  //Helper functions to restore the heap invariant.
  static void _sink(List<Comparable> pq, int k, int N) {
    while (2 * k <= N) {
      int j = 2 * k;
      if (j < N && _lessWithComparable(pq, j, j + 1)) {
        j++;
      }

      if (!_lessWithComparable(pq, k, j)) {
        break;
      }

      _exch(pq, k, j);
      k = j;
    }
  }

  //Helper functions for comparisons and swaps.
  //Indices are "off-by-one" to support 1-based indexing.
  static bool _lessWithComparable(List<Comparable> pq, int i, int j) {
    return pq[i - 1].compareTo(pq[j - 1]) < 0;
  }

  static void _exch(List pq, int i, int j) {
    var swap = pq[i - 1];
    pq[i - 1] = pq[j - 1];
    pq[j - 1] = swap;
  }

  // is v < w ?
  static bool _less(Comparable v, Comparable w) {
    return (v.compareTo(w) < 0);
  }

  // Check if array is sorted - useful for debugging
  static bool _isSorted(List<Comparable> a) {
    for (int i = 1; i < a.length; i++) {
      if (_less(a[i], a[i - 1])) {
        return false;
      }
    }

    return true;
  }

  // print to standard output
  static show(List<Comparable> a) {
    for (int i = 0; i < a.length; i++) {
      print(a[i]);
    }
  }
}

class Shell {
  // sort the list a in acending order using ShellSort
  static void sort(List<Comparable> a) {
    int N = a.length;

    // 3x+1 increment sequenece: 1, 4, 13, 40, 121, 364, 1093, ...
    int h = 1;
    while (h < (N / 3).toInt()) {
      h = 3 * h + 1;
    }

    while (h >= 1) {
      // h-sort the list
      for (int i = h; i < N; i++) {
        for (int j = i; j >= h && _less(a[j], a[j - h]); j -= h) {
          _exch(a, j, j - h);
        }
      }
      assert(_isHsorted(a, h));
      h = (h / 3).toInt();
    }

    assert(_isSorted(a));
  }
  //
  // Helper sorting functions
  //

  // is v < w ?
  static bool _less(Comparable v, Comparable w) {
    return (v.compareTo(w) < 0);
  }

  // is v < w ?
  static bool _lessWithComparer(var c, Object v, Object w) {
    return (c.compareTo(v, w) < 0);
  }

  // exchange a[i] and a[j]
  static void _exch(List a, int i, int j) {
    var swap = a[i];
    a[i] = a[j];
    a[j] = swap;
  }

  //
  // Check list is sorted - useful for debugging
  //
  // is the list sorted
  static bool _isSorted(List<Comparable> a) {
    return _isSortedInRange(a, 0, a.length - 1);
  }

  // is the list sorted from a[lo] to a[hi]
  static bool _isSortedInRange(List<Comparable> a, int lo, int hi) {
    for (int i = lo + 1; i <= hi; i++) {
      if (_less(a[i], a[i - 1])) {
        return false;
      }
    }

    return true;
  }

  // is the list h-sorted?
  static bool _isHsorted(List<Comparable> a, int h) {
    for (int i = h; i < a.length; i++) {
      if (_less(a[i], a[i - h])) {
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

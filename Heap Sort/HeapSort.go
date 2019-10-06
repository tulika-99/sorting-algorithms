package main

import "fmt"

type MaxHeap struct {
    slice    []int
    heapSize int
}

func BuildMaxHeap(slice []int) MaxHeap {
    h := MaxHeap{slice: slice, heapSize: len(slice)}
    for i := len(slice) / 2; i >= 0; i-- {
        h.MaxHeapify(i)
    }
    return h
}

func (h MaxHeap) MaxHeapify(i int) {
    l, r := 2*i+1, 2*i+2
    max := i

    if l < h.size() && h.slice[l] > h.slice[max] {
        max = l
    }
    if r < h.size() && h.slice[r] > h.slice[max] {
        max = r
    }
    //log.Printf("MaxHeapify(%v): l,r=%v,%v; max=%v\t%v\n", i, l, r, max, h.slice)
    if max != i {
        h.slice[i], h.slice[max] = h.slice[max], h.slice[i]
        h.MaxHeapify(max)
    }
}

func (h MaxHeap) size() int { return h.heapSize } // ???

func heapSort(slice []int) []int {
    h := BuildMaxHeap(slice)
    //log.Println(slice)
    for i := len(h.slice) - 1; i >= 1; i-- {
        h.slice[0], h.slice[i] = h.slice[i], h.slice[0]
        h.heapSize--
        h.MaxHeapify(0)
    }
    return h.slice
}

func main() {
    s := []int{4, 1, 3, 2, 16, 9, 10, 14, 8, 7}
    h := BuildMaxHeap(s)
    fmt.Println(h)

    s = heapSort(s)
    fmt.Println(s)
}

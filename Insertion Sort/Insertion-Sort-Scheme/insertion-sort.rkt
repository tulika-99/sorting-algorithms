#lang plai

(define (insert item arr)
  (if(null? arr)
     (cons item '())
     (if(< item (car arr))
        (cons item arr)
        (cons (car arr) (insert item (cdr arr))))))

(define (insertion-sort arr)
  (if(null? arr) arr
     (insert (car arr) (insertion-sort (cdr arr)))))
(ns grokking-algorithms.simple-search)

;; The following implementation uses tail recursion and throws a StackOverflowError after several thousand iterations.
;; For an alternative tail-call-optimized (TCO) approach, refer to
;; http://clojure.org/functional_programming#Functional%20Programming--Recursive%20Looping

;(defn simple-search
;  [arr x]
;  (letfn [(iter [i]
;            (if (>= i (- (count arr) 1)) "not found"
;              (if (== (nth arr i) x) i
;                (iter (+ i 1)))))]
;    (iter 0)))

(defn simple-search
  [arr x]
  (loop [i 0]
    (if (> i (- (count arr) 1)) "not found"
      (if (== (nth arr i) x) i
        (recur (+ i 1))))))
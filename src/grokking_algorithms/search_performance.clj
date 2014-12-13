(ns grokking-algorithms.search-performance
  (:require [grokking-algorithms.simple-search :refer :all]
            [grokking-algorithms.binary-search :refer :all]))

(use 'criterium.core)

(quick-bench (simple-search (range 1000) 0)) ; 292.253579 µs
(quick-bench (binary-search (range 1000) 0)) ; 340.940776 µs

(quick-bench (simple-search (range 1000) 999)) ; 137.817416 ms
(quick-bench (binary-search (range 1000) 999)) ; 786.175362 µs

(quick-bench (simple-search (range 10000) 9999)) ; 16.634163 sec
(quick-bench (binary-search (range 10000) 9999)) ; 10.259892 ms
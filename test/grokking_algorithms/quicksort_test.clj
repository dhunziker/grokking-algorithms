(ns grokking-algorithms.quicksort-test
  (:require [clojure.test :refer :all]
            [grokking-algorithms.quicksort :refer :all]))

(deftest sort-small-vector
  (testing "(5 3 6 2 10) should be sorted to (2 3 5 6 10)"
           (is (= (vector 2 3 5 6 10) (quicksort (vector 5 3 6 2 10))))))

(run-tests 'grokking-algorithms.quicksort-test)
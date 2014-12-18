(ns grokking-algorithms.selection-sort-test
  (:require [clojure.test :refer :all]
            [grokking-algorithms.selection-sort :refer :all]))

(deftest found-smallest
  (testing "2 should be the smallest element"
           (is (= 3 (find-smallest (vector 5 3 6 2 10))))))

(deftest found-smallest-negative
  (testing "-1 should be the smallest element"
           (is (= 0 (find-smallest (vector -1 3 6 2 10))))))

(deftest sort-small-vector
  (testing "(5 3 6 2 10) should be sorted to (2 3 5 6 10)"
           (is (= (vector 2 3 5 6 10) (selection-sort (vector 5 3 6 2 10))))))

(run-tests 'grokking-algorithms.selection-sort-test)
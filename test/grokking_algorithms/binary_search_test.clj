(ns grokking-algorithms.binary-search-test
  (:require [clojure.test :refer :all]
            [grokking-algorithms.binary-search :refer :all]))

(deftest not-found-too-low
  (testing "0 should not be found in range of 1..5"
           (is (= "not found" (binary-search (vec (range 1 6)) 0)))))

(deftest not-found-too-high
  (testing "6 should not be found in range of 1..5"
           (is (= "not found" (binary-search (vec (range 1 6)) 6)))))

(deftest not-found-negative
  (testing "-1 should not be found in range of 1..5"
           (is (= "not found" (binary-search (vec (range 1 6)) -1)))))

(deftest found-in-range
  (testing "1..5 should be found in range of 1..5"
           (doseq [x (range 1 6)]
             (is (= (- x 1) (binary-search (vec (range 1 6)) x))))))

(run-tests 'grokking-algorithms.binary-search-test)
(ns grokking-algorithms.simple-search-test
  (:require [clojure.test :refer :all]
            [grokking-algorithms.simple-search :refer :all]))

(deftest not-found-too-low
  (testing "0 should not be found in range of 1..5"
           (is (= "not found" (simple-search (range 1 6) 0)))))

(deftest not-found-too-high
  (testing "6 should not be found in range of 1..5"
           (is (= "not found" (simple-search (range 1 6) 6)))))

(deftest not-found-negative
  (testing "-1 should not be found in range of 1..5"
           (is (= "not found" (simple-search (range 1 6) -1)))))

(deftest found-in-range
  (testing "1..5 should be found in range of 1..5"
           (doseq [x (range 1 6)] 
             (is (= (- x 1) (simple-search (range 1 6) x))))))

(run-tests 'grokking-algorithms.simple-search-test)

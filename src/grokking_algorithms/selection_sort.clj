(ns grokking-algorithms.selection-sort)

(defn selection-sort
  [list]
  )

(defn find-smallest
  [list]
  (loop [smallest (nth list 0)
         smallest_index 0
         i 0]
    (cond 
      (== i (count list)) smallest_index
      (< (nth list i) smallest) (recur (nth list i) i (+ i 1))
      :else (recur smallest smallest_index (+ i 1)))))
(ns grokking-algorithms.selection-sort)

(use '[clojure.string :only (join split)])

(defn find-smallest
  [arr]
  (loop [smallest (nth arr 0)
         smallest_index 0
         i 0]
    (cond
      (== i (count arr)) smallest_index
      (< (nth arr i) smallest) (recur (nth arr i) i (+ i 1))
      :else (recur smallest smallest_index (+ i 1)))))

(defn selection-sort
  [arr]
  (loop
    [newArr []
     copy arr]
    (if (== (count newArr) (count arr)) newArr
      (let [smallest (find-smallest copy)]
        (recur
          (vec (conj newArr (nth copy smallest)))
          (vec (concat (subvec copy 0 smallest) (subvec copy (+ smallest 1) (count copy)))))))))

(selection-sort [5 3 6 2 10])
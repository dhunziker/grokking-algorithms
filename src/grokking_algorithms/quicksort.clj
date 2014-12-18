(ns grokking-algorithms.quicksort)

(defn quicksort
  [arr]
  (if (<= (count arr) 1)
    arr
    (let [pivot (nth arr 0)
          less (filterv #(<= % pivot) (subvec arr 1))
          greater (filterv #(> % pivot) (subvec arr 1))]
      (vec (concat (quicksort less) [pivot] (quicksort greater))))))
(ns grokking-algorithms.binary-search)

(defn binary-search
  [list x]
  (loop [low 0
         high (- (count list) 1)] 
    (if (> low high) "not found"
      (let [mid (quot (+ low high) 2) 
            guess (nth list mid)]
        (cond 
          (== guess x) mid
          (>= guess x) (recur low (- mid 1))
          :else (recur (+ mid 1) high))))))
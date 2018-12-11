(ns com.pgrech2.aoc.day1)

(defn frequency [changes]
  (apply + changes))


(defn exercise []
  (let [tc1 [1 1 1]
        tc2 [1 1 -2]
        tc3 [-1 -2 -3]]
    (map (partial frequency) [tc1 tc2 tc3])))

(ns com.pgrech2.aoc.day2)


(defn find-boxes [boxids]
  (->> (frequencies boxids)
       (filter (comp #{2 3} last))))

(defn checksum [input]
  (->> (map find-boxes input)
       (keep seq)
       (mapcat (comp set (partial map (partial last))))
       (group-by identity)
       (map (comp count last))
       (apply *)))


;; Messy Solution, can definitely be refactored a bit
(defn exercise []
  (let [input [["a" "b" "c" "d" "e" "f"]
               ["b" "a" "b" "a" "b" "c"]
               ["a" "b" "b" "c" "d" "e"]
               ["a" "b" "c" "c" "c" "d"]
               ["a" "a" "b" "c" "d" "d"]
               ["a" "b" "c" "d" "e" "e"]
               ["a" "b" "a" "b" "a" "b"]]]
    (checksum input)))

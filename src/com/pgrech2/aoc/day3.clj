(ns com.pgrech2.aoc.day3)

;; (def rec1 [[x y] [width height]])
(def rec1 [[1 1] [2 2]])
(def rec2 [[2 2] [2 2]])

(defn xcoords [[[x y] [width height]]]
  [x (+ x width)])

(defn ycoords [[[x y] [width height]]]
  [y (+ y height)])

(defn overlapping [rec1 rec2]
  (let [rec1 1]))

(defn execute [x y]
  (+ x y))

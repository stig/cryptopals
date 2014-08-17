(ns cryptopals.core)

(def hex-chars (vec "0123456789abcdef"))

(defn combine-hex
  "Combine two hex values"
  [a & b]
  (if (seq b)
    (recur (+ (* a 16) (first b)) (rest b))
    a))

(defn hex->bytes
  "Convert a hex string to a sequence of bytes"
  [hex]
  (->> hex
       (map #(.indexOf hex-chars %))
       (partition-all 2)
       (map #(apply combine-hex %))
       (map byte)))



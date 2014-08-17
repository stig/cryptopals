(ns cryptopals.core)

(def hex-chars (vec "0123456789abcdef"))

(defn combine-hex
  "Combines individual hex digits"
  [a & b]
  (if (seq b)
    (recur (+ (* a 16) (first b)) (rest b))
    a))

(defn hex->bytes
  "Convert a hex string to a sequence of bytes"
  [hex]
  (byte-array (->> hex
                   (map #(.indexOf hex-chars %))
                   (partition-all 2)
                   (map #(apply combine-hex %)))))

(defn bytes->str
  "Convert a sequence of bytes to a string"
  [bytes]
  (->> bytes
       (map char)
       (apply str)))
       



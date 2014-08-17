(ns cryptopals.core-test
  (:require [clojure.test :refer :all]
            [cryptopals.core :refer :all]))

(deftest hex-to-base64
  (testing "hex to bytes"
    (is (= (hex->bytes "ff0055")
           [255 0 85]))))

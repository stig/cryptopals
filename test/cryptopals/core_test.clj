(ns cryptopals.core-test
  (:require [clojure.data.codec.base64 :as b64]
            [clojure.test :refer :all]
            [cryptopals.core :refer :all]))

(deftest hex-to-base64
  (testing "hex to bytes"
    (is (= (vec (hex->bytes "ff0055"))
           [-1 0 85])))
  (testing "hex to base64"
    (is (= (bytes->str (b64/encode (hex->bytes "49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d")))
           "SSdtIGtpbGxpbmcgeW91ciBicmFpbiBsaWtlIGEgcG9pc29ub3VzIG11c2hyb29t"))))

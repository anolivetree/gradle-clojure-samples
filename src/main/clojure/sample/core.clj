(ns sample.core
  (:require [clojure.java.io :as io]
            [org.httpkit.client :as http]
            ))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn bar []
  (http/get "http://www.yahoo.com")
  (println (slurp (io/resource "sample.txt"))))

(ns first-clojure.core
	(:gen-class))
(defn -main [& args]
	(println "Hello, World! This is what you told me: " (first args)))
(defn -first
  "Takes the first element of a vector and returns it"
  ([list] (nth list 1)))

(ns lab-5-fp.core)
(use 'clojure.pprint)
(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn encrypt [x key]
  (let [text (clojure.string/replace x #"\s" "_")
        textv (clojure.string/split text #"")
        colcount (count x)
        card (make-array String key colcount)
        cipher (make-array String colcount)
        rowcounter 0 ] 
    
  )
)
  

(defn decrypt [cipher key] (print cipher ))


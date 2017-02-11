(ns cloj-env-test.core
  (:require [ring.adapter.jetty :refer [run-jetty]]
            ))

(defn-
  format-map
  "Given a map, formats it so that it's human readable in the browser"
  {:added "0.1.0"}
  [hmap]
  (let [the-keys (keys hmap)
        pretty (reduce #(str %1 "\n" %2 ": " (get hmap %2)) "{" the-keys)]
    (str pretty "\n}")))

(defn
  route-handler
  "Handler for HTTP requests to the server"
  {:added "0.1.0"}
  [request]
  (let [env (System/getenv)]
    {
     :headers { "Content-type" "text/html" }
     :body (str "<pre>" (format-map (into {} env)) "</pre>")
     }))

(defn
  -main
  "Entry point when running the jar file"
  {:added "0.1.0"}
  []
  (run-jetty route-handler { :port 80 :host "0.0.0.0"}))

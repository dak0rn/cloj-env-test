(defproject cloj-env-test "0.1.0"
  :description "A simple web server that prints the environment variables"
  :license {:name "Apache-2.0"}
  :main cloj-env-test.core
  :uberjar-name "cloj-env-test.jar"
  :profiles { :uberjar { :aot :all }}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.5.0"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler cloj-env-test.core/route-handler
         :port 80
         :host "0.0.0.0"})

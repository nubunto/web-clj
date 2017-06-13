(defproject web-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.1"]
                 [ring/ring-defaults "0.2.1"]
                 [aleph "0.4.4-alpha3"]
                 [org.clojure/core.async "0.3.443"]
                 [hiccup "1.0.5"]]
  :main web-clj.main
  :profiles
  {:uberjar {:aot :all}})

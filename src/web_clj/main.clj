(ns web-clj.main
  (:require [aleph.http :as http]
            [aleph.netty]
            [compojure.handler :refer [site]]
            [web-clj.handler :refer [app]])
  (:gen-class))

(defn -main
  [& args]
  (let [handler (site app)]
    (println "starting server @ :8080 ...")
    (http/start-server handler {:port 8080})))

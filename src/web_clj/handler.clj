(ns web-clj.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [web-clj.views :as views]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] views/welcome-page)
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
